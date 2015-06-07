

public class CodeBreaker {

	private String valorOculto = "2189";

	public CodeBreaker() {
		super();
	}

	public String comparar(String valorComparar) {
		String resultado = " ";
		char caracterValorIngresado;
		char caracterValorOculto;

		for (int i = 0; i < valorComparar.length(); i++) {
			caracterValorIngresado = valorComparar.charAt(i);
			for (int j = 0; j < valorOculto.length(); j++) {
				caracterValorOculto = valorOculto.charAt(j);

				if ((caracterValorIngresado == caracterValorOculto) && i == j) {
					
					resultado += "x";
					
				} else if (caracterValorIngresado == caracterValorOculto) {
					
					resultado += "-";
				}
			}
		}
		return resultado;
	}
}
