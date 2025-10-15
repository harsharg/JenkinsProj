pipeline {
    agent {
        docker {
                 image 'node:14'
                 label '  '
               } 
    }

    stages {
        stage('Install Dependencies') {
            steps {
                sh 'npm install'
            }
        }

        stage('Build') {
            steps {
                sh 'npm run build'
            }
        }
    }
}
