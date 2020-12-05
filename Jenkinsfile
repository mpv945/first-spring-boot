pipeline {
  agent {
    docker {
      image 'node:lts-alpine'
      args '-p 3000:3000'
    }

  }
  stages {
    stage('test') {
      steps {
        sh 'pwd'
        sh 'npm -v'
      }
    }

    stage('deploy') {
      steps {
        sh 'pwd'
        sh 'node -v'
      }
    }

  }
}
