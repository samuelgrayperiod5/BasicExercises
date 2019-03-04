public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        //Math.sqrt(9);  //3
        return this.width * this.length;
    }

    public double getDiagonal() {
        return java.lang.Math.sqrt(this.length * this.length) + java.lang.Math.sqrt(this.width * this.width);
    }

    public boolean isSquare() {
        if (this.length == this.width) {
            return true;
        } else {
            return false;
        }
    }
}
