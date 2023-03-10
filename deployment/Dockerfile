FROM eclipse-temurin:17
VOLUME "/tmp"

COPY target/devops-products-app-0.1.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]
