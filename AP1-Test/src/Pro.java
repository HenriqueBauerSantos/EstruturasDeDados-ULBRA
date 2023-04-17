import java.util.Random;
import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=0, y=0,op=0,quant;
        System.out.println("Digite quantas linhas:");
        x=scan.nextInt();
        System.out.println("Digite quantas colunas:");
        y=scan.nextInt();
        System.out.println("Matriz aleatoria ou de teste?");
        System.out.println("1-Aleatoria. \n2-Teste");
        op=scan.nextInt();
        Matriz m = new Matriz();
        int[][] exem;
        if (op==2){
            exem =  m.gerarMatrizTest(x,y);
        } else{
            exem =  m.gerarMatriz(x,y);
        }
        System.out.println("Quantas unidades na matriz: "+ m.contarUnit(exem, x, y));
        System.out.println("Deseja usar o padrao passado no exercicio(Opc num:1)," + " ou determinar outro(Opc num: 2)?");
        op=scan.nextInt();
        if (op==2){
            quant=m.buscaPadraoAleatorio(exem,x,y);
        }else {
            quant=m.buscaPadraoExerc(exem,x,y);
        }
        System.out.println("Quantidade de padroes encontrados: " + quant);



    }
}
