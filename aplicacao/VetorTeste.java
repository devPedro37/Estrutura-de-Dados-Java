package aplicacao;

//IMPORTS
import model.Aluno;
import  array.Array;

//CLASSE CRIADA PARA TESTAR A APLICACAO
public class VetorTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Manel");
        Aluno aluno3 = new Aluno("Jakson");

        Array arrayAluno = new Array();

        //ADICIONANDO ALUNO NA LISTA
        arrayAluno.adicionarAluno(aluno1);
        arrayAluno.adicionarAluno(aluno2);
        arrayAluno.adicionarAluno(aluno3);

        //PRINTANDO A LISTA
        System.out.println(arrayAluno);

        //VERIFICANDO O TAMANHO ATUAL DA LISTA
        System.out.println(arrayAluno.tamanhoLista());
    }
}
