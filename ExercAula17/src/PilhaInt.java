public class PilhaInt {
    int topo = -1;
    int[] pilha = new int[10];

    public void push(int x){
        if(topo<10){
            topo++;
            pilha[topo]=x;
        }else
            System.out.println("Pilha cheia");
    }

    public void push2(int x , int topoV){
        if(topo<10 && topoV<10){
            topo=topoV;
            pilha[topoV]=x;
        }else
            System.out.println("Pilha cheia");
    }
    public int pop (int topoV){
        if (topoV>-1){
            topo=topoV;
        }
        return topo;
    }
    public int show(){
        return pilha[topo];
    }
}
