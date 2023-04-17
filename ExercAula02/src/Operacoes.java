import java.util.Scanner;

public class Operacoes {
    public String obterNomes(int i){
        Scanner scan = new Scanner(System.in);
        String nomesMet;
        System.out.println("Digite o " + (i + 1) + " nome:");
        nomesMet=scan.nextLine();
        return nomesMet;
    };
    public float obterNotas(int i){
        Scanner scan = new Scanner(System.in);
        Float notasMet;
        System.out.println("Digite a " + (i + 1) + " nota:");
        notasMet=scan.nextFloat();
        return notasMet;
    };
    public float obterNotasComNome(String nome){
        Scanner scan = new Scanner(System.in);
        Float notasMet;
        System.out.println("Digite a nota de "+nome+": ");
        notasMet=scan.nextFloat();
        return notasMet;
    };
    public int obterInt(int i){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite a " + (i + 1) + " numero:");
        num=scan.nextInt();
        return num;
    };
    public int solicitarQuantNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos numeros quer inserir:");
        int quant = scan.nextInt();
        return quant;
    };
}
