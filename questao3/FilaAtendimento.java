package questao3;
import java.util.Queue;
import java.util.LinkedList;

public class FilaAtendimento {
    
    private Queue<Chamado> fila;

    public FilaAtendimento() {
        fila = new LinkedList<>();
    }
    
    public void adicionarChamado(Chamado chamado){
        fila.add(chamado);
    }

    public Chamado removerChamado(){
        return fila.poll();
    }
    public boolean vazia(){
        return fila.isEmpty();
    }
}
