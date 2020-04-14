package javaLesson;

import java.util.Scanner;

public class localDegiskenler {
	public static int  Toplama(int a,int b) {
		return a*b;
	}
	
	public static int Cikarma(int a,int b) {
		return a-b;
	}
	
	public static double Bolme(int a,int b) {
		return a/b;
	}
	
	public static int Carpma(int a,int b) {
		return a*b;
	}
	
public static void main(String args[]) {
    
	Scanner scanner = new Scanner(System.in);
	String islemler = "1.Toplama" 
					  +"2.Cikarma"
					  +"3.Bolme"
					  +"4.Carpma"
					  +"q.Programdan Cikiliyor..";
	while(true) {
		String islem= scanner.nextLine();
		if(islem == "1") {
		System.out.print("a:");
		  int a = scanner.nextInt();
		System.out.print("b:");
		  int b = scanner.nextInt();
		Toplama(a, b);
		}
		
	}


}
}
