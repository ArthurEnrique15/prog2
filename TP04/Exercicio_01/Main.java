public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 1);
        Point point3 = new Point(3, 2);

        System.out.println("Escrevendo os pontos com o toString()");
        System.out.println("Ponto 1: " + point1);
        System.out.println("Ponto 2: " + point2);
        System.out.println("Ponto 3: " + point3);

        Point point4 = new Point(1, 1);

        System.out.println("\nTestando método equals() do ponto e alterando um ponto com os sets");
        System.out.println("O ponto " + point1 + " é igual ao ponto " + point4 + "? " + point1.equals(point4));

        point4.setX(1);
        point4.setY(3);

        System.out.println("O ponto " + point1 + " é igual ao ponto " + point4 + "? " + point1.equals(point4));

        System.out.println();

        System.out.println("Criando um polígono com pontos iguais");
        Polygon polygon = new Polygon(point1, point1, point1);

        System.out.println("\nCriando um polígono com pontos válidos");
        polygon = new Polygon(point1, point2, point3);

        System.out.println("\nEscrevendo o polígono com o método toString()");
        System.out.print(polygon);

        System.out.println("\nAdicionando o ponto 1 ao polígono");
        polygon.addPoint(point1);

        System.out.println("\nAdicionando o ponto 4 ao polígono");
        polygon.addPoint(point4);

        System.out.println("\n" + polygon);

        Point point5 = new Point(5, 5);
        System.out.println("Adicionando o ponto 5 ao polígono");
        polygon.addPoint(point5);

        System.out.println("\n" + polygon);

        System.out.println("Removendo o ponto 5 do polígono");
        polygon.removePoint(point5);

        System.out.println("\n" + polygon);

        System.out.println("Área do polígono: " + polygon.calculateArea());

    }
}
