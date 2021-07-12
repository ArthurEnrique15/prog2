public class JogoDaVelha {
    private int[][] grade;
    private int jogadorAtual;

    public JogoDaVelha () {
        this.grade = new int[3][3];
        this.jogadorAtual = 1;
    }

    public void escreveGrade() {

        System.out.println("   1   2   3");

        for (int i = 0; i < 3; i++) {
            if (i != 0)
                System.out.println("\n  ———|———|———");
            System.out.print(i+1 + " ");
            for (int j = 0; j < 3; j++) {
                if (j != 0)
                    System.out.print("|");

                if (this.grade[i][j] == 1)
                    System.out.print(" x ");
                else if (this.grade[i][j] == 2)
                    System.out.print(" o ");
                else
                    System.out.print("   ");

            }
        }

        System.out.println();
    }

    public boolean marcar(int linha, int coluna) {
        if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
            System.out.println("Valores inválidos!");
            return false;
        }

        if (this.grade[linha-1][coluna-1] != 0) {
            System.out.println("Essa posição já foi marcada!");
            return false;
        }

        this.grade[linha-1][coluna-1] = this.jogadorAtual;
        if (this.jogadorAtual == 1)
            this.jogadorAtual = 2;
        else
            this.jogadorAtual = 1;

        return true;
    }

    public int verificaVencedor() {
        for (int i = 0; i < 3; i++) {
            //System.out.println("comparando das linhas: " + this.grade[i][0] + ", " +  this.grade[i][1] + " e " + this.grade[i][2]);
            if (this.grade[i][0] != 0 && this.grade[i][0] == this.grade[i][1] && this.grade[i][1] == this.grade[i][2]) {
                //System.out.println("retornou linha igual");
                return this.grade[i][0];
            }

            //System.out.println("comparando das colunas: " + this.grade[0][i] + ", " +  this.grade[1][i] + " e " + this.grade[2][i]);
            if (this.grade[0][i] != 0 && this.grade[0][i] == this.grade[1][i] && this.grade[1][i] == this.grade[2][i]) {
                //System.out.println("retornou coluna igual");
                return this.grade[0][i];
            }
        }

        if ((this.grade[0][0] != 0 && this.grade[0][0] == this.grade[1][1] && this.grade[1][1]== this.grade[2][2]) ||
            (this.grade[0][2] != 0 && this.grade[0][2] == this.grade[1][1] && this.grade[1][1]== this.grade[2][0])) {
            return this.grade[1][1];
        }
        return 0;
    }

    public int getJogadorAtual() {
        return this.jogadorAtual;
    }
}
