package edu.eci.cvds.tdd.registry;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryDeadCase() {

        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryAliveCase() {

    	Person person = new Person("Edwin",10226969,19,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateAgeResultInferiorCase() {
    	
    	Person person2 = new Person("Edwin",10226969,1,Gender.MALE,true);
    	RegisterResult result2 = registry.registerVoter(person2);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result2);
    }
    @Test
    public void validateAgeResultSuperiorCase() {
    	
    	Person person2 = new Person("Edwin",10226969,17,Gender.MALE,true);
    	RegisterResult result2 = registry.registerVoter(person2);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result2);
    }
    @Test
    public void validateAgeResultValidCase() {
    	
    	Person person2 = new Person("Edwin",10226969,18,Gender.MALE,true);
    	RegisterResult result2 = registry.registerVoter(person2);
    	Assert.assertEquals(RegisterResult.VALID, result2);
    }
    @Test
    public void validateInvalidAgeInferiorNegativeCase() {
    	
    	Person person3 = new Person("Edwin",10226969,-1,Gender.MALE,true);
    	RegisterResult result3 = registry.registerVoter(person3);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result3);
    }
    
    @Test
    public void validateInvalidAgeInferiorNormalCase() {
    	
    	Person person3 = new Person("Edwin",10226969,0,Gender.MALE,true);
    	RegisterResult result3 = registry.registerVoter(person3);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result3);
    }
    
    @Test
    public void validateInvalidAgeSuperiorNormalCase() {
    	
    	Person person3 = new Person("Edwin",10226969,150,Gender.MALE,true);
    	RegisterResult result3 = registry.registerVoter(person3);
    	Assert.assertEquals(RegisterResult.VALID, result3);
    }
    
    @Test
    public void validateInvalidAgeSuperiorCase() {
    	
    	Person person3 = new Person("Edwin",10226969,151,Gender.MALE,true);
    	RegisterResult result3 = registry.registerVoter(person3);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result3);
    }
    
    @Test
    public void validateDuplicatedId() {
    	
    	Person person3 = new Person("Edwin",10226969,18,Gender.MALE,true);
    	RegisterResult result3 = registry.registerVoter(person3);
    	Person person4 = new Person("Edwin",10226969,18,Gender.MALE,true);
    	RegisterResult result4 = registry.registerVoter(person4);
    
    	
    }
    

    // TODO Complete with more test cases
}