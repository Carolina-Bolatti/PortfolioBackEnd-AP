FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim
VOLUME /tmp
COPY portfolio-0.0.1-SNAPSHOT.jar /portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-0.0.1-SNAPSHOT.jar"]
