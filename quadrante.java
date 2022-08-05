import java.util.Scanner;
	public class Main {
			 
		public static void main ( String  [] args ) {
			
			Scanner sc = new Scanner (System.in);
			
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();

			if (numero1 == 0.0 && numero2 == 0.0) {
				
				System.out.println("Origem");
			}
	
			else if (numero1 == 0.0) {
				
				System.out.println("eixo Y");
			}
			else if (numero2 == 0.0) {
				
				System.out.println("eixo X");
			}
			
			else if (numero1 > 0.0 && numero2 > 0) {
				
				System.out.println("Pertence a Q1");
			}
			else if (numero1 < 0.0 && numero2 < 0) {
				
				System.out.println("Pertence a Q4");
			}
			else if (numero1 < 0.0 && numero2 > 0) {
				
				System.out.println("Pertence a Q2");
			}
			else if (numero1 > 0.0 && numero2 < 0) {
				
				System.out.println("Pertence a Q3");
			}
			
			sc.close();
		}
			
		
		
	}