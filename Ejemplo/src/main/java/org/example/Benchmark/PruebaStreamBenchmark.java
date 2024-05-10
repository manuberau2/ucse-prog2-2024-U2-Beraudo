package org.example.Benchmark;

import org.example.ClasesTestear.StreamBenchmark;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Benchmark)
public class PruebaStreamBenchmark {
    private StreamBenchmark streamBenchmark;
    @Setup
    public void setup() {
       streamBenchmark = new StreamBenchmark();
    }
    @Benchmark
    public List<Integer> resultadoConStream() {
        return streamBenchmark.trabajoListaSecuencial();
    }
    @Benchmark
    public List<Integer> resultadoConStreamParallel() {
        return streamBenchmark.trabajoListaParalelo();
    }
}
