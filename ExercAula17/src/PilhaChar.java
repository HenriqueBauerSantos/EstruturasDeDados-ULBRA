public class PilhaChar {
    int topo = -1;
    char[] pilha = new char[50];

    public void push(char letra){
        if(topo<50){
            topo++;
            pilha[topo]=letra;
        }
    }
    public void pop (){
        if (topo>0){
            topo--;
        }
        else {
            System.out.println("Nao e possivel");
        }
    }
    public char show(){
        return  pilha[topo];
    }
}
