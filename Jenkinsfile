pipeline {
    agent any  // Use any available agent for this pipeline (you can specify a label if needed)
    
    environment {
        // Path to Docker executable (adjust if necessary for your environment)
        DOCKER_PATH = '"C:\\Program Files\\Docker\\Docker\\resources\\bin\\docker.exe"'  // Modify based on your Docker installation path
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm  // Checkout the code from the repository
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Run Docker build command
                    // Make sure the Docker file is present in the root of your repository
                    echo 'Building Docker image...'
                    bat """${DOCKER_PATH} build -t my-image:${BUILD_ID} ."""
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    // Run a container from the built image
                    echo 'Running Docker container...'
                    bat """${DOCKER_PATH} run --rm my-image:${BUILD_ID} /bin/bash -c "echo Hello from Docker container!" """
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    // Optional: Push Docker image to a registry (e.g., Docker Hub)
                    echo 'Pushing Docker image to registry...'
                    bat """${DOCKER_PATH} push my-image:${BUILD_ID}"""
                }
            }
        }
    }

    post {
        always {
            // Cleanup workspace after the job is finished
            cleanWs()
        }
    }
}
