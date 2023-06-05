import java.util.Scanner;

public class Recursividade {
    public static int CalcularFatorial(int n){
        if (n ==0){
            return 1;
        }
        return n * CalcularFatorial(n-1);
    }
    public static int SomarFatorial(int[] vetor,int tamanho){
        if (tamanho == 0){
            return 0;
        }
        return vetor[tamanho-1]+SomarFatorial(vetor,tamanho-1);
    }
    public static boolean verificarPalindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true;
        }
        if (palavra.charAt(0) == palavra.charAt(palavra.length() - 1)) {
            return verificarPalindromo(palavra.substring(1, palavra.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op=1;
        while (op==1 || op==2 || op==3){
            System.out.println("Escolha o exercicio: ");
            System.out.println("Exercicio 1: Soma dos Elementos de um Vetor de Inteiros.\nExercicio 2: Fatorial de um Numero.");
            System.out.println("Exercicio 3: Verificacao de Palindromo.\nDigite o numero do exercicio:");
            op=scan.nextInt();
            if (op==1){
                System.out.println("Numero de elementos do vetor: ");
                int tam = scan.nextInt();
                int x[] = new int[tam];
                for (int i = 0; i < tam; i++) {
                    System.out.println("Digite o "+(1+i)+" elemento:");
                    x[i]= scan.nextInt();
                }
                int soma = SomarFatorial(x,tam);
                System.out.println("A soma dos elementos do vetor: "+soma);
            } else if (op == 2){
                System.out.println("Digite o numero:");
                int x = scan.nextInt();
                int resultado=CalcularFatorial(x);
                System.out.println("O fatorioal de "+x+" e: "+resultado);
            } else if (op == 3){
                Scanner Scanner = new Scanner(System.in);
                System.out.println("Digite a palavra: ");
                String palavra = Scanner.nextLine();
                Boolean resultado = verificarPalindromo(palavra);
                if (resultado == true){
                    System.out.println("A palavra "+palavra+" e um palindromo.");
                }else{
                    System.out.println("A palavra "+palavra+" nao e um palindromo.");
                }
            }else {
                System.out.println("Opcao invalida, programa encerrado.");
            }
        }
    }
}
