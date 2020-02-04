package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	
	private ArrayList<Integer> people = new ArrayList<>();
	
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
    	RegisterResult resultado = RegisterResult.VALID;
    	
        if (p.getAge() < 18 && p.getAge() > 0) {
            resultado = RegisterResult.UNDERAGE;
            
        } else if (!p.isAlive()) {
            resultado = RegisterResult.DEAD;
            
        } else if (p.getAge() <= 0 || p.getAge() > 150) {
            resultado = RegisterResult.INVALID_AGE;
            
        } else if (people.contains(p.getId())) {
            resultado = RegisterResult.DUPLICATED;
            System.out.println("PERRAAAAAAAAAAAAAAAAAAAAAA");
            
        } else if (p.getId() < 0) {
            resultado = RegisterResult.INVALID_ID;
            
        } else if (!p.getName().equals(null) && !p.getName().equals("")) {
            resultado = RegisterResult.VALID;
        }
      
        return resultado;
    }
}