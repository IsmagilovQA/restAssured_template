node {

    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'e451111111111111111111111', // id from jenkins Credentials section (appears after adding login/password from github)
        url: 'https://github.com/IsmagilovQA/restAssured_template.git'
    }

    stage("check errors while compiling") {
        sh "./gradlew clean assemble"
    }

    stage("run api tests") {
        sh "./gradlew clean test"  // run all tests in the project
    }



}