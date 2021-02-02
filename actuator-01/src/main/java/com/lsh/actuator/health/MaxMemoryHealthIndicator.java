package com.lsh.actuator.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;


@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {
    private static final Logger logger = LoggerFactory.getLogger(MaxMemoryHealthIndicator.class);
    @Override
    public Health health() {
//        logger.info(String.valueOf(Runtime.getRuntime().maxMemory()));
//        logger.info(String.valueOf(Runtime.getRuntime().totalMemory()));
//        logger.info(String.valueOf(Runtime.getRuntime().freeMemory()));
        Status status = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024) ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }

}
