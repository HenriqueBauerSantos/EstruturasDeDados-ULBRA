public class ExercPilha {
    public static void main(String[] args) {
        Pilha op = new Pilha();
        op.push(10);
        op.push(15);
        op.push(25);
        op.top();
        for (int i = 0; i <= op.topo; i++) {
            if (op.vetor[i] != 0) {
                System.out.println(op.vetor[i]);
            }
        }
        op.pop();
        System.out.println(op.vetor[op.topo]);


    }
}
