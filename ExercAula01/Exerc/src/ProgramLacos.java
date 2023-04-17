import java.util.Scanner;

public class ProgramLacos {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int opcao=0;
        do {
            System.out.println("Digite o exercicio a ser executado:\n");
            System.out.println("1- Solicitar a idade de um número indefinido de  pessoas e imprimir a média de idade lidas. O programa se encerra quando a média de idade for superior a 20 anos.\n");
            System.out.println("2- Solicitar a idade de um número indefinido de pessoas e imprimir a média de idade lidas. O programa se encerra quando a média de idade for superior a 20 anos ou que tenha lido 10 pessoas.\n");
            System.out.println("3- Escrever um programa que leia, valores inteiros, até ser lido o valor-99. Quando isso acontecer, o programa deverá escrever a soma e a média dos valores lidos.\n");
            System.out.println("4- Escrever um programa que receba vários números inteiros no teclado e no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).\n");

            opcao= scan.nextInt();

            if (opcao ==1){
                ObterIdades Idades= new ObterIdades();
                int i=0,SomaIdades=0;
                do {
                    SomaIdades = Idades.obterIdades(i,SomaIdades);
                    if ((Idades.media(i, SomaIdades))>20){
                        System.out.println("A media de idades atingiu "+ (Idades.media(i, SomaIdades)) + ".\n");
                        System.out.println("\nExercicio encerrado!\n");
                        break;
                    }
                    i++;
                }while (i<100);
            }
            else if (opcao==2){
                ObterIdades Idades= new ObterIdades();
                int i=0,SomaIdades=0;
                do {
                    SomaIdades = Idades.obterIdades(i,SomaIdades);
                    if ((Idades.media(i, SomaIdades))>20){

                        System.out.println("A media de idades atingiu "+ (Idades.media(i, SomaIdades)) + ".\n");
                        System.out.println("\nExercicio encerrado!\n");
                        break;
                    }
                    i++;
                }while (i==10);
                System.out.println("A media de idades atingiu "+ (Idades.media(i, SomaIdades)) + ".\n");
            }
            else if (opcao==3) {
                int num=0, soma=0,media =0,i=0;
                do {
                    System.out.println("Digite um numero:\n");
                    num= scan.nextInt();
                    if (num==99){
                        System.out.println("A soma dos numeros é: "+soma+"\n");
                        System.out.println("A media dos numeros é: "+media+"\n");
                        break;
                    };
                    soma= soma+num;
                    media = soma/(i+1);
                    i++;
                }while (num!=99);
            }
            else if (opcao==4) {
                int num=0, soma=0,resul,i=0, med;
                Numeros numeros = new Numeros();
                ObterIdades media = new ObterIdades();
                do {
                    num= numeros.obterNum(i);
                    if (num==0){
                        med= media.media((i-1),soma);
                        resul= med*3;
                        System.out.println("O dos numeros multiplicado por 3 é: "+resul+"\n");
                        break;
                    };
                    soma= numeros.somaNumeros(soma,num);
                    i++;
                }while (num!=(-1));
            }
        }while(opcao==50);
    }

}
