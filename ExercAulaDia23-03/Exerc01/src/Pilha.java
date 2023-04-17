public class Pilha {
        String[] vetor;
        int topo;
        public Pilha(int value){
          topo=-1;
          vetor = new String[value];
        };


        public String pop(){
            String valor=vetor[topo];
            topo--;
            return valor;
        }
        public String push(String dado){
            topo++;
            vetor[topo]=dado;
            return vetor[topo];
        }
        public void top(){
            System.out.println(vetor[topo]);
        }
}


