import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando... ");
        do{
            //executando repetidas vezes
            System.out.println("Telefone tocando...");
            //enquanto a variavel tocando for verdadeira true executa o que tiver dentro do "do while"
        }while (tocando());
        System.out.println("Alô !!!");
    }
    private static boolean tocando (){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
