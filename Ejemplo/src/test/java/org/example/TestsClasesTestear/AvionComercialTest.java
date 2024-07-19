package org.example.TestsClasesTestear;

import org.example.ClasesTestear.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvionComercialTest {
    private AvionComercial avionComercial;

    @BeforeEach
    void setUp(){
        avionComercial = new AvionComercial(1000, 20);

    }

    @Test
    void testvolarDeberiaDevolver1600() {
        int combustibleNecesario = avionComercial.volar(80);
        Assertions.assertEquals(1600, combustibleNecesario);
    }
    @Test
    void testgetConsumoCombustibleDeberiaDevolver20() {
        int consumoCombustible = avionComercial.getConsumoCombustible();
        Assertions.assertEquals(20, consumoCombustible);

    }
}