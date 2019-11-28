pipeline {
  agent any
  stages {
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'Essai'
          }
        }

        stage('test maven') {
          steps {
            sh '''mvn --version
'''
          }
        }

        stage('error') {
          steps {
            sh 'echo test sh'
          }
        }

      }
    }

    stage('fini') {
      steps {
        echo 'Builds finis!'
      }
    }

  }
}