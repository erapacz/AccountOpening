package com.capgemini.accountopening.helper;

import java.util.Random;

public class AccountNumGenerator {

	public static final int SAVINGS = 0;
	public static final int CHECKING = 1;
	public static final int MONEY_MARKET = 2;
	
	public static String getAccountNum(Long id, int type) {
		
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
		
		String frmt = "%013d";
		String acc = String.format(frmt, id);
		
		return prefix + acc;
	}
}
