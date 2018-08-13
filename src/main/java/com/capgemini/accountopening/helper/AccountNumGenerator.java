package com.capgemini.accountopening.helper;

import java.util.Random;

public class AccountNumGenerator {

	public static final int SAVINGS = 0;
	public static final int CHECKING = 1;
	public static final int MONEY_MARKET = 2;
	
	public static String getAccountNum(int type) {
		
		String prefix = "";
		
		//get first 3 digits depending on account type
		switch(type) {
		
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
		
		Random rand = new Random();
		Integer postfix1 = rand.nextInt(10000000); //next 7 digits
		Integer postfix2 = rand.nextInt(1000000); //final 6 digits = 13 total digits
		
		return prefix + postfix1.toString() + postfix2.toString();

	}
}
