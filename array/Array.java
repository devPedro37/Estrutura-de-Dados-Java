package array;

//IMPORTS
import model.Aluno;
import java.util.Arrays;

//CLASSE PARA REPRESENTAR A ESTRUTURA DE DADOS ARRAY
public class Array {

    //INSTANCIAÇÃO DO ARRAY DE ALUNOS
    //ESTRUTURA: tipo, declaração dos colchetes, nomeArray, criação do objeto e tamanhoArray
    private Aluno[] Vetoralunos = new Aluno[100];
    private int totalDeAlunos = 0;

    //IMPLEMENTAÇÃO DAS AÇÕES DA CLASSE

    //ADICIONAR ALUNO
    public void adicionarAluno(Aluno aluno) {
       /* for(int i = 0; i < alunos.length; i++){ ESTA FORMA DE ADICIONAR ALUNO TEM UM ERRO. NA PRIMEIRA VEZ QUE ESTOU EXECUTANDO O LAÇO ELE VAI ENCONTRAR UMA POSIÇÃO VAZIA, MAS E SE EU
            if(alunos[i] == null){                         QUISER ADICIONAR UM ALUNO E A POSIÇÃO DISPONÍVEL FOR A POSIÇÃO 71? ELE IRÁ PERCORRER O LAÇO 70 VEZES PARA ADICIONAR TORNANDO O ALGORITMO LENTO
                alunos[i] = aluno;
                break;
            }
        }
        */
        //NOVA IMPLEMENTAÇÃO
        this.Vetoralunos[totalDeAlunos] = aluno; //É CRIADO UMA VARIÁVEL QUE GUARDA A QUANTIDADE DE ALUNOS E É INICIADA COM 0. DENTRO DO ADICIONAR, É CHAMADO O VETOR DE ALUNOS E PASSAMOS
        totalDeAlunos++;                                    //E PASSAMOS A POSIÇÃO QUE INDICA QUANTOS ALUNOS TEM CADASTRADO NO ARRAY E A PRÓXIMA POSIÇÃO VAZIA. QUANDO ADICIONAMOS UM ALUNO ELE GUARDA
    }                                                                  // NA VARIÁVEL A POSIÇÃO DO OBJETO ALUNO, INCREMENTA E APONTA O ESPAÇO VAZIO.

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
        return totalDeAlunos; //PASSAMOS O totalDeAlunos POIS ELA GUARDA A QUANTIDADE DE OBJETOS NA LISTA A POSIÇÃO DELES;
    }

    //TOSTRING DO ARRAY
    //PEGA TODOS OS ELEMENTOS DO ARRAY E CHAMA O TOSTRING PARA TODOS ELES
    public String toString() {
        return Arrays.toString(Vetoralunos);
    }
}