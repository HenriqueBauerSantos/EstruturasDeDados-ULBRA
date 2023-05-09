public class ListaDupEnca {
    Elemento inicio;
    Elemento fim;
    int tamanho;

    public boolean addInicio(Elemento e){
        if (this.inicio ==null){
            this.inicio =e;
            this.tamanho++;
            this.fim=e;
        }else{
            Elemento aux=this.inicio;
            e.anterior=null;
            e.proximo=aux;
            aux.anterior=e;
            this.inicio =e;
            this.tamanho++;
        }
        return true;
    }
    public void exibir(){
        Elemento current = this.inicio;
        while (current!=null){
            System.out.print(current.valor+ " ");
            current=current.proximo;
        }
    }
    public void exibirInvertido(){
        Elemento current = this.fim;
        while (current!=null){
            System.out.print(current.valor+ " ");
            current=current.anterior;
        }
    }
    public boolean addFim(Elemento e){
        if (this.inicio ==null){
            this.addInicio(e);
        }
        else {
            Elemento aux=fim;
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
            Elemento aux = inicio;
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
            Elemento aux= fim.anterior;
            aux.proximo=null;
            fim=aux;
            tamanho--;
        }
        return true;
    }
    public void obterElemento(int p){
        int cont=0;
        Elemento aux=this.inicio;
        while (aux.proximo!=null){
            if (cont==p){
                break;
            }
            cont++;
            aux=aux.proximo;
        }
        System.out.println(aux.valor+" ");
    }

}
