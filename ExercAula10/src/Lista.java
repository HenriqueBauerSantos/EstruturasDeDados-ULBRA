public class Lista {
    Elemento inicio;
    Elemento fim;
    int tamanho;


    public boolean add(Elemento e){
        if (this.inicio ==null){
            addFirst(e);
            this.fim=e;
        }else{
            e.proximo=this.inicio;
            this.inicio =e;
            this.tamanho++;
        }
        return true;
    }
    public boolean addFirst(Elemento e){
        this.inicio =e;
        this.tamanho++;
        return true;
    }
    public boolean addFim(Elemento e){
        if (this.inicio ==null){
            this.addFirst(e);
        }
        else {
            Elemento aux=fim;
            aux.proximo=e;
            fim=e;
            this.tamanho++;
        }
        return true;
    }
    public int getTamanho(){
        int tam=0;
        Elemento e=this.inicio;
        while(e!= null){
            tam++;
            e=e.proximo;
        }
        return tam;
    }
    public boolean removerInicio(){
        if (tamanho==1){
            inicio =null;
            fim=null;
            tamanho=0;
        }else {
            Elemento aux = inicio;
            inicio = aux.proximo;
            tamanho--;
        }
        return true;
    }
    public boolean removerFim(){
        Elemento current=this.inicio;
        Elemento anterior = this.inicio;
        while (current.proximo!=null){
            anterior=current;
            current=current.proximo;
        }
        anterior.proximo=null;
        fim=anterior;
        tamanho--;
        return true;
    }
    public boolean removerAt(int p){
        if (p==0){
            return removerInicio();
        }
        if (p==(tamanho-1)) {
            return  removerFim();
        }
        int cont=0;
        Elemento remocao=this.inicio;
        Elemento anterior = this.inicio;
        while (remocao.proximo!=null){
            if (cont==p){
                break;
            }
            cont++;
            anterior=remocao;
            remocao=remocao.proximo;
        }
        anterior.proximo=remocao.proximo;
        tamanho--;
        return true;
    }
    public void exibir(){
        Elemento current = this.inicio;
        while (current!=null){
            System.out.print(current.valor+ " ");
            current=current.proximo;
        }
    }

}
