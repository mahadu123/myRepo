package serviceImpl;

import java.util.Scanner;

import com.exception.inputMismatchException;
import com.module.Account;
import com.service.RBI;

public class SBI implements RBI{
	Account a = new Account();
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() throws inputMismatchException {
		
		System.out.println("Your Account Number is:- ");
		long ac=sc.nextLong();
		a.setAccountNo(ac);
		if(a.equals(ac))
		{
			throw new inputMismatchException("Enter Valid Input");
		}
		else {
			System.out.println("----Your Account is Genrated----");
			
			System.out.println("Enter AccountHolderName:- ");
			a.setAccountHolderName(sc.next()+sc.nextLine());
			
			System.out.println("Set Password:- ");
			String pass=sc.next();
			if(pass.matches("[0-9]{4}"))
			{
		      System.out.println("Valid Password No" +pass );
			}
	        else
	        {
		      System.out.println("Invalid Password no");
		
	        }
			
			System.out.println("Enter Address:- ");
			a.setAddress(sc.next());
			
			System.out.println("Enter Mob no:- ");
			a.setMobNo(sc.nextLong());
			
			System.out.println("Enter PAN no");
			String pan=sc.next();
			//while(pan==pan)
			
			if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"))
					{
				System.out.println("Valid Pan No " +pan );
					}
			else
			{
				System.out.println("Invalid Pan no");
				
			}
			
			
			System.out.println("Enter Aadhar no:- ");
			a.setAadharNo(sc.nextLong());

			System.out.println("Enter AmmountDeposit:- ");
			a.setAmmountDeposit(sc.nextDouble());
			
		}
		


		
	}

	@Override
	public void viewAccountDetails() {

		System.out.println("Enter Account no");
		double acno = sc.nextDouble();

		if (acno == a.getAccountNo()) {
             
            
			System.out.println("Aadhar no:- " + a.getAadharNo());
			System.out.println("Account Holder Name:- " + a.getAccountHolderName());
			System.out.println("Account no:- " + a.getAccountNo());
			System.out.println("Account Holder Address:- " + a.getAddress());
			System.out.println("Account Holder MobNo:- " + a.getMobNo());
			System.out.println("Account Deposit:- " + a.getAmmountDeposit());
             
             } else {
			System.out.println("Enter valid Account number");
		}

	}

	@Override
	public void withDrawlMoney() {

		System.out.println("Enter Account No:- ");
		double acno = sc.nextLong();
		if (a.getAccountNo() == acno) {
			System.out.println("Enter AmmountWithdrawl:- ");
			double k = sc.nextDouble();
			if(a.getAmmountDeposit()>500) {
			a.setAmmountDeposit(a.getAmmountDeposit() - k);

			System.out.println("Your Remaining Balance is:- " + a.getAmmountDeposit());
			
			a.setAmmountWithdrawl(a.getAmmountWithdrawl()+k);
			System.out.println("Ammount Withdrawl:- " +a.getAmmountWithdrawl());;
			}else {
				System.out.println("you have to maintain minimum balance 500");
			}} else {
			System.out.println("Invalid Account number");
		}
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Account No:- ");

		double acno = sc.nextDouble();

		if (acno == a.getAccountNo()) {
			System.out.println("Enter Ammount You want to Deposit:- ");
			double a1 = sc.nextDouble();
			a.setAmmountDeposit(a.getAmmountDeposit() + a1);
			System.out.println(" Ammount Deposite Succesfully:- " + a.getAmmountDeposit());

		} else {
			System.out.println("Enter valid Account Number");
		}

	}

	@Override
	public void updateDetails() {
		boolean b = true;
		while (b) {
			System.out.println("1. Enter 1 for Aadhar Update");
			System.out.println("2. Enter 2 for Address Update");
			System.out.println("3. Enter 3 for Mobile no Update");
			System.out.println("4. Enter 4 for AccountHolder Name Update");
			System.out.println("5. Enter 5 for Reset Password");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter new Aadhar card number ");
				long s = sc.nextLong();
				a.setAadharNo(s);
				System.out.println("Aadahr details Updated Succesfully");
				break;
			case 2:
				System.out.println("Enter new Aadress ");
				String a1 = sc.next();
				a.setAddress(a1);
				System.out.println("Address Updated Succesfully");
				break;
			
			case 3:
				System.out.println("Enter new moobile no");
				long l = sc.nextLong();
				a.setMobNo(l);
				System.out.println("Mobile details Updated Succesfully");
				break;
			case 4:
				System.out.println("Enter update password");
				String n = sc.next();
				a.setSetPassword(ch);
				System.out.println("Password Updated Succesfully");

				break;
				
			case 5:
				System.out.println("Enter update AccountHoldre nm");
				String v = sc.next();
				a.setAccountHolderName(v);
				System.out.println("AccountHolder name Updated Succesfully");

				break;

			case 6:
				System.out.println("Information updated");
				b = false;
				break;
			default:
				System.out.println("Enter valid Input");
				break;
			}
		}
	}

	@Override
	public void viewAccountBalance() {
		System.out.println(a.getAmmountDeposit());

	}


}
