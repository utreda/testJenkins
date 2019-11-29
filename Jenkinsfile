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

        stage('error') {
          steps {
            sh 'mvn test'
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