public class Runner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(30,40);
        System.out.println(rect.getArea());
        System.out.println(rect.isSquare());
        System.out.println(rect.getDiagonal());
        Car full = new Car(1,"toyota","camry");
        System.out.println(full.getMake());
        System.out.println(full.getModel());
        System.out.println(full.getYear());
    }
}
