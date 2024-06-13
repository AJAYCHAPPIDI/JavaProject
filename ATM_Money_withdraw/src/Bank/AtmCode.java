package Bank;

import java.util.Scanner;
public class AtmCode {

	public static void main(String[] args) {
		System.out.println("Welcome to Atm ");
		
		Scanner sc= new Scanner(System.in);
		
		int accbal=1000;
		int num;
	
		
		
		do {
			    System.out.println("Select below options ");
				System.out.println("prees 1 to view Acc balnce");
				System.out.println("prees 2 to view Deposit amount");
				System.out.println("prees 3 to view Withdraw balnce");
 				System.out.println(" prees 4 to Exit your account ");
				 num=sc.nextInt();
				switch(num)
				{
				case 1: System.out.println("Your Account Balance is: "+ accbal);
				break;
				case 2:System.out.println("Deposit section Enter amount ");
				int deposit=sc.nextInt();
				accbal+=deposit;
				System.out.println("Now your acc balnce is:"+accbal);
				break;
				case 3:System.out.println("withdraw section enter amount ");
				int wd =sc.nextInt();
				accbal-=wd;
				System.out.println("Now your acc balnce is : "+accbal);
				default: System.out.println("Exit your account ");
				
					
				
				}
		}
		while(num<=4);
			
	}
	
}

