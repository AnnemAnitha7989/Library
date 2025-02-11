def call(String branch = 'main') {
    // Define the repository URL
    def repoUrl = 'https://github.com/AnnemAnitha7989/Library.git'
    
    echo "Cloning repository ${repoUrl} at branch ${branch}"

    checkout([
        $class: 'GitSCM',  // Git plugin to perform the clone
        branches: [[name: "*/${branch}"]],  // Specify the branch (default is 'main')
        userRemoteConfigs: [[url: repoUrl]]  // Set the URL for the repository
    ])
}

