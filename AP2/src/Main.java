public class Main {
    public static void main(String[] args) {
        //Definindo as variaveis:
        Node a = new Node();
        a.valor = 11;
        Node b = new Node();
        b.valor = 254;
        Node c = new Node();
        c.valor = 21;
        Node d = new Node();
        d.valor = 2;
        Node e = new Node();
        e.valor = 111;
        Node f= new Node();
        f.valor=45;

        LinkedList minhaLista = new LinkedList();
        //Inserindo os valores na ordem solicitada:
        minhaLista.addInicio(a);
        minhaLista.addFim(b);
        minhaLista.addInicio(c);
        minhaLista.addInicio(d);
        minhaLista.addFim(e);
        minhaLista.addAposUmaPosicao(2,f);
        minhaLista.exibir();

        //Crescente no metodo bubble sort

        LinkedList OrdenadaCresc = new LinkedList();
        OrdenadaCresc=minhaLista;
        OrdenadaCresc.ordenarCrescente();
        System.out.println("\nOrdenacao crescente:");
        OrdenadaCresc.exibir();

        //Decrescente no metodo selection sort

        LinkedList ordenadaDecresc = new LinkedList();
        ordenadaDecresc=minhaLista;
        ordenadaDecresc.ordenarDecrescente();
        System.out.println("\nOrdenacao decrescente:");
        ordenadaDecresc.exibir();
    }
}