node('sat6-build') {
    stage("Push to Open Platform") {
        withCredentials([string(credentialsId: 'OHSNAP_PSI_WEBHOOK_URL', variable: 'OHSNAP_PSI_WEBHOOK_URL')]) {
            sh "curl -k -XPOST ${OHSNAP_PSI_WEBHOOK_URL}"
	}
    }
}
