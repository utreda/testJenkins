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
            sh 'mvn --version'
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