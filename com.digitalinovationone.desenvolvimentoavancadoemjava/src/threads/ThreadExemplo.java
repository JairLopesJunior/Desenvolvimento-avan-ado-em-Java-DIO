package threads;

public class ThreadExemplo {

	public static void main(String[] args) {
		
		BarraDeCarregamento2 barra2 = new BarraDeCarregamento2();
		
		barra2.start();
		
		BarraDeCarregamento2 barra22 = new BarraDeCarregamento2();
		
		barra22.start();
	}

}

class GerarPDF implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Gerar PDF");
	}
}

class BarraDeCarregamento implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Loading ...");
	}
}

class BarraDeCarregamento2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Rodei" + this.getName());
	}
}
