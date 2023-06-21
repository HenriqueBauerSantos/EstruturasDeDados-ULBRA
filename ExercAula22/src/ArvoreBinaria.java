public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adicionar(int valor) {
        raiz = adicionarNo(raiz, valor);
    }

    private No adicionarNo(No no, int valor) {
        if(no == null){
            return new No(valor);
        }

        if (valor < no.valor){
            no.esquerda = adicionarNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = adicionarNo(no.direita, valor);
        }else
            return  no;

        int fatorBalanco = calcularBalanceamento(no);

        if (fatorBalanco > 1 && valor < no.esquerda.valor){
            return rotacaoDireita(no);
        }

        if ( fatorBalanco < -1 && valor > no.direita.valor){
            return rotacaoEsquerda(no);
        }

        // Rotação dupla à direita
        if (fatorBalanco > 1 && valor > no.esquerda.valor){
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        // Rotação dupla à esquerda
        if (fatorBalanco < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;

    }
    private int calcularBalanceamento(No no) {
        if (no == null) {
            return 0;
        }

        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        return alturaEsquerda - alturaDireita;
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return 0;
        }

        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T = x.direita;

        // Realiza a rotação
        x.direita = y;
        y.esquerda = T;

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T = y.esquerda;

        // Realiza a rotação
        y.esquerda = x;
        x.direita = T;

        return y;
    }

    public void remover(int valor) {
        raiz = removerNo(raiz, valor);
    }

    private No removerNo(No no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor < no.valor) {
            no.esquerda = removerNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = removerNo(no.direita, valor);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }

            no.valor = encontrarMinimoValor(no.direita);
            no.direita = removerNo(no.direita, no.valor);
        }

        return no;
    }

    private int encontrarMinimoValor(No no) {
        int minimoValor = no.valor;
        while (no.esquerda != null) {
            minimoValor = no.esquerda.valor;
            no = no.esquerda;
        }
        return minimoValor;
    }

    public void percorrer(String x) {
        if (x == "Pos"|| x == "POS" || x == "pos"){
            percorrerPosOrdem(raiz);
        } else if (x == "Pre"|| x == "PRE" || x == "pre") {
            percorrerPreOrdem(raiz);
        }
        percorrerEmOrdem(raiz);
    }

    public void adicionarElementos( int[] element){
        for (int item: element) {
            adicionar(item);
        }
    }
    private void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerda);
            System.out.println(no.valor + " ");
            percorrerEmOrdem(no.direita);
        }
    }

    private void percorrerPosOrdem(No no) {
        if (no != null) {
            percorrerPosOrdem(no.esquerda);
            percorrerPosOrdem(no.direita);
            System.out.println(no.valor + " ");
        }
    }

    private void percorrerPreOrdem(No no) {
        if (no != null) {
            System.out.println(no.valor + " ");
            percorrerPreOrdem(no.esquerda);
            percorrerPreOrdem(no.direita);
        }
    }

    public void mostrarArvore() {
        mostrarArvoreRecursivamente(raiz, "-");
    }


    private void mostrarArvoreRecursivamente(No no, String prefixo) {

        if (no != null) {
            mostrarArvoreRecursivamente(no.direita, prefixo + "           ");
            System.out.println(prefixo + " |- " +no.valor);
            mostrarArvoreRecursivamente(no.esquerda, prefixo + "           ");
        }
    }
}
