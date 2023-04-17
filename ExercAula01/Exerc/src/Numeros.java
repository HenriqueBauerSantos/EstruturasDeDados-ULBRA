import java.util.Scanner;

public class Numeros {
    public int obterNum(int i){
      int num;
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite o "+ (i+1)+" numero:\n");
      num = scan.nextInt();
      return num;
    };
    public int somaNumeros( int Soma, int num){
        int SomaNumeros=0;
        SomaNumeros= Soma + num;
        return SomaNumeros;
    };
}
