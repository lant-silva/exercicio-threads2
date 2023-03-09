package controller;

public class ThreadMatriz extends Thread {
	
	int i;
	int vetor[] = new int[5];
	int soma=0;
	
	public ThreadMatriz(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		iniciarMatriz();
	}
	
	public void iniciarMatriz() {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int j=0;j<5;j++) {
			vetor[j] =(int) (Math.random()*10);
			System.out.print("["+vetor[j]+"]");
			soma += vetor[j];
		}
		System.out.println("Soma total: "+soma);
	}
}
