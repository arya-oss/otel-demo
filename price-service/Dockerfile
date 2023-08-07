FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/price-service-1.0.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/price-service-1.0.jar"]