package For;
public class ResultadoEscolar2 {
    public static void main(String[] args) {
		int nota = 7;

        // cenário 1
	  // String resultado = nota >=7 ? "Aprovado" : "Reprovado";

      // cenário 2
      String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

		System.out.println(resultado);
	}
}
