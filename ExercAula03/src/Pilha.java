public class Pilha {
        int[] vetor = new int[10];
        int topo;


        public int pop(){
            int valor=vetor[topo];
            topo--;
            return valor;
        }
        public int push(int valor){
            topo++;
            vetor[topo]=valor;
            return vetor[topo];
        }
        public void top(){
            System.out.println(vetor[topo]);
        }
}


