package com.revature.eval.java.core;

import java.util.HashMap;

public class ScabbleValues {
	private static HashMap<Character,Integer> scrabbleChars = new HashMap<>();

	
	
	public static HashMap<Character, Integer> getScrabbleValues()
	{
		if(scrabbleChars.size()==0)
		{
			//Generate new scrabble chars only if scrabbleChars has not been generated
			scrabbleChars.put('a', 1);
			scrabbleChars.put('b', 3);
			scrabbleChars.put('c', 3);
			scrabbleChars.put('d', 2);
			scrabbleChars.put('e', 1);
			scrabbleChars.put('f', 4);
			scrabbleChars.put('g', 2);
			scrabbleChars.put('h', 4);
			scrabbleChars.put('i', 1);
			scrabbleChars.put('j', 8);
			scrabbleChars.put('k', 5);
			scrabbleChars.put('l', 1);
			scrabbleChars.put('m', 3);
			scrabbleChars.put('n', 1);
			scrabbleChars.put('o', 1);
			scrabbleChars.put('p', 3);
			scrabbleChars.put('q', 10);
			scrabbleChars.put('r', 1);
			scrabbleChars.put('s', 1);
			scrabbleChars.put('t', 1);
			scrabbleChars.put('u', 1);
			scrabbleChars.put('v', 4);
			scrabbleChars.put('w', 4);
			scrabbleChars.put('x', 8);
			scrabbleChars.put('y', 4);
			scrabbleChars.put('z', 10);
			scrabbleChars.put(' ',0);
			
		}
		
		return scrabbleChars;
	}
	
	
}
