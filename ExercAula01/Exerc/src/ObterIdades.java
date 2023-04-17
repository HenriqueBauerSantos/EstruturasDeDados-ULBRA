import java.util.Scanner;

public class ObterIdades {
    public int obterIdades(int i, int SomaIdades){
        int Idade;
        Scanner scan =new Scanner(System.in);
        System.out.println("Digite a idade da "+ (i+1) +" pessoa:\n");
        Idade= scan.nextInt();
        SomaIdades= SomaIdades + Idade;
        System.out.println("Soma das idades: "+SomaIdades+ "\n");
        return SomaIdades;
    };
    public int media(int i, int SomaIdades){
        int MediaIdades= SomaIdades/(i+1);
        return MediaIdades;
    }
}
