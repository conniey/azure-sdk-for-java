// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.core.test.utils.metrics;

import com.azure.v2.core.utils.TelemetryAttributes;
import com.azure.v2.core.utils.metrics.LongCounter;
import io.clientcore.core.utils.Context;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

/**
 * Test counter implementation.
 */
public class TestCounter implements LongCounter {
    private final ConcurrentLinkedQueue<TestMeasurement<Long>> measurements = new ConcurrentLinkedQueue<>();
    private final boolean isEnabled;

    TestCounter(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public void add(long value, TelemetryAttributes attributes, Context context) {
        if (isEnabled) {
            measurements.add(new TestMeasurement<>(value, (TestTelemetryAttributes) attributes, context));
        }
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * Gets all measurements reported with this counter.
     *
     * @return list of all measurements
     */
    public List<TestMeasurement<Long>> getMeasurements() {
        return measurements.stream().collect(Collectors.toList());
    }
}
