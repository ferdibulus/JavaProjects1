package javaLesson;

public class parameterMethods {
	
	public static void selamlama(String name) {
		System.out.println("SELAMLAR.." + name);
	}
	
	public static void Sum(int a,int b,int c) {
		int toplam = a+b+c;
		System.out.println("Toplam:" + toplam);
	}
	
public static void main(String args[]) {
			
			selamlama("ferdi");
			selamlama("basak");
			Sum(1,3, 5);
	}
	
}

