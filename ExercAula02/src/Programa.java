import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        for (int i=0; i!=99;i++){
            Scanner scan = new Scanner(System.in);
            Operacoes opr = new Operacoes();
            int opc=0;
            System.out.println("Escolha o exercicio a ser executado:");
            System.out.println("1- Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma e em seguida exibe a relação de nomes cuja nota é superior a esta média. Utilize vetores para armazenar as notas");
            System.out.println("2- Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada. Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).");
            System.out.println("3- Leia um conjunto de alunos, cada uma com o nome e a nota. Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma.");
            System.out.println("4- Leia um conjunto de valores inteiros e em seguida os exiba-os na ordem inversa do que foram digitados.");
            System.out.println("5- Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja, na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em seguida, exiba os valores deste vetor.");
            System.out.println("6- Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu preenchimento automático de forma randômica. Em seguida, exiba os valores deste vetor.");
            System.out.println("99- Encerrar programa.");
            opc= scan.nextInt();
            if (opc==1){
                String nomes[] = new String[5];
                float notas[]= new float[5];
                float mediaNotas=0,somaNotas=0;
                for (int j=0;j<5;j++) {
                    nomes[j] = opr.obterNomes(j);
                    notas[j] = opr.obterNotasComNome(nomes[j]);
                };
                for (int j=0;j<5;j++){
                    somaNotas+= notas[j];
                };
                mediaNotas=(somaNotas/5);
                System.out.println("A media das notas ficou: " + mediaNotas);
                for (int j=0;j<5;j++){
                    if (notas[j]>mediaNotas){
                        System.out.println("O aluno " + nomes[j] + " ficou acima da media.");
                    };
                }
                System.out.println("Exercicio encerrado.\n");
            }
            else if (opc==2) {
                float mediaNotas=0,somaNotas=0;
                int quant;
                System.out.println("Digite quantas notas quer inserir:");
                quant = scan.nextInt();
                float notas[]= new float[quant];
                for (int j=0;j<quant;j++) {
                    notas[j] = opr.obterNotas(j);
                };
                for (int j=0;j<quant;j++){
                    somaNotas+= notas[j];
                };
                mediaNotas=(somaNotas/quant);
                System.out.println("A media das notas ficou: " + mediaNotas);
                for (int j=0;j<quant;j++){
                    if (notas[j]>mediaNotas){
                        System.out.println("O aluno " + (j+1) +" com a nota "+ notas[j] + " ficou acima da media.");
                    };
                }
                for (int j=0;j<quant;j++){
                    if (notas[j]<mediaNotas){
                        System.out.println("O aluno " + (j+1) +" com a nota "+ notas[j] + " ficou abaixo da media.");
                    };
                }
                System.out.println("Exercicio encerrado.\n");

            }
            else if (opc==3) {
                int quant;
                System.out.println("Digite quantas notas quer inserir:");
                quant = scan.nextInt();
                String nomes[] = new String[quant];
                float notas[]= new float[quant];
                float mediaNotas=0,somaNotas=0;
                for (int j=0;j<quant;j++) {
                    nomes[j] = opr.obterNomes(j);
                    notas[j] = opr.obterNotasComNome(nomes[j]);
                };
                for (int j=0;j<quant;j++){
                    somaNotas+= notas[j];
                };
                mediaNotas=(somaNotas/quant);
                System.out.println("A media das notas ficou: " + mediaNotas);
                System.out.println("Lista de alunos que ficaram acima da media da turma:");
                for (int j=0;j<quant;j++){
                    if (notas[j]>mediaNotas){
                        System.out.println(nomes[j]);
                    };
                }
                System.out.println("Exercicio encerrado.\n");
            }
            else if (opc==4) {
                int quant= opr.solicitarQuantNum();
                int nums[] = new int[quant];
                for (int j=0;j<quant;j++){
                  nums[j]=opr.obterInt(j);
                };
                System.out.println("Ordem inversa a digitada:");
                for (int j=(quant-1);j>(-1);j--){
                    System.out.println(nums[j]);
                };
                System.out.println("Exercicio encerrado.\n");
            }
            else if (opc==5) {
                int nums[]= new int[50];
                for (int j=0;j<50;j++){
                    nums[j]= (j+101);
                };
                for (int j=0;j<50;j++){
                    System.out.println(nums[j]);
                };
                System.out.println("Exercicio encerrado.\n");
            }
            else if (opc==6) {
                int nums[]= new int[50];
                Random ram = new Random();
                for (int j=0;j<50;j++){
                    nums[j]= ram.nextInt();
                };
                for (int j=0;j<50;j++){
                    System.out.println(nums[j]);
                };
                System.out.println("Exercicio encerrado.\n");
            }
            else if (opc==99) {
                System.out.println("Programa encerrado.\n");
                break;
            }
            else
                System.out.println("Opcao invalida\n");
        };
    }
}