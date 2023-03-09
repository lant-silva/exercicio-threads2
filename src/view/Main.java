package view;
import controller.ThreadMatriz;

public class Main {
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			Thread t = new ThreadMatriz(i);
			t.start();
		}
	}
}
