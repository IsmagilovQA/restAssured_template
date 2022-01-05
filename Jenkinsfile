node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'e451111111111111111111111', // id from jenkins Credentials section (appears after adding login/password from github)
        url: 'https://github.com/IsmagilovQA/restAssured_template.git'
    }

    stage("check errors while compiling") {
        sh "./gradlew clean assemble"
    }

    stage("run API tests") {
        sh "./gradlew clean test -Dlogging=${LOGGING}"  // run all tests in the project. ${LOGGING} -> parameter in Jenkins
    }

    stage("run UI tests") {
        sh "./gradlew UI-tests:test"  // in case you want to run UI tests after API tests
    }
}