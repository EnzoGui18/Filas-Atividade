package questao3;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorEspecialista {
    private List<Especialista> especialistas;

    // Construtor
    public void GerenciadorEspecialistas() {
        especialistas = new ArrayList<>();
    }

    // Adicionar especialista
    public void adicionarEspecialista(Especialista especialista) {
        especialistas.add(especialista);
    }

    // Remover especialista
    public void removerEspecialista(Especialista especialista) {
        especialistas.remove(especialista);
    }

    // Encontrar especialista disponível com base na área de especialização
    public Especialista encontrarEspecialistaDisponivel(String areaEspecializacao) {
        for (Especialista especialista : especialistas) {
            if (especialista.getAreaEspecializacao().equals(areaEspecializacao)) {
                return especialista;
            }
        }
        return null;
    }
}
