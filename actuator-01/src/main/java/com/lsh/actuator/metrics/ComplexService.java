package com.lsh.actuator.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import org.springframework.stereotype.Service;

@Service
public class ComplexService {

    static final Counter counter = Metrics.counter("counter.total","service","demo");

    public void increment(){
        counter.increment();
    }
}

