// vars/sendSlackNotification.groovy
def call(String channel, String message) {
    slackSend(channel: channel, message: message)
}

