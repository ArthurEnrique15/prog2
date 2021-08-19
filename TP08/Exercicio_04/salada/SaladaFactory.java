package Exercicio_04.salada;

public class SaladaFactory {
    public static Salada criarSalada(String tipo) {
        if (tipo.equalsIgnoreCase("com verdura")) return new SaladaComVerdura();
        else if (tipo.equalsIgnoreCase("sem verdura")) return new SaladaSemVerdura();
        else return null;
    }
}
