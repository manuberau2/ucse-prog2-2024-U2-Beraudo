package org.example;

import org.example.ClasesTestear.StreamBenchmark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StreamBenchmarkTest {
    StreamBenchmark streamBenchmark = new StreamBenchmark();
    @Test
    void testcrearListaSizeDeberiaDevolver10000000() {
        List<Integer> listaCreada = streamBenchmark.crearLista();
        Assertions.assertEquals(10000000, listaCreada.size());
    }

    @Test
    void trabajoListaSecuencialDeberiaDevolverQueNoEstaVacia() {
        List<Integer> listaResultanteSecuencial = streamBenchmark.trabajoListaSecuencial();
        Assertions.assertFalse(listaResultanteSecuencial.isEmpty());
    }

    @Test
    void trabajoListaParaleloDeberiaDevolverQueNoEstaVacia() {
        List<Integer> listaResultanteParalela = streamBenchmark.trabajoListaParalelo();
        Assertions.assertFalse(listaResultanteParalela.isEmpty());
    }
}