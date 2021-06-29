public class IntegerSet {
    private boolean[] conjunto;

    public IntegerSet (int tamanho) {
        this.conjunto = new boolean[tamanho+1];
    }

    public void adicionarNumero (int numero) {
        if (numero >= this.conjunto.length) {
            System.out.println("\nO conjunto não suporta esse valor!");
        } else if (this.conjunto[numero] == true) {
            System.out.println("\nO número digitado já faz parte do conjunto!");
        } else {
            this.conjunto[numero] = true;
            System.out.println("\nNúmero adicionado ao conjunto!");
        }
    }

    public void removerNumero (int numero) {
        if (numero >= this.conjunto.length) {
            System.out.println("\nO conjunto não suporta esse valor!");
        } else if (this.conjunto[numero] == false) {
            System.out.println("\nO número digitado não faz parte do conjunto!");
        } else {
            this.conjunto[numero] = false;
            System.out.println("\nNúmero removido do conjunto!");
        }
    }

    public String toString () {
        String conjuntoString = new String();
        for (int i = 0; i < this.conjunto.length; i++) {
            if (this.conjunto[i] == true)
                conjuntoString += i + " ";
        }
        return conjuntoString;
    }

    public int calculaQtdElementosDoConjunto () {
        int qtdElementos = 0;
        for (int i = 0; i < this.conjunto.length; i++) {
            if (this.conjunto[i] == true)
                qtdElementos++;
        }
        return qtdElementos;
    }

    public IntegerSet uniaoConjuntos (IntegerSet integerSet) {
        int tamanho;
        if (this.conjunto.length > integerSet.conjunto.length)
            tamanho = this.conjunto.length;
        else
            tamanho = integerSet.conjunto.length;

        IntegerSet conjuntoUniao = new IntegerSet(tamanho);
        for (int i = 0; i < tamanho; i++) {
            if ((i < this.conjunto.length && this.conjunto[i] == true) ||
                (i < integerSet.conjunto.length && integerSet.conjunto[i] == true)) {
                conjuntoUniao.conjunto[i] = true;
            }
        }
        return conjuntoUniao;
    }

    public IntegerSet intersecaoConjuntos (IntegerSet integerSet) {
        int tamanho;
        if (this.conjunto.length < integerSet.conjunto.length)
            tamanho = this.conjunto.length;
        else
            tamanho = integerSet.conjunto.length;

        IntegerSet conjuntoIntersecao = new IntegerSet(tamanho);
        for (int i = 0; i < tamanho; i++) {
            if ((i < this.conjunto.length && this.conjunto[i] == true) &&
                (i < integerSet.conjunto.length && integerSet.conjunto[i] == true)) {
                conjuntoIntersecao.conjunto[i] = true;
            }
        }
        return conjuntoIntersecao;
    }

    public IntegerSet diferencaConjuntos (IntegerSet integerSet) {

        int tamanho;
        IntegerSet conjuntoDiferenca = copiaIntegerSet();

        if (this.conjunto.length > integerSet.conjunto.length)
            tamanho = integerSet.conjunto.length;
        else
            tamanho = this.conjunto.length;

        for (int i = 0; i < tamanho; i++) {
            if (this.conjunto[i] == true && integerSet.conjunto[i] == true)
                conjuntoDiferenca.conjunto[i] = false;
        }
        return conjuntoDiferenca;
    }
    public IntegerSet copiaIntegerSet () {
        IntegerSet copiaInteger = new IntegerSet(this.conjunto.length-1);

        for (int i = 0; i < copiaInteger.conjunto.length; i++) {
            if (this.conjunto[i] == true)
                copiaInteger.conjunto[i] = true;
        }

        return copiaInteger;
    }


}
