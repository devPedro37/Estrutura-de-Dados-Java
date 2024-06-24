package array;

//IMPORTS
import model.Aluno;
import java.util.Arrays;

//CLASSE PARA REPRESENTAR A ESTRUTURA DE DADOS ARRAY
public class Array {

    //INSTANCIAÇÃO DO ARRAY DE ALUNOS
    //ESTRUTURA: tipo, declaração dos colchetes, nomeArray, criação do objeto e tamanhoArray
    private Aluno[] alunos = new Aluno[100];


    //IMPLEMENTAÇÃO DAS AÇÕES DA CLASSE

    //ADICIONAR ALUNO
    public void adicionarAluno(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }
    }

    //PEGAR UM ALUNO DO ARRAY
    public Aluno posicaoAluno(int posicao) {

        return null;
    }

    //REMOVER ALUNO
    public void removerAluno(int posicao) {

    }

    //VERIFICAR SE UM ALUNO ESTÁ NA LISTA (contém)
    public boolean existeAluno(Aluno aluno) {

        return false;
    }

    //TAMANHO DO ARRAY DE ALUNOS
    public int tamanhoLista() {
        return 0;
    }

    //TOSTRING DO ARRAY
    //PEGA TODOS OS ELEMENTOS DO ARRAY E CHAMA O TOSTRING PARA TODOS ELES
    public String toString() {
        return Arrays.toString(alunos);
    }
}