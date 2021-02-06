package org.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author bjiang
 * @description: 过滤器
 * @Date 2021/1/4
 */
@Component
public class RateLimitFilter implements GlobalFilter, Ordered {
    private static final Logger logger = LoggerFactory.getLogger(RateLimitFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url=exchange.getRequest().getURI().getPath();
        logger.info("url={}",url);
        return chain.filter(exchange);
    }
    
    @Override
    public int getOrder() {
        return 0;
    }
}
