public class Circle {
    public static void main(String[] args) {
    double radius = 5;

    // Calculate diameter, circumference, and area
    double diameter = 2 * radius;
    double circumfence = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;

        System.out.println("Diameter "+ diameter);
        System.out.println("Circumfence "+ circumfence);
        System.out.println("Area" + area);
}
}
