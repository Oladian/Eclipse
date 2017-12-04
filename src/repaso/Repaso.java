package repaso;

public class Repaso {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i%2!=0) { //cuando no es numero par continua iterando
				continue; 
			}
			if (i==4) continue;
			if (i==8) return; //Saca del método void
			System.out.println("Valor "+i);	
		}
		System.out.println("Final");
	}
}
