FROM openjdk:8
COPY target/moviecruiser-0.0.1-SNAPSHOT.jar mysql.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "mysql.jar"]
