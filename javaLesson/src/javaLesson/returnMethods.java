package javaLesson;

public class returnMethods {
	
	public static int mutlply2(int a) {
	return a*2;
	}
	
	public static int add2(int a) {
	return a+2;
	}
	
	public static int mutlply4(int a) {
	return a*4;
	}
public static void main(String args[]) {
		
	System.out.println("Sonuc:" + mutlply4(add2(mutlply2(8))));
}
}
