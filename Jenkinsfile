pipeline {
  agent {
    docker {
      image 'node:ts-alpine'
      args '-p 3000:3000'
    }

  }
  stages {
    stage('test') {
      steps {
        sh 'ls'
      }
    }

    stage('deploy') {
      steps {
        sh 'ls'
      }
    }

  }
}