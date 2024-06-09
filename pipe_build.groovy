pipeline {
    agent any

    stages {
        stage('information about file system disks') {
            steps {
                sh(script: 'df -h')
            }
        }
    }
}