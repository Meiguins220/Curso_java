import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroum = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametrodois = terminal.nextInt();
        try {
            contar(parametroum, parametrodois);

        } catch (Exception e) {
            System.out.println("O segundo parãmetro deve ser maior que o primeiro!");

        }
    }
    static void contar(int parametroum, int parametrodois) throws Exception{
        if(parametroum > parametrodois)
        throw new Exception();
        int contagem = parametrodois - parametroum;
        for (int resultado = 0; resultado <= contagem; resultado++){
            System.out.println("Imprimindo o número " + resultado);
        }
    }
    
}