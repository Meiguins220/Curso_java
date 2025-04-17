import java.util.Scanner;

public class mat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double transacaoum = scanner.nextDouble();
        double transacaodois = scanner.nextDouble();
        double transacaotres = scanner.nextDouble();
        
        if(transacaoum > 0){
          System.out.println("Deposito de " + transacaoum);
        }else
        System.out.println("Saque de " + transacaoum);
        
        if(transacaodois > 0){
          System.out.println("Deposito de " + transacaodois);
        }else
        System.out.println("Saque de " + transacaodois);
        
        if(transacaotres > 0){
          System.out.println("Deposito de " + transacaotres);
        }else
        System.out.println("Saque de " + transacaotres);
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transacaoum + transacaodois + transacaotres;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
