package org.example;

import org.example.ClasesTestear.AvionComercial;
import org.example.ClasesTestear.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadorCombustibleTest {

    @Test
    void testgetInstanceLasInstanciasDeberianSerIguales() {
        CalculadorCombustible calculadorCombustiblePrimeraInstancia = CalculadorCombustible.getInstance();
        CalculadorCombustible calculadorCombustibleSegundaInstancia = CalculadorCombustible.getInstance();
        Assertions.assertEquals(calculadorCombustiblePrimeraInstancia, calculadorCombustibleSegundaInstancia);
    }

    @Test
    void testcalcularCombustibleDeberiaDevolver1600() {
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        AvionComercial avionComercialParametro = new AvionComercial(1000, 20);
        int consumoCombustible = calculadorCombustible.calcularCombustible(avionComercialParametro, 80);
        Assertions.assertEquals(1600, consumoCombustible);
    }
}