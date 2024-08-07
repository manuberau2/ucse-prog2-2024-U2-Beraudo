package org.example.TestsClasesTestear;

import org.example.ClasesTestear.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvionPrivadoTest {
    private AvionPrivado avionPrivado;
    @BeforeEach
    void setUp() {
        avionPrivado = new AvionPrivado(1000, 20);
    }
    @Test
    void testvolarDeberiaDevolver2100() {
        int combustibleNecesario = avionPrivado.volar(80);
        Assertions.assertEquals(2100, combustibleNecesario);
    }
}