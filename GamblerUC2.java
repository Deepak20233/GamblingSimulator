package com.java;

public class GamblerUC2 {
	
		public static int dailyStake = 100;
		public static int betInDollar = 1;
		public static final int win = 1;

		public static void main(String[] args) {
			System.out.println("************Welcome To Gambling Simulator***************");

			int result = (int) ((Math.random() * 10) % 2);
			if(result == win) {
				dailyStake++;
				System.out.println("Won");
			}else {
				dailyStake--;
				System.out.println("Loose");
			}
			
			System.out.println("Total daily Stake is : " + dailyStake);
	        System.out.println("Betting Dollar for every game : " + betInDollar);
         }

}
