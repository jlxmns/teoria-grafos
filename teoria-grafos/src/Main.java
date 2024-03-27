import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vertice v1 = new Vertice();
        Vertice v2 = new Vertice();
        Vertice v3 = new Vertice();
        v1.setNome("v1");
        v2.setNome("v2");
        v3.setNome("v3");
        v1.setGrau(1);
        v2.setGrau(1);
        v3.setGrau(1);
        Vertice[] vertices = new Vertice[3];
        vertices[0] = v1;
        vertices[1] = v2;
        vertices[2] = v3;

        Aresta a1 = new Aresta();
        Aresta a2 = new Aresta();
        Aresta a3 = new Aresta();
        a1.setOrigem(v1);
        a1.setDestino(v2);
        a2.setOrigem(v2);
        a2.setDestino(v3);
        a3.setOrigem(v3);
        a3.setDestino(v1);
        Aresta[] arestas = new Aresta[3];
        arestas[0] = a1;
        arestas[1] = a2;
        arestas[2] = a3;

        Grafo grafo = new Grafo();
        grafo.setArestas(arestas);
        grafo.setVertices(vertices);
        System.out.println(Arrays.toString(grafo.getVertices()));
    }
}