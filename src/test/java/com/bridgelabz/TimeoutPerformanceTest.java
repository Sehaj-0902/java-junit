package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutPerformanceTest {
    private TimeoutPerformance timeoutPerformance;

    @BeforeEach
    void setUp() {
        timeoutPerformance = new TimeoutPerformance();
    }

    @Test
    @Timeout(2)
    // To verify that the test fails if the method sleeps for more than 2 seconds
    public void shouldFailTheTestIfMethodSleepsForMoreThanTwoSeconds() {
        String result  = timeoutPerformance.longRunningTask();
        Assertions.assertEquals("Task Completed!", result);
    }
}