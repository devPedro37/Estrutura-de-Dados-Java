package model;

//CLASSE PARA REPRESENTAR A ENTIDADE ALUNO
public class Aluno {

    //ATRIBUTOS
    private String nome;


    //CONSTRUTORES
    public Aluno(String nome) {
        this.nome = nome;
    }


    //TO STRING
    @Override
    public String toString() {
        return nome;
    }

    //EQUALS
    @Override
    public boolean equals(Object obj) {
    Aluno outro = (Aluno) obj;
    return outro.getNome().equals(this.nome);
    }

    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
