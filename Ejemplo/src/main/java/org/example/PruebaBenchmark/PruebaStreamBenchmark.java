package org.example.PruebaBenchmark;

import org.example.ClasesTestear.StreamBenchmark;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class PruebaStreamBenchmark {

    private StreamBenchmark streamBenchmark;
    private List<Integer> data;

    @Setup(Level.Trial)
    public void setUp() {
        streamBenchmark = new StreamBenchmark();
        data = streamBenchmark.crearLista();
    }

    @Benchmark
    public void benchmarkStreamSecuencial(Blackhole blackhole) {
        List<Integer> resultSecuencial = data.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        blackhole.consume(resultSecuencial);
    }

    @Benchmark
    public void benchmarkStreamParalelo(Blackhole blackhole) {
        List<Integer> resultParalelo = data.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        blackhole.consume(resultParalelo);
    }
}