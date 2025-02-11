def call(String playbook, String environment) {
    // Check if the environment file exists
    if (!fileExists(environment)) {
        error "Environment file ${environment} not found."
    }

    // Run the Ansible playbook
    sh """
    ansible-playbook -i ${environment} ${playbook}
    """
}

