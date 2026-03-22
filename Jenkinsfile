pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                // Pour un projet Java avec Maven, on utilise cette commande :
                // sh 'mvn test'
                
                // Mais pour un projet simple comme le tien, on peut compiler et exécuter les tests manuellement
                bat 'javac -cp "lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" src/MainFrame.java src/Main.java test/MainFrameTest.java'
                bat 'java -cp "lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;src;test" org.junit.runner.JUnitCore MainFrameTest'
            }
        }
    }
}
