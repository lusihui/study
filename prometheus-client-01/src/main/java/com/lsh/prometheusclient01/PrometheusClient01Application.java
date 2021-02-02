package com.lsh.prometheusclient01;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication(scanBasePackages = {"com.lsh"}, exclude = {WebMvcMetricsAutoConfiguration.class})
//@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = {"com.lsh"})
public class PrometheusClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusClient01Application.class, args);
    }

    @Bean
    MeterRegistryCustomizer<MeterRegistry> configurer(
            @Value("${spring.application.name}") String applicationName) {
        return (registry) -> registry.config().commonTags("application", applicationName);
    }

}
