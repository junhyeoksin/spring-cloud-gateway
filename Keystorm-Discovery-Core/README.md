# Spring Cloud Gateway Filter 
 * Predicate : 요청정보가 들어왔을 때 어떤 것인지 판단.
 * Pre Filter : 어떤 작업이 이루어지기 전 (사전 필터)
 * Post Filter :  어떤 작업이 이루어 진 후 필터

순서 : 클라이언트 ->  Gateway Handler Mapping -> Predicate -> Pre Filter -> 프로세스 정보 처리 -> Post Filter -> Gateway Handler Mapping -> 클라이언트
Filter 사용 방법 
1. Property (yml file) 
2. Java Code (FilterConfig)
3. Java COde (Custom Filter)
4. Java Code (Global Filter)
5. Java Code (Logging Filter)

순사: Gateway Client -> Gateway Handler -> Global Filter -> Custom Filter -> Logging Filter -> Proxied Service  
우선순위 정의에 따라 변경되기도 함 ( 가장 높음 : HIGHEST_PRECEDENCE ) 


* Keystorm-Discovery
* keystorm-Discovery-Core
