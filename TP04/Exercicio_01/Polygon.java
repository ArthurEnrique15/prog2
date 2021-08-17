import java.util.ArrayList;
import java.util.List;

public class Polygon {
    List<Point> vertices;

    public Polygon(Point point1, Point point2, Point point3) {
        if (point1 != null && point2 != null && point3 != null &&
            point1.equals(point2) == false && point1.equals(point3) == false && point2.equals(point3) == false) {
            this.vertices = new ArrayList<>();
            this.vertices.add(point1);
            this.vertices.add(point2);
            this.vertices.add(point3);
            System.out.println("Polígono criado!");
        } else {
            System.out.println("Pontos inválidos!");
        }
    }

    public boolean pointIsAlreadyInPolygon (Point point) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).equals(point) == true)
                return true;
        }
        return false;
    }

    public void addPoint(Point point) {
        if (point == null) {
            System.out.println("Ponto inválido!");
            return;
        }

        if (pointIsAlreadyInPolygon(point) == false) {
            this.vertices.add(point);
            System.out.println("O ponto " + point + " foi adicionado ao polígono!");
        } else
            System.out.println("O ponto já foi adicionado ao polígono!");
    }

    public void removePoint (Point point) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).equals(point) == true) {
                this.vertices.remove(i);
                System.out.println("Ponto " + point + " removido!");
                return;
            }
        }
        System.out.println("Ponto não encontrado!");
    }

    public String toString() {
        String polygonString = "Polígono\n";
        for (int i = 0; i < this.vertices.size(); i++) {
            polygonString += "Ponto " + (i+1) + ": " + this.vertices.get(i).toString() + "\n";
        }
        return polygonString;
    }

    public float calculateArea() {
        float[] multX = new float[this.vertices.size()];
        float[] multY = new float[this.vertices.size()];
        float somaX = 0, somaY = 0, area;

        for (int i = 0; i < this.vertices.size(); i++) {
            if (i != this.vertices.size()-1) {
                multX[i] = this.vertices.get(i).getX() * this.vertices.get(i + 1).getY();
                multY[i] = this.vertices.get(i).getY() * this.vertices.get(i + 1).getX();
            } else {
                multX[i] = this.vertices.get(i).getX() * this.vertices.get(0).getY();
                multY[i] = this.vertices.get(i).getY() * this.vertices.get(0).getX();
            }
            somaX += multX[i];
            somaY += multY[i];
        }
        area = (somaX - somaY) / 2;
        return area;
    }

    public List<Point> getVertices() {
        return this.vertices;
    }
}
