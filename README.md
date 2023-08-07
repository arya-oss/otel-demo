## Spring Boot + OpenTelemetry + Jaeger + Prometheus + Grafana

This is a sample project to demonstrate how to use OpenTelemetry with Spring Boot, Jaeger, Prometheus and Grafana.

### Prerequisites
- Java 11
- Docker
- Docker Compose
- Maven
- Git
- cURL

### How to run
1. Clone this repository
2. Run `mvn clean package` to build the project
3. Run `docker-compose up -d` to start the services
4. Run `curl http://localhost:8080/api/product/1` to generate some traces
5. Open `http://localhost:16686` to see the traces in Jaeger
6. Open `http://localhost:3000` to see the metrics in Grafana
7. Login to Grafana with `admin` as username and password
8. Add a new Prometheus data source with URL `http://prometheus:9090`
9. Import the dashboard `4701` from Grafana
10. Open the dashboard and see the metrics
11. Run `docker-compose down` to stop the services