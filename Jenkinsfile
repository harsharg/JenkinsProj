pipeline {
  agent any
   environment {
    Test = 'Prod'
  }
  stages {
        stage('Test') {
            steps {
               script
               {
                 def name = 'John'
                 echo "Hello, $name"  // Output: Hello, John (interpolated)
               }
            }
        }
    }
    post {
        always {
          echo ' success'
        }
    }
  
  // stages {
  //   stage('Stage1') {
  //     parallel {
  //       stage('Stage2') {
  //         steps {
  //           waitForBuild(propagate: true, runId: '20')
  //           warnError(message: 'Catching')
  //         }
  //       }

  //       stage('Stage3') {
  //         steps {
  //           sleep 20
  //         }
  //       }

  //     }
  //   }

  //   stage('Stage2') {
  //     steps {
  //       echo 'Hello'
  //     }
  //   }

  // }
 
}
