FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/product-service-1.0.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/product-service-1.0.jar"]