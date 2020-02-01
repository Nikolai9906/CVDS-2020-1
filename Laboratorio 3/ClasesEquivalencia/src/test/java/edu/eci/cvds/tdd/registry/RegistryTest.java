package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateAgeResult() {
    	
    	Person person2 = new Person("Edwin",10226969,14,Gender.MALE,true);
    	RegisterResult result2 = registry.registerVoter(person2);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result2);


    }

    // TODO Complete with more test cases
}