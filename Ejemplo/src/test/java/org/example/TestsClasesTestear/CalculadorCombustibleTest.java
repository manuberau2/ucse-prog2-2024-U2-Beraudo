package org.example.TestsClasesTestear;

import org.example.ClasesTestear.AvionComercial;
import org.example.ClasesTestear.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadorCombustibleTest {
    private AvionComercial avionComercial;
    private CalculadorCombustible calculadorCombustible;
    @BeforeEach
    void setUp() {
        avionComercial = new AvionComercial(1000,20);
        calculadorCombustible = CalculadorCombustible.getInstance();
    }

    @Test
    void testGetInstanceLasInstanciasDeberianSerIguales() {
        CalculadorCombustible calculadorCombustiblePrimeraInstancia = CalculadorCombustible.getInstance();
        CalculadorCombustible calculadorCombustibleSegundaInstancia = CalculadorCombustible.getInstance();
        Assertions.assertEquals(calculadorCombustiblePrimeraInstancia, calculadorCombustibleSegundaInstancia);
    }

    @Test
    void testCalcularCombustibleDeberiaDevolver1600() {
        int consumoCombustible = calculadorCombustible.calcularCombustible(avionComercial, 80);
        Assertions.assertEquals(1600, consumoCombustible);
    }
}