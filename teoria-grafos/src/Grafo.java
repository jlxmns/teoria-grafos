public class Grafo {
    Aresta[] arestas;
    Vertice[] vertices;
    int ordem = setOrdem();
    int tamanho = setTamanho();
    boolean direcionado = isDirecionado();

    public Aresta[] getArestas() {
        return arestas;
    }

    public void setArestas(Aresta[] arestas) {
        this.arestas = arestas;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }

    public int getOrdem() {
        return ordem;
    }

    public int setOrdem() {
        return vertices.length;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int setTamanho() {
        return arestas.length;
    }

    public boolean isDirecionado() {
        Aresta arestas[] = getArestas();
        return direcionado;
    }

    public boolean getDirecionado(boolean direcionado) {
        return direcionado;
    }

    private boolean hasSelfLoop(Aresta a1) {
        return a1.getOrigem() == a1.getDestino();
    }
}
