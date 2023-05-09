public class Main {
    public static void main(String[] args) {
        //Definindo as variaveis:
        Elemento a = new Elemento();
        a.valor = 5;
        Elemento b = new Elemento();
        b.valor = 8;
        Elemento c = new Elemento();
        c.valor = 3;
        Elemento d = new Elemento();
        d.valor = 2;
        Elemento e = new Elemento();
        e.valor = 7;

        ListaDupEnca minhaLista = new ListaDupEnca();
        //Inserindo os valores na ordem solicitada:
        minhaLista.addInicio(a);
        minhaLista.addInicio(b);
        minhaLista.addInicio(c);
        minhaLista.addInicio(d);
        System.out.println("\nExibindo a lista: ");
        minhaLista.exibir();

        //Adicionando o valor 7 ao final da lista:
        minhaLista.addFim(e);
        System.out.println("\nExibindo a lista: ");
        minhaLista.exibir();

        //Removendo o primeiro valor da lista:
        minhaLista.removerInicio();
        System.out.println("\nExibindo a lista: ");
        minhaLista.exibir();

        //Obtendo e imprimindo o valor na segunda posicao:
        System.out.println("\nExibindo a 2 posicao: ");
        minhaLista.obterElemento(1);

        //Removendo o ultimo valor da lista:
        minhaLista.removerFim();
        System.out.println("\nExibindo a lista: ");
        minhaLista.exibir();

        //Imprimindo a lista completa:
        System.out.println("\nExibindo a lista: ");
        minhaLista.exibir();

        //Imprimindo a lista de tras pra frente:
        System.out.println("\nExibindo a lista de tras para frente: ");
        minhaLista.exibirInvertido();

    }
}