
public class Main {
public static void main(String args[]) {
	KapsamSinifi kapsamSinifi = new KapsamSinifi();
	kapsamSinifi.onIleCarp();
	System.out.println("**************************");
	
	KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
	kapsam.onIleCarp();
}
}
