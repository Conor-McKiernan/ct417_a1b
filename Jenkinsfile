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

        stage ('Testing stage'){
            steps {

            }
        }
    }
}