public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        double nota = 6.5;

        if (nota >= 7){
            System.out.println("Aluno Aprovado.");
        } else if (nota >=5 && nota <7){
            System.out.println("Aluno de Recuperação.");
        } else
            System.out.println("Aluno Reprovado.");
    }
}
