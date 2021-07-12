public class Grafo {
    private boolean[][] matrizAdj;

    public Grafo(int tamanho) {
        this.matrizAdj = new boolean[tamanho][tamanho];
    }

    public void setAresta (int v1, int v2) {
        v1--;
        v2--;
        if (v1 >= 0 && v2 >= 0 && v1 < 5 && v2 < 5) {
            this.matrizAdj[v1][v2] = true;
            this.matrizAdj[v2][v1] = true;
        } else {
            System.out.println("valores inválidos");
        }
    }

    public boolean verticeVizinho (int v1, int v2) {
        if (this.matrizAdj[v1-1][v2-1] == true)
            return true;
        else
            return false;
    }

    public int[] listaVerticesVizinhos (int vertice) {
        int [] x = new int[1];
        return x;
    }
}
