public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 3, 4);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = new Triangle(5, 4, 3);
        Triangle triangle4 = new Triangle(111, 3, 5);

        TriangleChecker triangleChecker = new TriangleChecker();
        System.out.println(triangleChecker.isRightTriangle(triangle1));
        System.out.println(triangleChecker.isRightTriangle(triangle2));
        System.out.println(triangleChecker.isRightTriangle(triangle3));
        System.out.println(triangleChecker.isRightTriangle(triangle4));
    }
}
