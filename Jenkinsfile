pipeline {
    agent any

    stages {
        stage ('Compile Stage'){
            steps {
                withGradle {
                    sh './gradlew build'
                }
            }
        }

        stage ('Testing Stage'){
            steps {
                withGradle {
                    sh './gradlew test'
                }
            }
        }

        stage ('War Stage'){
            steps {
                withGradle {
                    sh './gradlew war'
                }
            }
        }
    }
}