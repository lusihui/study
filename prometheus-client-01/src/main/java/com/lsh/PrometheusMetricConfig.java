package com.lsh;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class PrometheusMetricConfig {

    @Autowired
    private PrometheusMeterRegistry meterRegistry;
//
//    @Bean
//    public Counter complexCounter(){
//        return meterRegistry.counter("counter.total","service","demo");
//    }
//

//
//    @Bean
//    TimedAspect timedAspect(){
//        return new TimedAspect(meterRegistry);
//    }
}
