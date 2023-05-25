package questao2;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;


public class Atendimento {

    public static void main(String[] args) {
        PriorityQueue<Chamada> filaChamadas = new PriorityQueue<>((c1,c2) -> c2.getPrioridade() - c1.getPrioridade());
        Queue<Atendente> filaaAtendentes = new LinkedList<>();
        Chatbot chatbot = new Chatbot("Suporte");

        filaChamadas.add(new Chamada(1, 2, "Cliente A"));
        filaChamadas.add(new Chamada(2, 1, "Cliente B"));
        filaChamadas.add(new Chamada(3, 3, "Cliente C"));

        filaaAtendentes.add(new Atendente(1, false));
        filaaAtendentes.add(new Atendente(2, false));

        while(!filaChamadas.isEmpty()){
            Chamada chamada = filaChamadas.poll();

            if (chamada.getPrioridade()> 2){
                chatbot.responder("Consulta do cliente" + chamada.getCliente());
            } else {
                Atendente atendente = filaaAtendentes.poll();
                if (atendente != null){
                    System.out.println("Chamada " + chamada.getId() + " sendo atendida pelo atendente " + atendente.getId());
                    atendente.setLivre(false);
                    atendente.setLivre(true);
                    filaaAtendentes.add(atendente);
                } else {
                    System.out.println("Chamada " + chamada.getId() + " aguardando atendente");
                    filaChamadas.add(chamada);
                }
            }
        }

    }
}

        
        