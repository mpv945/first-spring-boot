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
        sh 'npm -v'
      }
    }

    stage('deploy') {
      steps {
        sh 'node -v'
      }
    }

  }
}
