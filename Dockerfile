FROM java:8
EXPOSE 8080
WORKDIR /docker/bdashwebserver/
CMD ["java", "-jar", "bdashwebserver-0.0.1.jar"]
