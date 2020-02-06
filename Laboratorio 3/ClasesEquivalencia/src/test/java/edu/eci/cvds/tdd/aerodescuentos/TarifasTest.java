package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private CalculadorDescuentos cal = new CalculadorDescuentos();

    //String name, int id, int age, Gender gender, boolean alive, boolean military
    /**
    @param tarifaBase valor base del vuelo
    @param diasAntelacion dias de antelación del vuelo
    @param edad - edad del pasajero
    @throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
    **/
    
    /**
     */
    @Test
    public void deberiaSerMenorValidoSingle() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,19)),0.0);
        Assert.assertEquals(920.0, (cal.calculoTarifa(1000,0,165)),0.0);
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,65)),0.0);
        //No hay edad negativa. Arrojaria Execption
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,-1)),0.0);
    }
   
}
