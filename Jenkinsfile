node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'e451111111111111111111111', // id from jenkins Credentials section (appears after adding login/password from github)
        url: 'https://github.com/IsmagilovQA/restAssured_template.git'
    }

    stage("check errors while compiling") {
        sh "./gradlew clean api-test:assemble"
    }

    stage("run API tests in api-test module") {
        sh "./gradlew api-test:test -Dlogging=${LOGGING}"  // run all tests in the project. ${LOGGING} -> parameter in Jenkins
    }

    stage("run UI tests in UI-test module") {
        sh "./gradlew UI-test:test"  // in case you want to run UI tests after API tests
    }

    allure([
        includeProperties: false,
        jdk: '',
        properties: [],
        reportBuildPolicy: 'ALWAYS',
        results: [[path: 'api-test/build/allure-results'], [path: 'ui/build/allure-results']] // in case you have two separate modules in project for API and UI tests
    ])
}