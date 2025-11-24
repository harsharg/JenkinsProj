// pipeline {
//     agent any  // Use any available agent for this pipeline (you can specify a label if needed)
    
//     environment {
//         // Path to Docker executable (adjust if necessary for your environment)
//         DOCKER_PATH = '"C:\\Program Files\\Docker\\Docker\\resources\\bin\\docker.exe"'  // Modify based on your Docker installation path
//     }

//     stages {
//         stage('Checkout Code') {
//             steps {
//                 checkout scm  // Checkout the code from the repository
//             }
//         }

//         stage('Build Docker Image') {
//             steps {
//                 script {
//                     // Run Docker build command
//                     // Make sure the Docker file is present in the root of your repository
//                     echo 'Building Docker image...'
//                     bat """${DOCKER_PATH} build -t my-image:${BUILD_ID} ."""
//                 }
//             }
//         }

//         stage('Run Docker Container') {
//             steps {
//                 script {
//                     // Run a container from the built image
//                     echo 'Running Docker container...'
//                     bat """${DOCKER_PATH} run --rm my-image:${BUILD_ID} /bin/bash -c "echo Hello from Docker container!" """
//                 }
//             }
//         }

//         stage('Push Docker Image') {
//             steps {
//                 script {
//                     // Optional: Push Docker image to a registry (e.g., Docker Hub)
//                     echo 'Pushing Docker image to registry...'
//                     bat """${DOCKER_PATH} push my-image:${BUILD_ID}"""
//                 }
//             }
//         }
//     }

//     post {
//         always {
//             // Cleanup workspace after the job is finished
//             cleanWs()
//         }
//     }
// }


// pipeline {
//     agent any

//     environment {
//         BRANCH_NAME = 'master'
//     }

//     stages {
//         stage('Build') {
//             steps {
//                 echo 'Building project...'
//             }
//         }

//         stage('Deploy') {
//             steps {
//                 script {
//                     if (env.BRANCH_NAME == 'master') {
//                         echo 'Deploying to production environment because we are on the master branch.'
//                     } else {
//                         echo 'Deploying to a different environment because we are not on master.'
//                     }
//                 }
//             }
//         }
//     }

//     post {
//         always {
//             echo 'Cleaning up after the pipeline.'
//         }
//     }
// }



// pipeline {
//     agent any

//     stages {
//         stage('Build') {
//             steps {
//                 echo 'Building the project...'
//             }
//         }

//         stage('Deploy to Production') {
//             when {
//                 branch 'master'  // Only run this stage for the 'master' branch
//             }
//             steps {
//                 echo 'Deploying to production...'
//             }
//         }

//         stage('Deploy to Staging') {
//             when {
//                 branch 'develop'  // Only run this stage for the 'develop' branch
//             }
//             steps {
//                 echo 'Deploying to staging...'
//             }
//         }
//     }

//     post {
//         always {
//             echo 'Cleaning up...'
//         }
//     }
// }

// pipeline {
//     agent any
//     //stages {
//         stage('Example ') {
//             input {
//                 message "Should we continue?"
//                 ok "Yes, we should."
//                 submitter "alice,bob"
//                 parameters {
//                     string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
//                 }
//             }
//             steps {
//                 echo "Hello, ${PERSON}, nice to meet you."
//             }
//         }



 pipeline {
    agent any

    environment {
        MY_CREDENTIALS = credentials('bc3fef98-d6fe-424a-a507-91f692f51f51') // Referencing the credentials ID
    }

    stages {
        stage('Example') {
            steps {
                script {
                    // Use the environment variable containing credentials
                    echo "Username: ${MY_CREDENTIALS_USR}"  // Username is accessed using _USR
                    echo "Password: ${MY_CREDENTIALS_PSW}" // Password is accessed using _PSW
                }
            }
        }
    }
}

    



