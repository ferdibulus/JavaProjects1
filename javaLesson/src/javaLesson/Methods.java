package javaLesson;

import java.util.Scanner;

public class Methods {
	public static void selamlama(){
		System.out.println("selam");
	}	
	
	public static void Fact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int num= scanner.nextInt();
		
		int fact = 1;
		while(num>0) {
			fact *= num;
			num--;
		}
		System.out.println("Faktoriyel:" + fact);
		
	}
public static void main(String args[]) {
	Fact();
	selamlama();
}
}
