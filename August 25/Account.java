package robosoft;
import java.util.*;
class Account1{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account1(){
		id=0;
		balance=0.0;
		annualInterestRate=0.0;
		dateCreated=new Date();
	}
	Account1(int id,double balance){
		this.id=id;
		this.balance=balance;
		
	}
	void set(int id,double balance,double annualInterestRate) {
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	int getid() {
		return id;
	}
	double getbalance() {
		return balance;
	}
	double getannualInterestRate() {
		return annualInterestRate;
	}
	Date getDate() {
		return dateCreated;
	}
	double getMonthlyInterestRate() {
	double d=annualInterestRate/100;
	double monthlyinterestRate=d/12;
	return monthlyinterestRate;
	}
	double getMonthlyInterest() {
		double d=getMonthlyInterestRate();
		double monthlyinterest=balance*d;
		return monthlyinterest;
	}
	void withdraw(double w){
		balance=balance-w;
	 
		
	}
	void deposite(double d) {
		balance=balance+d;
	}
}

public class Account {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Account1 ac[]=new Account1[3];
 //Account1 ac1=new Account1(1,3000);
 ac[0]=new Account1(1,2000);
 ac[1]=new Account1(2,2000);
 ac[2]=new Account1(3,3000);
 ac[0].set(2,5666,3);
 System.out.println(ac[0].getid());
 System.out.println(ac[1].getbalance());
 System.out.println(ac[2].getannualInterestRate());
 ac[0].withdraw(500);
 //System.out.println(ac.
//		 getbalance());
 
	}
}

