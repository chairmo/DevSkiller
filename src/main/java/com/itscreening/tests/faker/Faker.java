package com.itscreening.tests.faker;

import java.util.Random;

public class Faker {
	

    public String letterify(String letterString) {
    	Random r = new Random();
    	StringBuilder str = new StringBuilder(letterString);
    	for (int i = 0; i < letterString.length(); i++) {
            char temp = letterString.charAt(i);
            if (temp == '?') {
            	char c = (char)(r.nextInt(26) + 'a');
            	str.setCharAt(i, c);
            }
        }    	
        return str.toString();
    }

    public String numerify(String numberString) {
    	StringBuilder str = new StringBuilder(numberString);
    	for (int i = 0; i < numberString.length(); i++) {
            char temp = numberString.charAt(i);
            if (temp == '#') {
            	int value = (int) (Math.random()*10);
            	str.setCharAt(i, (char) (value + '0') );
            }
        }    	
        return str.toString();   	
    }

    public String bothify(String string) {
        return numerify(letterify(string));
    }

}
