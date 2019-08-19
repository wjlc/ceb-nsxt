FROM openjdk:8-jdk-alpine

EXPOSE 9999
CMD echo "The application will start in 0s..." && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.jar

ADD target/nsxt-0.0.1-SNAPSHOT.jar /app.jar
