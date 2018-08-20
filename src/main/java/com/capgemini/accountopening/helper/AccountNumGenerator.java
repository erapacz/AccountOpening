package com.capgemini.accountopening.helper;

public class AccountNumGenerator {

	public static final String SAVINGS = "Savings Account";
	public static final String CHECKING = "Checking Account";
	public static final String MONEY_MARKET = "Money Market Account";

	public static String getAccType(String accType) {
		String prefix = "";
		
		//get first 3 digits depending on account type
		switch(accType) {
		
		case SAVINGS:
			prefix = "554";
			break;
			
		case CHECKING:
			prefix = "774";
			break;
			
		case MONEY_MARKET:
			prefix = "884";
			break;
		}
		
		return prefix + String.valueOf(numbGen());
	}
	
	public static long numbGen() {
	    while (true) {
	        long numb = (long)(Math.random() * 100000000 * 1000000); // had to use this as int's are to small for a 13 digit number.
	        if (String.valueOf(numb).length() == 13)
	            return numb;
	    }
	}
}