package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aresta {
    private String nome;
    private Vertice origem;
    private Vertice destino;
    private int distancia;
    private int peso;

    public String toString() {
        return "Aresta " + (nome.isEmpty() ? ":" : nome + ": ") + "("+ origem.getNome()+ ", " + destino.getNome() + ", " + distancia + ")";
    }
}
