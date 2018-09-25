package com.vlkan.fibertest;

import kilim.tools.Kilim;
import org.junit.Test;

public class KilimActorRingBenchmarkTest {

    @SuppressWarnings("unused")     // entrance for Kilim.run()
    public static void kilimEntrance(String[] ignored) {
        KilimActorRingBenchmark benchmark = new KilimActorRingBenchmark();
        int[] sequences = benchmark.ringBenchmark();
        Util.testRingBenchmark(benchmark.workerCount, benchmark.ringSize, sequences);
    }

    @Test
    public void testRingBenchmark() throws Exception {
        Kilim.run("com.vlkan.fibertest.KilimActorRingBenchmarkTest", "kilimEntrance");
    }

}
