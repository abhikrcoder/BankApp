FROM amazoncorretto:17-alpine

WORKDIR /opt/app
ADD target/*.jar ./app.jar

EXPOSE 8082 8082
EXPOSE 8080 8081
ENTRYPOINT ["java", "-jar", "app.jar"]