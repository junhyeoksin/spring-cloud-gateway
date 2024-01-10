# keystorm-Discovery
Discovery Service spring-cloud MSA
클라우드 네이트브 아키텍처에서 디스커버리 서비스에 해당하는 부분을 구현하며 공부한 내용입니다.

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



* Keystorm-Discovery
* keystorm-Discovery-Core
