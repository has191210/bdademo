FROM java:8
ADD target/bdashwebserver-0.0.1.jar /docker/bdashwebserver/bdashwebserver-0.0.1.jar
EXPOSE 8080
WORKDIR /docker/bdashwebserver/
CMD ["java", "-jar", "bdashwebserver-0.0.1.jar"]
