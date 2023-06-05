public class LinkedList {
    Node inicio;
    Node fim;
    int tamanho;

    public boolean addInicio(Node e){
        if (this.inicio ==null){
            this.inicio =e;
            this.tamanho++;
            this.fim=e;
        }else{
            Node aux=this.inicio;
            e.anterior=null;
            e.proximo=aux;
            aux.anterior=e;
            this.inicio =e;
            this.tamanho++;
        }
        return true;
    }
    public void exibir(){
        Node current = this.inicio;
        while (current!=null){
            System.out.print(current.valor+ " ");
            current=current.proximo;
        }
    }
    public void exibirInvertido(){
        Node current = this.fim;
        while (current!=null){
            System.out.print(current.valor+ " ");
            current=current.anterior;
        }
    }
    public boolean addFim(Node e){
        if (this.inicio ==null){
            this.addInicio(e);
        }
        else {
            Node aux=fim;
            aux.proximo=e;
            e.anterior=aux;
            e.proximo=null;
            fim=e;
            this.tamanho++;
        }
        return true;
    }
    public boolean removerInicio(){
        if (tamanho==1){
            inicio =null;
            fim=null;
            tamanho=0;
        }
        if (tamanho>1){
            Node aux = inicio;
            inicio = aux.proximo;
            inicio.anterior=null;
            tamanho--;
        }
        return true;
    }
    public boolean removerFim(){
        if (tamanho==1){
            inicio =null;
            fim=null;
            tamanho=0;
        }
        if (tamanho>1){
            Node aux= fim.anterior;
            aux.proximo=null;
            fim=aux;
            tamanho--;
        }
        return true;
    }
    public void obterElemento(int p){
        int cont=0;
        Node aux=this.inicio;
        while (aux.proximo!=null){
            if (cont==p){
                break;
            }
            cont++;
            aux=aux.proximo;
        }
        System.out.println(aux.valor+" ");
    }
    public void addAposUmaPosicao(int p,Node num){
        int cont=0;
        Node aux=this.inicio,aux2;
        while (aux.proximo!=null){
            if (cont==p){
                break;
            }
            cont++;
            aux=aux.proximo;
        }
        aux2=aux.proximo;
        aux.proximo=num;
        num.anterior=aux;
        num.proximo=aux2;
        aux2.anterior=num;
    }
    public void ordenarCrescente(){
        Node aux;
        int op=1,troc;
        while (op>0){
            op=0;
            aux=inicio;
            while (aux !=null && aux.proximo !=null){
                if (aux.valor>aux.proximo.valor){
                    //trocar valores
                    troc=aux.proximo.valor;
                    aux.proximo.valor=aux.valor;
                    aux.valor=troc;
                    op++;
                }
                aux=aux.proximo;
            }
        }
    }
    public void ordenarDecrescente(){
        Node current, maxNode;
        int tam = tamanho;
        while (tam > 1) {
            current = inicio;
            maxNode = current;
            //Procurando o maior
            for (int i = 1; i < tam; i++) {
                current = current.proximo;

                if (current.valor < maxNode.valor) {
                    maxNode = current;
                }
            }

            // Trocar os valores
            int temp = fim.valor;
            fim.valor = maxNode.valor;
            maxNode.valor = temp;
            tam--;
            fim = fim.anterior;
        }
    }
}
