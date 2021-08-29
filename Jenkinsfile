node {
    def app
    def branch = scm.branches[0].name.substring(2)
	
    try {
        stage('Clone repository') {
            git branch: branch,
                credentialsId: 'GitHub Credentials',
                url: 'https://github.com/careydevelopment/webclient-commons.git'
        } 	
    } catch (e) {
        echo 'Error occurred during build process!'
        echo e.toString()
        currentBuild.result = 'FAILURE'
    } finally {
    }
}