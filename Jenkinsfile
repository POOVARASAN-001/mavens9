pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
