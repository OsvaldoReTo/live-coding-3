package liveCoding3;
import java.util.Scanner;

public class MangosNaranjas {

    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
		imprimir(n1, n2);
		
	}//main

	
	public static void imprimir(int a, int b) {
		int mayor =0;
		int caja =0;
		int mangos= 0;
		int naranjas = 0;
		if (a>=b) {
			mayor = a;
		}else {
			mayor = b;
		}//if obtener el mayor n�mero
		for (int i = 2; i < mayor; i++) {
			if ((a%i==0)&&(b%i==0)) {
					caja = i;
					naranjas = a/caja;
					mangos=b/caja;
			}//if divisores
		}//for
		
		
	  System.out.println("El n�mero de cajas es: " +
			  caja + " El n�mero de mangos en una caja es: "+ mangos + 
			  " El n�mero de naranjas en una caja es: "+ naranjas);
	}//imprimir
}//MangosNaranjas
