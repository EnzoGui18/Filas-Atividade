package questao2;

public class Atendente {
    
    private int id;
    private boolean livre;
   
    public Atendente(int id, boolean livre) {
        this.id = id;
        this.livre = livre;
    }

    public int getId() {
        return id;
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }

}
