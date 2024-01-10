
# Spring-Cloud-Gateway with Spring Boot 3
project : keystorm-Discovery,  keystorm-Discovery-Core

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

Api GateWay Service
- 사용자가 설정한 라우팅 설정에 따라서 각각 앤드포인트로  클라이언트 대신해서 요청하고  응답을 받으면 클라이언트에 전달해주는 프록시 역활
- 시스템 내부 구조를 숨기고 외부 요청을 적절한 형태로 응답

1. 인증 및 권한 부여
2. 서비스 검색 통합
3. 응답 캐싱
4. 정책, 회로 차단기 및 Qos 다시 시도
5. 속도 제한
6. 부하 분산
7. 로깅, 추적, 상관 관계
8. 헤더, 쿼리 문자열 및 청구 권한
9. Ip 허용 목록에 추가


 

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