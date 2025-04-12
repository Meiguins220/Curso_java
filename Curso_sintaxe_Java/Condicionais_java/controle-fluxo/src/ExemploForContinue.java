public class ExemploForContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 100; numero ++){
            if (numero % 2 == 1)
            continue;

            System.err.println(numero);
                
        }
    }
}
