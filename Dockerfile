FROM openjdk:8
EXPOSE 8080
ADD target/DemoHibb-0.0.1-SNAPSHOT.jar DemoHibb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DemoHibb-0.0.1-SNAPSHOT.jar"]
