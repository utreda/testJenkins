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
      }
    }

    stage('fini') {
      steps {
        echo 'Builds finis!'
      }
    }

  }
}
