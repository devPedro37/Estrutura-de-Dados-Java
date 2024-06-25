package array;

//IMPORTS
import model.Aluno;
import java.util.Arrays;

//CLASSE PARA REPRESENTAR A ESTRUTURA DE DADOS ARRAY
public class Array {

    //VETOR É UM ARMAZENAMENTO SEQUENCIAL

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
        this.aumentaEspaco();

        this.Vetoralunos[totalDeAlunos] = aluno; //É CRIADO UMA VARIÁVEL QUE GUARDA A QUANTIDADE DE ALUNOS E É INICIADA COM 0. DENTRO DO ADICIONAR, É CHAMADO O VETOR DE ALUNOS E PASSAMOS
        totalDeAlunos++;                                    //E PASSAMOS A POSIÇÃO QUE INDICA QUANTOS ALUNOS TEM CADASTRADO NO ARRAY E A PRÓXIMA POSIÇÃO VAZIA. QUANDO ADICIONAMOS UM ALUNO ELE GUARDA
    }                                                                  // NA VARIÁVEL A POSIÇÃO DO OBJETO ALUNO, INCREMENTA E APONTA O ESPAÇO VAZIO.


    //MÉTODO AUXILIAR QUE VERIFICA SE A POSIÇÃO DO USUÁRIO É VÁLIDA
    private boolean posicaoValida(int posicao, Aluno aluno){
            return posicao >= 0 && posicao <= totalDeAlunos;
    }
    //MÉTODO QUE ADICIONA O ALUNO EM QUALQUER POSIÇÃO DO ARRAY
    public void adiciona(int posicao, Aluno aluno){
        if(!posicaoOcupada(posicao)){
            throw  new IllegalArgumentException("A posição que voê inseriu é inválida, tente outra posição!");
        }
        for(int i = totalDeAlunos -1; i >= posicao; i -=1){
            Vetoralunos[i+1] = Vetoralunos[i];
        }
        Vetoralunos[posicao] = aluno;
        totalDeAlunos++;
    }

    //MÉTODO QUE VERIFICA SE A POSIÇÃO É VÁLIDA OU NÃO (TAMANHO PASSADO)
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }
    //PEGAR UM ALUNO DO ARRAY
    public Aluno posicaoAluno(int posicao) {
        this.aumentaEspaco();
        if(!posicaoOcupada(posicao)){
                throw new IllegalArgumentException("A posição que você passou, é inválida tente outra!");
        }
        return Vetoralunos[posicao];
    }

    //REMOVER ALUNO
    public void removerAluno(int posicao) {
            for(int i = 0; i < this.totalDeAlunos; i++){
                    this.Vetoralunos[i] = this.Vetoralunos[i+1];
            }
            this.totalDeAlunos--;
            this.Vetoralunos[totalDeAlunos] = null;
    }

    //VERIFICAR SE UM ALUNO ESTÁ NA LISTA (contém)
    public boolean existeAluno(Aluno aluno) {
    //É NECESSÁRIO PERCORRER A LISTA PARA VERIFICAR SE O ALUNO ESTÁ NA LISTA
        for(int i = 0; i < totalDeAlunos; i++){
            if(aluno.equals(Vetoralunos[i])){ // OU PODE SER ASSIM Vetoralunos[i] == aluno PORÉM A VERSÃO NO IF É MELHOR.
                return true;
            }
        }
        return false;
    }

    //MÉTODO QUE VERIFICA O TAMANHO DO ARRAY DE ALUNOS
    public int tamanhoLista() {
        return totalDeAlunos; //PASSAMOS O totalDeAlunos POIS ELA GUARDA A QUANTIDADE DE OBJETOS NA LISTA A POSIÇÃO DELES;
    }

    //MÉTODO QUE AUMENTA O TAMANHO DO ARRAY QUANDO ELE ESTÁ CHEIO
    public void aumentaEspaco() {
        Aluno[] novoArray = null;
        if (totalDeAlunos == Vetoralunos.length) {
            novoArray = new Aluno[Vetoralunos.length * 2];
            for (int i = 0; i < Vetoralunos.length; i++) {
                novoArray[i] = Vetoralunos[i]; // COPIANDO OS DADOS DO ARRAY ANTIGO PARA O NOVO
            }
        this.Vetoralunos = novoArray;
        }
    }

    //TOSTRING DO ARRAY
    //PEGA TODOS OS ELEMENTOS DO ARRAY E CHAMA O TOSTRING PARA TODOS ELES
    public String toString() {
        return Arrays.toString(Vetoralunos);
    }
}