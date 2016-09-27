FROM java:8
ADD /var/jenkins_home/workspace/Test/target/bdashwebserver-0.0.1.jar /docker/bdashwebserver/
EXPOSE 8080
WORKDIR /docker/bdashwebserver/
CMD ["java", "-jar", "bdashwebserver-0.0.1.jar"]
