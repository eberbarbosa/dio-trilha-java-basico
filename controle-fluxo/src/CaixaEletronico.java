// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo){

            saldo = saldo - valorSolicitado;
            System.out.println("\nNovo Saldo: " + saldo );

        }else
        System.out.println("\nSaldo Insuficiente\n");

        System.out.println(saldo);

    }
}