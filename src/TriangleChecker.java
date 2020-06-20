public class TriangleChecker {

    boolean isRightTriangle(Triangle triangle) {
        int a = triangle.getA() * triangle.getA();
        int b = triangle.getB() * triangle.getB();
        int c = triangle.getC() * triangle.getC();

        return a + b == c || a + c == b || b + c == a;
    }
}
