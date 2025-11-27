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



// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 script {
//                     try {
//                         echo 'Starting build step...'
//                         // Simulate a build process that might fail
//                         sh 'exit 1'  // This will fail the build
//                     } catch (Exception e) {
//                         echo "Build failed: ${e.getMessage()}"
//                         currentBuild.result = 'SUCCESS'  // Mark the build as failed
//                     }
//                 }
//             }
//         }
//         stage('Test') {
//             steps {
//                 catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
//                     echo 'Running tests...'
//                     sh 'exit 1'  // Simulate a failure in the test stage
//                 }
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 echo 'Deploying...'
//             }
//         }
//     }
//     post {
//         failure {
//             echo 'The pipeline has failed.'
//         }
//         success {
//             echo 'The pipeline has completed successfully.'
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
//         stage('Test') {
//             parallel {
//                 stage('Test on Linux') {
//                     steps {
//                         echo 'Running tests on Linux'
//                     }
//                 }
//                 stage('Test on Windows') {
//                     steps {
//                         echo 'Running tests on Windows'
//                     }
//                 }
//             }
//         }
//     }
// }




// pipeline {
//     agent any  // Define no global agent; each matrix part has its own agent
//     stages {
//         stage('Test') {
//             matrix {
//                 axes {
//                     axis {
//                         name 'PLATFORM'
//                         values 'linux', 'mac', 'windows'
//                     }
//                     axis {
//                         name 'BROWSER'
//                         values 'chrome', 'firefox', 'safari'
//                     }
//                 }
//                 stages {
//                     stage('Build and Test') {
//                         steps {
//                             script {
//                                 echo "Building on ${PLATFORM} with ${BROWSER}..."
//                                 // Add actual build/test commands for each combination
//                                 sh "echo 'Running tests on ${PLATFORM} using ${BROWSER}'"
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }



// pipeline {
//     agent any
//     stages {
//         stage('Checkout') {
//             steps {
//                 // Checkout with credentials for Git
//                 scm (
//                      git
//                      {  
//                        url:'https://github.com/myorg/repo', 
//                        credentialsId: 'my-git-credentials'
//                      }
//                 )
//             }
//         }
//     }
// }


pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                scm {
                    git(
                        url: 'https://github.com/myorg/myrepo.git',
                        credentialsId: 'my-git-credentials',
                        branch: 'main'
                    )
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
            }
        }
    }
}



