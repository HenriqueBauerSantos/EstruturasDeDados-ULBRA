public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int[] nums = {5,94,75,25,41,63,14,61,35,18,55,64};

        arvore.adicionarElementos(nums);

        arvore.mostrarArvore();

        //Pre ordem
        arvore.percorrer("pre");
        System.out.println(" --- ");

        //pos ordem
        arvore.percorrer("pos");
        System.out.println(" --- ");

        //Em ordem
        arvore.percorrer("");
    }
}
