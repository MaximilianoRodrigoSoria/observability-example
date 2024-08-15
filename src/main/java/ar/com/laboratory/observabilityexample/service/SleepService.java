package ar.com.laboratory.observabilityexample.service;

import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SleepService {
    //		@Timed(value = "do.sleep.method.timed")
//		@NewSpan(value = "do-sleep-method-span")
    @Observed(name = "do.sleep.method.timed", contextualName = "do-sleep-method-span", lowCardinalityKeyValues = {"low", "low"})
    public Long doSleep(Long ms) {
        try {
            TimeUnit.MILLISECONDS.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ms;
    }
}