pipeline {
    agent {
        docker {
            image 'docker:20.10.7-dind'  // Docker-in-Docker image (official)
            label 'dockers-slave'
            args '--privileged -v /var/run/docker.sock:/var/run/docker.sock'  // Mount Docker socket for DinD
        }
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
                    // Build Docker image from Dockerfile in the repo
                    sh 'docker build -t my-image:${BUILD_ID} .'
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    // Run a container from the newly built image
                    sh 'docker run --rm my-image:${BUILD_ID} /bin/bash -c "echo Hello from Docker container!"'
                }
            }
        }
        stage('Push Docker Image to Registry') {
            steps {
                script {
                    // Assuming Docker login is done via Jenkins credentials or Docker Hub credentials are set
                    sh 'docker push my-image:${BUILD_ID}'
                }
            }
        }
    }
    post {
        always {
            // Cleanup (optional)
            cleanWs()  // Clean workspace after the job is finished
        }
    }
}
