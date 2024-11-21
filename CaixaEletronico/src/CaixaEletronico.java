public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
       double saldo = 25.0;
       double valorsolicitado = 17.0;

       if (valorsolicitado <= saldo)
            saldo = saldo - valorsolicitado;

            System.out.println("O novo valor do saldo é: " + saldo);
    }
}
