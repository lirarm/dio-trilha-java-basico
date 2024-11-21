public class ExemplosFor {
    public static void main(String[] args) throws Exception {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
// exemplo comum com funcao length - tamanho array
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
// exemplo each - abreviado ( variavel de escopo temporaria aluno )
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
