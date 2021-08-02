public class Main {

    public static void main(String[] args) {
	    iAnimal animais[] = new iAnimal[20];

	    animais[0] = new Baleia("Baleia azul", "Azul 1", 30);
        animais[1] = new Baleia("Baleia azul", "Azul 2", 30);
        animais[2] = new Baleia("Baleia azul", "Azul 3", 30);
        animais[3] = new Baleia("Baleia azul", "Azul 4", 30);
        animais[4] = new Baleia("Baleia orca", "Orca 1", 10);
        animais[5] = new Baleia("Baleia orca", "Orca 2",10);
        animais[6] = new Baleia("Baleia jubarte", "Jubarte 1", 16);
        animais[7] = new Baleia("Baleia jubarte", "Jubarte 2", 16);
        animais[8] = new Baleia("Baleia jubarte", "Jubarte 3", 16);
        animais[9] = new Baleia("Baleia cachalote", "Cachalote 1", 20);

        animais[10] = new Girafa("Girafa do sul", "sul 1", 4.6);
        animais[11] = new Girafa("Girafa do sul", "sul 2", 4.6);
        animais[12] = new Girafa("Girafa reticulada", "ret 1", 6);
        animais[13] = new Girafa("Girafa reticulada", "ret 2", 6);
        animais[14] = new Girafa("Girafa reticulada", "ret 3", 6);
        animais[15] = new Girafa("Girafa do norte", "norte 1", 6);

        Ferramentas ferramentas = new Ferramentas();

        /*iAnimal[] filtrado = ferramentas.filtraEspecie(animais, "Baleia orca");

        for (int i = 0; i < filtrado.length; i++) {
            if (filtrado[i] != null)
                System.out.println(filtrado[i].getNomeAnimal());
        }

        String[] especies = ferramentas.classificaEspecies(animais);

        for (int i = 0; i < especies.length; i++) {
            if (especies[i] != null)
                System.out.println(especies[i]);
        }*/

        Resultado[] resultados = qtdAnimaisDeCadaEspecie(animais, ferramentas);

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] != null) {
                System.out.print("Nome da espécie: " + resultados[i].getNomeEspecie() + "\n");
                System.out.print("Quantidade de animais: " + resultados[i].getQuantidade() + "\n\n");
            }
        }
    }

    public static Resultado[] qtdAnimaisDeCadaEspecie (iAnimal[] animais, iFerramentas ferramentas) {
        Resultado[] resultados = new Resultado[animais.length];
        String[] especies = ferramentas.classificaEspecies(animais);
        iAnimal[] filtrado;
        int i = 0, j = 0, qtdAnimais;

        while (especies[i] != null) {
            qtdAnimais = 0;
            j = 0;

            filtrado = ferramentas.filtraEspecie(animais, especies[i]);

            while (filtrado[j] != null) {
                qtdAnimais++;
                j++;
            }

            resultados[i] = new Resultado(especies[i], qtdAnimais);
            i++;
        }

        return resultados;
    }
}
