package questao2;

public class Chatbot {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Chatbot(String nome) {
        this.nome = nome;
    }
    
    public void responder(String consulta){

        System.out.println("Chatbot " + nome + " respondeu: " + consulta);
        
    }
}
