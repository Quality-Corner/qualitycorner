# Automation Project

### Authors
- Rob Sarro
- Michael Lazo

### Goal
Have a working example of how a QA automation project can be deployed and executed using containers.

### Technologies
- Docker
- Jenkins
    - Download Jenkins.zip from project and unzip on your docker host
    - Run docker container on your docker host with mapped port and storage volumes 
    - docker run -p 8080:8080 -v `<Your Path to Jenkins Folder>`:/var/jenkins_home jenkinsci/blueocean
- Java
- TestNG
- Maven
- REST Assured
- Castle Mock

### Milestones
1. Create base API test framework with REST Assured
2. Create a docker image with Castle Mock configured for mock server responses
4. Create API tests
5. Create docker image with Jenkins and jobs to execute tests
6. Push docker images to public Docker repository
7. Update README with prerequisites and instructions to deploy these docker containers and execute tests.