
# Spring-Cloud-Gateway with Spring Boot 3
project : spring-cloud-gateway

This is a project related to the Discovery Service in a Cloud Native architecture, implemented as part of studying Microservices Architecture (MSA).

API Gateway Service

Acts as a proxy that handles requests and forwards responses to clients based on user-configured routing settings.
Hides the internal structure of the system and responds to external requests in an appropriate manner.
Key Features:

Authentication and Authorization:

Manages user access control and permissions.
Service Discovery Integration:

Integrates service discovery within the system.
Response Caching:

Implements caching of responses for improved performance.
Policies, Circuit Breakers, and QoS Retries:

Enforces system policies, implements circuit breakers, and retries with Quality of Service (QoS).
Speed Limiting:

Enforces limitations on request rates.
Load Balancing:

Distributes incoming requests across multiple servers to balance the load.
Logging, Tracing, and Correlation:

Implements logging, tracing, and correlation features for better visibility.
Header, Query String, and Billing Authorization:

Manages and validates headers, query strings, and billing authorizations.
IP Whitelisting:

Adds IPs to the allowed list.
This project was developed as a practical exploration of various aspects of an API Gateway Service within a Cloud Native architecture.



 

# Prerequisites
Java 17+
Spring Boot 3.2.1
Spring Eureka
Spring Cloud 2023.0.0

# Installation
1. clone the repository:
   git clone https://github.com/junhyeoksin/spring-cloud-gateway.git
2. Navigate into the project directory:
   cd keystorm-Discovery
3.    Use Gradle to build the project:
4. You can then run the Spring Boot application using 
5. Repeat this process. ( Core, Service)



Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.