package library;

import java.util.Scanner;

public class Main {
	static Scanner scan=null;
	static DataBase data= null; 
	public static void main(String[] args) {
		
		scan= new Scanner(System.in);
		data=new DataBase();
		 int num=0;
		 System.out.println("Welcome to our library . .");
		 
		 do {
			 System.out.println("0. Exit\n"
			 		          + "1. Add User\n"
			 		          + "2. Login\n");
			 num=scan.nextInt();
			 
		switch (num) {
		case 1:add();  break;
		//num=0;
		case 2:login(); break;
		//num=0;
		default: throw new IllegalArgumentException("Unexpected value: " + num);
		//System.out.println("Invaild option");
		} 
	}while(num !=0);
	}

	public static void login() {
		 System.out.println("Enter your email please");
		 String email=scan.next();
		 System.out.println("Enter your phone number please");
		 String phone=scan.next();
		 int n= data.loginUser(phone,email);
		 if (n != -1) {
			 User user= data.getUser(n);
				user.menu();	
		} else {
			 System.out.println("User not found");
			 return;
		}
		
		
		
	}

	public static void add() {
		int n;
		User user;
		System.out.println("Enter your name please");
		 String name=scan.next();
		System.out.println("Enter your email please");
		 String email=scan.next();
		 System.out.println("Enter your phone number please");
		 String phone=scan.next();
		 System.out.println("1. Admin\n"
		 		           + "2. Normal User\n");
		 n=scan.nextInt();
		 
		 if(n==1) {
			 user= new Admin(name,phone,email);
		 }else {
			 user= new NormalUser(name,phone,email);
		 }
		 data.addUser(user);
		 System.out.println("User Added Successfully");
		 System.out.println("===================================================");
		user.menu();
	}

}
