// vars/userApproval.groovy
def call(String message) {
    input message: message, ok: 'Approve'
}

