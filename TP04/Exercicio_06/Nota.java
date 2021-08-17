public class Nota {
    private String nota;
    private String modificacao;
    private int tempoDuracao;

    public Nota(String nota, String modificacao, int tempoDuracao) {
        this.nota = nota;
        this.modificacao = modificacao;
        this.tempoDuracao = tempoDuracao;

        /*char[] notas = {'C', 'D', 'E', 'F', 'G', 'A', 'B'};
        int teste = 0;
        for (int i = 0; i < 7; i++) {
            if (nota == notas[i]) {
                this.nota = nota;
                teste = 1;
            }
        }
        if (teste == 0) {
            System.out.println("Nota inválida");
            return;
        }*/

    }

    public void tocarNota() {
        System.out.println(this.nota + this.modificacao + "(" + this.tempoDuracao + "s)");
    }


}
