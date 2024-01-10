package com.discoverycore.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GlobalFilter extends AbstractGatewayFilterFactory<GlobalFilter.Config> {

    public GlobalFilter(){
        super(Config.class);
    }

    /**dis
     * Predicate : 요청정보가 들어왔을 때 어떤 것인지 판단.
     * Pre Filter : 어떤 작업이 이루어지기 전 (사전 필터)
     * Post Filter :  어떤 작업이 이루어 진 후 필터
     * @param config
     * @return
     */
    @Override
    public GatewayFilter apply(Config config) {

        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("GatewayFilter getBaseMessage id -> {}", config.getBaseMessage());

            if (config.isPreLogger()) {
                log.info("GatewayFilter getId-> {}", request.getId());
            }
            // Custom Post Filter, Mono : 단일 비동기 방식
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                // 함수만 출력해서 확인작업
                if (config.postLogger) {
                    log.info(" GatewayFilter response code -> {} ", response.getStatusCode());
                }
            }));
        };
    }
    @Data
    public static class Config{
        private String baseMessage;
        private boolean preLogger;
        private boolean postLogger;

    }
}

