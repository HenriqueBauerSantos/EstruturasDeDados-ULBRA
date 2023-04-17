public class pilha {
    private int[] dados;
    private int topo;

    public pilha(int tamanho) {
        dados = new int[tamanho];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == dados.length - 1) {
            System.out.println("Pilha cheia!");
        }
        topo++;
        dados[topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        }
        int valor = dados[topo];
        topo--;
        return valor;
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}

