// pipeline {
//   agent any
//    environment {
//     Test = 'Prod'
//   }
//   stages {
//         stage('Test') {
//             steps {
//                script
//                {
//                  def name = 'John'
//                  echo "Hello, $name"  // Output: Hello, John (interpolated)
//                  echo  "${Test}"
//                }
//             }
//         }
//     }
//     post {
//         always {
//           echo ' success'
//         }
//     }
  
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
 
//}



pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    try {
                        echo 'Starting build step...'
                        // Simulate a build process that might fail
                        sh 'exit 1'  // This will fail the build
                    } catch (Exception e) {
                        echo "Build failed: ${e.getMessage()}"
                        currentBuild.result = 'SUCCESS'  // Mark the build as failed
                    }
                }
            }
        }
        stage('Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    echo 'Running tests...'
                    sh 'exit 1'  // Simulate a failure in the test stage
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    post {
        failure {
            echo 'The pipeline has failed.'
        }
        success {
            echo 'The pipeline has completed successfully.'
        }
    }
}

