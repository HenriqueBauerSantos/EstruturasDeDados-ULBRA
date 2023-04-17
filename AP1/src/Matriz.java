import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public int[][] gerarMatriz( int x,int y){
        Random gerador = new Random();
        int[][] t = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                  t[i][j]= gerador.nextInt(2);
            }
        }
        return t;
    }
    public int[][] gerarMatrizTest( int x,int y){
        Random gerador = new Random();
        int[][] t = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                t[i][j]= gerador.nextInt(2);
            }
        }
        t[0][0]=1;
        t[0][1]=1;
        t[1][0]=1;
        t[1][1]=0;
        t[2][0]=0;
        t[2][1]=1;
        System.out.println("Test");
        return t;
    }
    public int buscaPadraoExerc(int[][] t, int X,int Y){
        int a=1,b=1,c=1,d=0,e=0,f=1,cont=0;
        int x=(X-3),y=(Y-2);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (t[i][j]==1 && t[i][(j+1)]==1 && t[(i+1)][j]==1 &&
                        t[(i+1)][(j+1)]==0 && t[(i+2)][j]==0 &&
                        t[(i+2)][(j+1)]==1){
                    //System.out.println("Padrao encontrado!!");
                    cont++;
                }
            }
        }
        return cont;
    }
    public int buscaPadraoAleatorio(int[][] t, int X,int Y){
        int a,b,c,d,e,f,cont=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o matriz[0][0]:");
        a=scan.nextInt();
        System.out.println("Digite o matriz[0][1]:");
        b=scan.nextInt();
        System.out.println("Digite o matriz[1][0]:");
        c=scan.nextInt();
        System.out.println("Digite o matriz[1][1]:");
        d=scan.nextInt();
        System.out.println("Digite o matriz[2][0]:");
        e=scan.nextInt();
        System.out.println("Digite o matriz[2][2]:");
        f=scan.nextInt();
        int x=(X-3),y=(Y-2);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (t[i][j]==a && t[i][(j+1)]==b && t[(i+1)][j]==c &&
                        t[(i+1)][(j+1)]==d && t[(i+2)][j]==e &&
                        t[(i+2)][(j+1)]==f){
                    //System.out.println("Padrao encontrado!!");
                    cont++;
                }
            }
        }
        return cont;
    }

    public int contarUnit(int[][] m, int x, int y){
        int cont = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cont++;
            }
        }
        return cont;
    }
}
