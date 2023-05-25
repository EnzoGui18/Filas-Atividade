package questao2;


public class Chamada{

    private int id;
    private int prioridade;
    private String cliente;
    
    public Chamada(int id, int prioridade, String cliente) {
        this.id = id;
        this.prioridade = prioridade;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getCliente() {
        return cliente;
    }

}