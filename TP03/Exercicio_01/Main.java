public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        // Preenchimento do grafo
        // Para exemplo, foi utilizado o grafo que está no pdf do TP03
        grafo.setAresta(1, 2);
        grafo.setAresta(1, 5);
        grafo.setAresta(2, 3);
        grafo.setAresta(2, 4);
        grafo.setAresta(2, 5);
        grafo.setAresta(3, 4);
        grafo.setAresta(4, 5);

        // Escreve a matriz
        System.out.println("   1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "  ");
            for (int j = 0; j < 5; j++) {
                if (grafo.verticeVizinho(i+1, j+1) == true)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }

        // Escreve a lista
        System.out.println();
        System.out.println("vértice - lista de vértices vizinhos");
        for (int i = 0; i < 5; i++) {
            System.out.print("   " + (i+1) + "    - ");
            for (int j = 0; j < 5; j++) {
                if (grafo.verticeVizinho(i+1, j+1) == true)
                    System.out.print(j+1 + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.print("O vértice 1 é vizinho do 2? ");
        if (grafo.verticeVizinho(1, 2) == true)
            System.out.println("sim");
        else
            System.out.println("não");

        System.out.print("O vértice 2 é vizinho do 3? ");
        if (grafo.verticeVizinho(2, 3) == true)
            System.out.println("sim");
        else
            System.out.println("não");

        System.out.print("O vértice 3 é vizinho do 5? ");
        if (grafo.verticeVizinho(3, 5) == true)
            System.out.println("sim");
        else
            System.out.println("não");



        System.out.print("O vértice 4 é vizinho do 1? ");
        if (grafo.verticeVizinho(4, 1) == true)
            System.out.println("sim");
        else
            System.out.println("não");

        System.out.print("O vértice 5 é vizinho do 3? ");
        if (grafo.verticeVizinho(5, 3) == true)
            System.out.println("sim");
        else
            System.out.println("não");

    }
}
