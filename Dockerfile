FROM openjdk:8-jre-alpine
ADD target/energy-service.jar energy-service.jar

ENTRYPOINT ["java","-jar","connected-cars.jar"]