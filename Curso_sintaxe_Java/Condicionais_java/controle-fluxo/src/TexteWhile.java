public class TexteWhile {
    public static void main(String[] args) throws Exception {
        int soma = 0;
        while (soma < 100) {
            soma = soma + 1;
            if(soma <= 100)
            System.out.println(soma);
            
        }
        System.out.println("Parabéns, você chegou a: " + soma);
    }
}
