package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        GeometricForm form1 = GeometricFormFactory.createGeometricForm("circle");
        form1.drawForm();

        GeometricForm form2 = GeometricFormFactory.createGeometricForm("square");
        form2.drawForm();

        GeometricForm form3 = GeometricFormFactory.createGeometricForm("triangle");
        form3.drawForm();
    }
}
