package javaLesson;

public class methodOverloading {
	public static int mutlply2(int a,int b) {
	 return a*b;
	}
	
	public static int mutlply2(int a,int b,int c) {
		 return a*b*c;
		}
	
public static void main(String args[]) {
		
	System.out.println("Sonuc:" + mutlply2(8,2));
	System.out.println("Sonuc:" + mutlply2(8,2,3));
}
}


