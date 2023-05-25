package questao3;

public class Especilalista {
    
    private int id;
    private String nome;
    private String especializaçao;
   
    public Especilalista(int id, String nome, String especializaçao) {
        this.id = id;
        this.nome = nome;
        this.especializaçao = especializaçao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecializaçao() {
        return especializaçao;
    }
}
