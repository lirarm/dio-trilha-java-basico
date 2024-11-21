public class ExemploBreakContinue {

    public static void main(String[] args) {
        //for com break que interrompe o codigo parada brusca
        for (int numero = 1; numero <=5;numero++){
            if (numero == 3)
            break;
            System.out.println(numero);
        }
        System.out.println();
        //for com continue pula a interracao
        for (int numero = 1; numero <=5;numero++){
            if (numero == 3)
            continue;
            System.out.println(numero);
        }
    }
}