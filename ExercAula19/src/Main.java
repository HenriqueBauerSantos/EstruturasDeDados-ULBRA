public class Main {
    public static void main(String[] args) {
        Grafo amigos = new Grafo(5);
        amigos.adicionarAresta(0,1);
        amigos.adicionarAresta(1,2);
        amigos.adicionarAresta(2,3);
        amigos.adicionarAresta(3,4);

        amigos.imprimirGrafo();
    }
}
