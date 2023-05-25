package questao3;

public class Chamado {
    
    private int id;
    private String tipo;
    private int prioridade;
    
    public Chamado(int id, String tipo, int prioridade) {
        this.id = id;
        this.tipo = tipo;
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    
}
