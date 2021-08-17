public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point ponto) {
        if (ponto.getX() == this.x && ponto.getY() == y)
            return true;
        else
            return false;
    }

    public String toString() {
        String pointString = "(" + this.x + ", " + this.y + ")";
        return pointString;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
