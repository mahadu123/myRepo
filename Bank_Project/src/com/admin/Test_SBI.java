package com.admin;

import java.util.Scanner;

import com.exception.inputMismatchException;
import com.service.RBI;

import serviceImpl.SBI;


public class Test_SBI {
	public static void main(String[] args) throws inputMismatchException {
	     System.out.println("----Welcome to SBI Bank----");
           System.out.println("Hello World");
		   System.out.println("Hello World by Mangesh");
		RBI sbi=new SBI();
		
		Scanner sc = new Scanner (System.in);
		
		boolean b=true;
		
		while(b)
		{
			System.out.println("1. Enter 1 for To Create Account");
			
			System.out.println("2. Enter 2 for To View Account Details");
			
			System.out.println("3. Enter 3 for Withdrawl Account Money");
			
			System.out.println("4. Enter 4 for Ammount deposit");
			
			System.out.println("5. Enter 5 for Update Account Details");
			
			System.out.println("6. Enter 6 for view Account Balance");
			
			System.out.println("7. ****Exit****");
			
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				sbi.createAccount();
				
				
				
				System.out.println("Acoount created Succesfully");
				break;
			case 2:
				sbi.viewAccountDetails();
				
				
				System.out.println("Account details viewed");
				break;
			case 3:
				sbi.withDrawlMoney();
				
				
				System.out.println("Ammount Withdrawl Succesfully");
				break;
			case 4:
				sbi.depositMoney();
				
				
				System.out.println("Ammount Deposited Succesfully");
				break;
			case 5:
				sbi.updateDetails();
				
				
				System.out.println("Account Detailes updated Sucessfully");
				break;
			case 6:
				sbi.viewAccountBalance();
				
				System.out.println("Your Account Balance is");
				break;
			case 7:
				System.out.println("---------Thanks for banking with us---------");
				b=false;
				break;

			default:
				System.out.println("Enter valid input");
				break;
			}
		}
		
	}

}
