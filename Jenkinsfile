pipeline {
  agent any
  stages {
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sh 'echo \'test sh\''
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