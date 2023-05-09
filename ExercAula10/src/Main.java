public class Main {
    public static void main(String[] args) {
        Elemento a = new Elemento();
         a.valor=12;
        Elemento b = new Elemento();
        b.valor=13;
        Elemento c = new Elemento();
        c.valor=14;
        Elemento d = new Elemento();
        d.valor=100;
        Elemento e = new Elemento();
        e.valor=110;
        Elemento f = new Elemento();
        f.valor=120;
        Elemento g = new Elemento();
        g.valor=130;

        Lista minhaLista = new Lista();
        minhaLista.add(a);  // add A,B,C
        minhaLista.add(b);
        minhaLista.add(c);
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
        minhaLista.addFim(d);  //Add no fim D
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
        minhaLista.add(e);  //add E,F,G
        minhaLista.add(f);
        minhaLista.add(g);
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
        minhaLista.removerAt(3);  // Removendo posicao 3
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
        minhaLista.removerInicio(); //Removendo o primeiro
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
        minhaLista.removerFim();  //Removendo no fim
        System.out.println("Tamanho da lista: "+minhaLista.getTamanho());
        minhaLista.exibir();
    }
}
