package paquet;

import java.util.Scanner;
/**
 * 
 * 
 * Classe p�blica que permet accedir a la consola en diferens
 * i tenir diferent informacio aix� com operar.
 *
 */
public class Accessor {
			private static Scanner Lector = new Scanner(System.in);
			BaseDeDadesV BDVirtual;
		public static int Menu(BaseDeDadesV BDVirtual){
			
			 
			 int resposta;
			 System.out.println("Que vols fer? Escull opcio escrivint un numero" );
			 System.out.println("      1 - Mode Banquer (nom�s disponible des de a centraleta) " );
			 System.out.println("      2 - Mode Client " );
			 System.out.println("      3 - Veure informaci� publica del banc " );
			 System.out.println("      4 - Tancar programa " );
			 
			 resposta = Lector.nextInt();
			switch (resposta){
			case 1:
				ValidaBanquer();
				return 1;
			case 2:
				ValidaClient( BDVirtual);
				return 1;
			case 3:
				InfoBanc();
				return 1;
			case 4:
				return 0;
			default:
				return 1;
			}
			
		}
		
		private static void ValidaBanquer(){}
		private static void ValidaClient(BaseDeDadesV BDVirtual){
			System.out.println("Posa el teu DNI");
			String Dni = Lector.next();
			Client Usuari=BDVirtual.CercaClientperDNI(Dni);
			if (Usuari==null){System.out.println("No exitsteix cap client registrat amb aquest DNI");}
			else {
				
				System.out.println("Si que existeix l'usuari");
			
			
			}
			}
			
		
		private static void InfoBanc(){}
		
}
