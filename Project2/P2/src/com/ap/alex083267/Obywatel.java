package com.ap.alex083267;
import 


public class Obywatel {

	   public static void main(String args[]) {
		   String name="Hihe";
		   StringBuffer sBuffer = new StringBuffer(name);
		
		  while(sBuffer.indexOf("h", 1)!=-1) {
			  sBuffer.deleteCharAt(sBuffer.indexOf("h", -1));
			    String k="i";
			    if(sBuffer.indexOf(k)!=-1) {
			    	sBuffer.deleteCharAt('i');
					 sBuffer.append("e");
				  }
			  
		  }
		
	     
	      System.out.println(sBuffer);  
	      public class zmiana {
	    		
	    		public static void main(String[]args) throws IOException{
	    			
	    			Cos("Kowalski");
	    			Cos("Shelukhov");
	    			Cos("Valiaiev");
	    			Cos("Sanya");
	    			

	    	}
	    		public static String Cos(String name) {
	    			System.out.println(name);
	    			StringBuffer line = new StringBuffer(name);
	    			int i, j, n = 0;
	    			
	    			String[] consonant = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
	    			String[] vowel = new String[] {"a", "e", "i", "o", "u", "y"};
	    			
	    			List <String> cons = Arrays.asList(consonant);
	    			List <String> vow = Arrays.asList(vowel);
	    			
	    			for (i = 1; i<line.length(); i++) {
	    				
	    				if (cons.contains(line.charAt(i))) {
	    					
	    				}
	    		
	    			}
	    			
	    			for (i = 1; i<line.length();i++) {
	    			
	    				if (line.charAt(i) == 'h') {
	    					line.deleteCharAt(i);
	    				}
	    				
	    				if (line.charAt(i) == 'i') {
	    					line.setCharAt(i, 'e');
	    				}
	    				
	    				if (line.charAt(i) == 'p') {
	    					line.setCharAt(i, 'b');
	    				}
	    				
	    				if (line.charAt(i) == 'k') {
	    					line.setCharAt(i, 'c');
	    				}
	    				
	    				if (line.charAt(i) == 't') {
	    					line.setCharAt(i, 'd');
	    				}
	    				
	    				if (line.charAt(i) == 'j') {
	    					line.setCharAt(i, 'g');
	    				}
	    				
	    				if (line.charAt(i) == 'm') {
	    					line.setCharAt(i, 'n');
	    				}
	    				
	    				if (line.charAt(i) == 'w') {
	    					line.setCharAt(i, 'v');
	    				}
	    				
	    			}
	    			System.out.println(line);
	    			
	    			return name;
	    		}
	    	}
		    }
	   }
	}
