public class Ferramentas implements iFerramentas{

    @Override
    public iAnimal[] filtraEspecie(iAnimal[] completo, String especieFiltrar) {
        iAnimal[] filtrado = new iAnimal[completo.length];
        int j = 0;

        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null && completo[i].getNomeEspecie() == especieFiltrar) {
                filtrado[j] = completo[i];
                j++;
            }
        }

        return filtrado;
    }

    @Override
    public String[] classificaEspecies(iAnimal[] completo) {
        String[] especies = new String[completo.length];
        boolean especieJaEstaClassificada;
        int x = 0;

        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null) {
                especieJaEstaClassificada = false;
                for (int j = 0; j < especies.length; j++) {
                    if (completo[i].getNomeEspecie() == especies[j])
                        especieJaEstaClassificada = true;
                }

                if (especieJaEstaClassificada == false) {
                    especies[x] = completo[i].getNomeEspecie();
                    x++;
                }
            }
        }
        return especies;
    }
}
