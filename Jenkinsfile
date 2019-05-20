pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Build'
      }
    }
    stage('Frontend') {
      steps {
        sh 'echo Frontend'
      }
    }
    stage('Backend') {
      parallel {
        stage('Unit') {
          steps {
            sh 'echo Backend'
          }
        }
        stage('Performence') {
          steps {
            sh 'echo Performence'
          }
        }
      }
    }
    stage('Static analysis') {
      steps {
        sh 'echo Static analysis'
      }
    }
    stage('Deploy') {
      steps {
        sh '''echo Deploy
'''
      }
    }
  }
  environment {
    BOOTSTRAP_SERVERS_CONFIG = '192.168.160.210:8092'
  }
}