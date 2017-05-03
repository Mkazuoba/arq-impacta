package pontos.interfaces;

public class Participante {
	private int identificador;
	private String senha;
	private int pontos;
	
	public int getIdentificador() {
		return identificador;
	}

	public String getSenha() {
		return senha;
	}

	public int getPontos() {
		return pontos;
	}

	public Participante(int identificador, String senha, int pontos) {
		super();
		this.identificador = identificador;
		this.senha = senha;
		this.pontos = pontos;
	}

	public Participante(){}
	
}
