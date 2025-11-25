pipeline {
  agent any
  stages {
    stage('Stage1') {
      parallel {
        stage('Stage1') {
          steps {
            waitForBuild(propagate: true, runId: '20')
            warnError(message: 'Catching')
          }
        }

        stage('Stage3') {
          steps {
            sleep 20
          }
        }

      }
    }

    stage('Stage2') {
      steps {
        echo 'Hello'
      }
    }

  }
  environment {
    Test = 'Prod'
  }
}