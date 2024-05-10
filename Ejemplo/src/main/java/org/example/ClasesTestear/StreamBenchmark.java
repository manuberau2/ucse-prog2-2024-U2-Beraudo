package org.example.ClasesTestear;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamBenchmark {
    public List<Integer> crearLista() {
        int size = 10000000;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 50000));
        }
        return list;
    }
    public List<Integer> trabajoListaSecuencial() {
        List<Integer> resultSecuencial = crearLista().stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return resultSecuencial;
    }

    public List<Integer> trabajoListaParalelo() {
        List<Integer> resultParalelo = crearLista().parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return resultParalelo;
    }

}
