package pontos.desktop;

import java.util.*;
import pontos.interfaces.*;
import static java.lang.System.out;

public class PontosDesktop {
	private IPontosProcess processo;
	public PontosDesktop(IPontosProcess processo){
		this.processo = processo;
	}
	public void consultarPontos(){
		Scanner entrada = new Scanner(System.in);
		out.print("Digite seu numero identificador: ");
		int identificador = Integer.parseInt(entrada.nextLine());
		Mapeamento mapeamento = processo.getMapeamento();
		out.println();
		for (Character letra: mapeamento.getMapa().keySet()){
			Integer[] nums = mapeamento.getMapa().get(letra);
			out.println(nums[0] + " ou " + nums[1]+ " > " + letra);
		}
		out.print("\nEntre as letras correspondentes aos números da sua senha: ");
		String letrasDigitadas = entrada.nextLine();
		int pontos = processo.getPontos(identificador, letrasDigitadas, mapeamento);
		out.println("TOtal de pontos: " + pontos);
		entrada.close();
	}
}
