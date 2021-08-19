package Exercicio_03;

public class GeometricFormFactory {
    public static GeometricForm createGeometricForm(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("square")) return new Square();
        else if (type.equalsIgnoreCase("triangle")) return new Triangle();
        else return null;
    }
}
