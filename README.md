# Automation Project

### Authors
- Rob Sarro
- Michael Lazo

### Goal
Have a working example of how a QA automation project can be deployed and executed using containers.

### Technologies
- Docker
- Jenkins
    - Folder structure used for running docker container with persistent data.
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

### Getting Environment Started
1. Docker Host should have docker & docker-compose installed
2. Create Automation_Project directory
3. Create Automation_Project/jenkins directory
4. Create Automation_Project/castlemock directory
5. Download project Jenkins directory and Castlemock directory and copy to newly created folders on the docker host
6. Download docker-compose.yml from src/main/java resources and copy to docker host Automation_Project folder
7. Update docker-compose.yml with your docker host's automation project jenkins and castlemock paths
8. Navigate to you Automation Project
9. Run docker command <docker-compose up>
10. On Docker host, verify both containers have started (Jenkins, and Castlemock)
11. Jenkins server can be reached at <docker host IP:8080>
12. Castlemock can be reached at <docker host ip:8081/castlemock>