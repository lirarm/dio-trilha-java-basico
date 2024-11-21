//importacao da biblioteca responsavel por gerar valor aleatorios
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
//enquanto mesada for maior que zero ai entra no while, senao for nem entra no while
        while (mesada > 0) {
            //variavel valorAleatorio recebe valor randomizado do metodo e passa o valor para o valor do doce
            Double valorDoce = valorAleatorio();
            //o if verifca a condicao de valor do doce ser maior que a mesada dele
            if (valorDoce > mesada)
            //em sendo maior ele iguala para que dessa forma o valor nao seja negativo e sim ao final zerado.
            valorDoce = mesada;
            //escreve o valor do doce adcionado no carrinho
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");
            //na sequencia subtraia o valor diminuindo a mesada para o proxima interacao
            mesada = mesada - valorDoce;
        }
        // ao final que o valor da mesada acabe zere, esquece o valor que ficou da mesada e falando que joaozinho gastou tudo com doces
        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou toda a sua mesada em doces.");
    }
    //metodo criado para gerar os valores aleatorio para a variavel valorAleatorio
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
