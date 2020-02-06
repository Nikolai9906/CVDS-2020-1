package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private CalculadorDescuentos cal = new CalculadorDescuentos();
    
    //String name, int id, int age, Gender gender, boolean alive, boolean military

    @Test
    public void deberiaSerMenorValidoSingle() {
        Assert.assertEquals(950.0, (cal.calculoTarifa(1000,0,11)),0.0);
        Assert.assertEquals(2850.0, (cal.calculoTarifa(3000,19,17)),0.0);
        Assert.assertEquals(3800.0, (cal.calculoTarifa(4000,18,0)),0.0);
        Assert.assertEquals(1900.0, (cal.calculoTarifa(2000,15,15)),0.0);
        
    }
   
}
