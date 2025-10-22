pipeline {
    agent any
    
    environment {
        // Define Docker image name to be used for the container
        DOCKER_IMAGE = 'alpine:latest'  // Example image, you can replace it with any image you want
    }
      tools {
        git 'Default'  // Make sure 'Default' matches the name you configured in Global Tool Configuration
    }


    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    // Pull the Docker image
                    sh "docker pull ${DOCKER_IMAGE}"
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    // Run the Docker container and execute commands inside it
                    sh """
                        docker run --name my-container -d ${DOCKER_IMAGE} /bin/sh -c "echo Hello from Docker Container!"
                    """
                }
            }
        }

        stage('Run Tests in Container') {
            steps {
                script {
                    // Run additional commands, such as tests or scripts, inside the container
                    sh """
                        docker exec my-container /bin/sh -c "echo Running Tests..."
                    """
                }
            }
        }

        stage('Stop and Remove Docker Container') {
            steps {
                script {
                    // Stop and remove the container after use
                    sh 'docker stop my-container'
                    sh 'docker rm my-container'
                }
            }
        }
    }

    post {
        always {
            // Clean up Docker resources even if the pipeline fails
            sh 'docker system prune -f'
        }
    }
}


