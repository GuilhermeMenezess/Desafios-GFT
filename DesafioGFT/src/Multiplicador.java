import java.util.Scanner;

public class Multiplicador {
	public static void main(String[] args) {
		
		double multi = 1;
		double mul = 1;
		
		System.out.println("Qual o multiplicando?");
		
		Scanner sc = new Scanner(System.in);
		multi = sc.nextDouble();
		
		while (multi < 0 || multi > 3000) {
			System.out.println("Valor inválido, insira um novo valor igual ou maior que zero e menor que 3000");
			multi = sc.nextDouble();
		}
		
		System.out.println("Qual o multiplicador");
		Scanner scan = new Scanner(System.in);
		mul = scan.nextDouble();
		
		double variavel  = mul; 
		
		
		for (double i = variavel+=5; variavel < i; variavel++) {
			System.out.println(multi + " x " + variavel +  "=" + ( multi * variavel) );
			
		}
	
	
		
		
		
		
	}
}
