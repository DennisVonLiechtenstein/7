package healers;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.Scanner;
public class ShowMaker {


	public static void main(String[] args) throws IOException, InterruptedException {
     //****DETALHE IMPORTANTE: FEITO HONESTAMENTE SEM AJUDA DE INTELIGÊNCIA ARTIFICIAL*****


		Login admin2;
		admin2=new Login();
		Healer admin3;
		admin3=new Healer();
		Fallen admin4;
		admin4=new Fallen();
		Guardian admin5;
		admin5 = new Guardian();


		Scanner scaneia = new Scanner(System.in);

        
       
        
		System.out.println("***************************");
		System.out.println("* BEM VINDO AO HEALERS!!! *");
		System.out.println("***************************");

		System.out.println("NÃO É CADASTRADO? VENHA FAZER PARTE DO PROJETO HEALERS!\n");
		System.out.println("O QUE DESEJA FAZER?\n");
		System.out.println("DIGITE 'L' PARA FAZER LOGIN OU 'C' PARA SE CADASTRAR OU 'S' PARA SAIR DO SISTEMA");
		String escolha= scaneia.next();
		//System.out.println( escolha.length());
		if(escolha.equalsIgnoreCase("L")) {
			admin2.autentica();

		}else if(escolha.equalsIgnoreCase("C")){
			System.out.println("Qual função deseja exercer?:");
			System.out.println("Digite 'H' para exercer a função Healer.");
			System.out.println("Digite 'F' para ser assistido como um Fallen.");
			System.out.println("Digite 'G' para exercer a função guardian.");
			String funcao=scaneia.next();
			if(funcao.equalsIgnoreCase("H")) {
				admin3.cadastroHealer();

				if(admin3.cadastroHealer()) {
					
					admin3.MenuHealer();

				}
			}else if(funcao.equalsIgnoreCase("F")) {
				admin4.cadastroFallen();
                 admin4.MenuFallen();
                 
			}else if(funcao.equalsIgnoreCase("G")) {
				admin5.cadastroGuardian();
                admin5.MenuGuardian();
			}


		}else if(escolha.equalsIgnoreCase("S")) {
			System.out.println("VOLTE SEMPRE!!");
			System.exit(0);
		}

		else {
			System.out.println("Escolha uma opção válida!");
		}


	}


}
