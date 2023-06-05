import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Escolha o exercicio: (De 1 a ");
        System.out.println("Obs: os exercicios 2 e 3 estao na opcao 2.");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        if (op == 1){
            System.out.println("Escrava a palavra para ser impresa de forma inversa: ");
            String palavra = scan.next();
            PilhaChar palavraInvert = new PilhaChar();

            //Preenchendo a pilha com a palavra
            for (int i = 0; i < palavra.length(); i++) {
                char letra = palavra.charAt(i);
                palavraInvert.push(letra);
            }

            System.out.print("A palavra '"+ palavra + "' de forma invertida: ");
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(palavraInvert.show());
                palavraInvert.topo--;
            }
        }

        else if (op == 2) {
            PilhaInt pilha = new PilhaInt();
            System.out.println("Digite um elemento: ");
            int var = scan.nextInt();
            System.out.println("Qual o topo: ");
            int topo = scan.nextInt();
            pilha.push2(var,topo);

            System.out.println("Digite outro elemento: ");
            var= scan.nextInt();
            System.out.println("Qual o topo: ");
            topo = scan.nextInt();
            pilha.push2(var,topo);

            System.out.println("Digite outro elemento: ");
            var= scan.nextInt();
            System.out.println("Qual o topo: ");
            topo = scan.nextInt();
            pilha.push2(var,topo);

            System.out.println("A seguir temos o procedimento para excluir elemento ");
            System.out.println("Qual o topo: ");
            topo = scan.nextInt();
            pilha.pop(topo);
            System.out.println("Topo da pilha: " + pilha.topo);

            for (int i = 0; i < pilha.topo; i++) {
                System.out.println(pilha.show());
                pilha.topo--;
            }
        }
    }
}
