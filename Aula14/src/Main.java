import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordenar em ordem crescente: ");
        int op=1,aux,n=1000,trocas=0,compara=0;
        int nums[] = new int[n];
        Random random= new Random();
        for (int i =0; i<n; i++){
            nums[i]= random.nextInt(100000);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Ordenando...");
        long start = System.currentTimeMillis();
        while (op==1){
            op=0;
            for (int i = 0; i < (n-1); i++) {
                compara++;
                if (nums[i]>nums[i+1]){
                    op=1;
                    aux=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=aux;
                    trocas++;
                }
            }
        }
        long time = System.currentTimeMillis() - start;
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Comparacoes realizadas: "+compara);
        System.out.println("Trocas realizadas: "+trocas);
        System.out.println("Tempo para ordenacao em milisegundos: "+time);
    }
}
