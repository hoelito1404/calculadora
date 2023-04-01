import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int resultado;
		
		System.out.println("digiti aqui o primeiro numero ");
        num1=sc.nextInt() ;
     
        System.out.println("digiti aqui o segundo numero ");
        num2=sc.nextInt();
        
        
        resultado=num1*num2;
        System.out.println("resultado será: " + resultado );
        
        sc.close();
     
     
		
	}
	

}
