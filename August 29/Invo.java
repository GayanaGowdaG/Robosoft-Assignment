package robosoft;
import java.util.*;
class Invoice{
String partnum;
String desc;
int quantity;
double price;
Invoice(String partnum,String desc,int quantity,double price){
	this.partnum=partnum;
	this.desc=desc;
	this.quantity=quantity;
	this.price=price;
}
	void set_variable(String partnum,String desc,int quantity,double price) {
		this.partnum=partnum;
		this.desc=desc;
		this.quantity=quantity;
		this.price=price;
	}
	String get_partnum() {;
	return partnum;
	
}
	String get_desc() {
		return desc;
	}
	int get_quantity() {
		return quantity;
	}
	double get_price() {
		return price;
	}
double getInvoiceAmount() {
	return quantity*price;
}
}

public class Invo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Invoice inv=new Invoice("234","abc",2,242);
System.out.println("enter the partnumber:");
String partnum=sc.nextLine();
System.out.println("enter the description:");
String desc=sc.nextLine();
System.out.println("enter the quantity:");
int quantity=sc.nextInt();
if(quantity<0) {
	quantity=0;
}
System.out.println("enter the price:");
double price=sc.nextDouble();
if(price<0) {
	price=0.0;
}
inv.set_variable(partnum,desc,quantity,price);
System.out.println("part number:"+inv.get_partnum());
System.out.println("part description:"+inv.get_desc());
System.out.println("Quantity:"+inv.get_quantity());
System.out.println("price:"+inv.get_price());
	}

}