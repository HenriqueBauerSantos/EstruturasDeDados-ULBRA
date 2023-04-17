public class Exemplo02 {
    public static void main(String[] args) {
        int [] vetor = new  int[10];
        int qtd=0;

        vetor[qtd]=7;
        qtd+=1;
        vetor[qtd]=5;
        qtd+=1;

        for (int i = 0; i <qtd ; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Tamanho:"+vetor.length);
        System.out.println("Quantidade:" + qtd);
    }
}
