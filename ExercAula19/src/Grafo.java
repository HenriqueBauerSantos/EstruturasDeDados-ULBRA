public class Grafo {
    int numPessoas;
    int [][] graf ;

    public Grafo(int pessoas){
        numPessoas=pessoas;
        graf = new int[pessoas][pessoas];
        for (int i = 0; i < numPessoas; i++) {
            for (int j = 0; j < numPessoas; j++) {
                graf[i][j]=-1;
            }
        }
    }
    public  void adicionarAresta(int amigo1, int amigo2){
        for (int i = 0; i < numPessoas; i++) {
            if (graf[amigo1][i] == -1){
                graf[amigo1][i]=amigo2;
                break;
            }
        }
    }
    public void imprimirGrafo (){
        int i = numPessoas;
        String b = " ";
        for (int j = 0; j < numPessoas; j++) {
            for (int k = 0; k < numPessoas; k++) {
                if (graf[j][k] != (-1)){
                    System.out.println("A pessoa " + j + " e amiga da pessoa "+ graf[j][k]);

                }
            }
        }

    }
}
