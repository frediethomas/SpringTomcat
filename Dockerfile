FROM openjdk:8-jdk-alpine
WORKDIR /demo
COPY InfyBuddy.jar ./demo/InfyBuddy.jar
COPY SpringTomcat.jar ./demo/springtomcat.jar
EXPOSE 8080
EXPOSE 9300
ENTRYPOINT ["java","-javaagent:./demo/InfyBuddy.jar","-jar","./demo/springtomcat.jar"]
