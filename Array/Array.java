package Array;

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

    //PEGAR UM ALUNO DO ARRAY

    //REMOVER ALUNO

    //VERIFICAR SE UM ALUNO ESTÁ NA LISTA (contém)

    //TAMANHO DO ARRAY DE ALUNOS

    //TOSTRING DO ARRAY
    //PEGA TODOS OS ELEMENTOS DO ARRAY E CHAMA O TOSTRING PARA TODOS ELES
    public String toString(){
        return Arrays.toString(alunos);
    }
}
