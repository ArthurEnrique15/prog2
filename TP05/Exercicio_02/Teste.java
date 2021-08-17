public class Teste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", 30, "M", 300, 1991);
        System.out.println(c1+"\n");

        Gerente g1 = new Gerente("Marcelo", 45, "M", 5000, "0001", "Logística");
        System.out.println(g1+"\n");

        Vendedor v1 = new Vendedor("Ana", 25, "F", 2500, "0002", 3000, 30);
        System.out.println(v1);
    }
}
