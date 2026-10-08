import java.util.Scanner;

public class Exercise09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Cramer's rule ile kesişim noktası bulma formülünün katsayıları
        double a = y1 - y2;
        double b = -(x1 - x2);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;

        double c = y3 - y4;
        double d = -(x3 - x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("The intersecting point is at (" + equation.getX() + ", " + equation.getY() + ")");
        } else {
            System.out.println("The two lines are parallel.");
        }
        input.close();
    }
}

// 9.11'deki LinearEquation sınıfını burada da kullanıyoruz
class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() { return (a * d - b * c) != 0; }
    public double getX() { return (e * d - b * f) / (a * d - b * c); }
    public double getY() { return (a * f - e * c) / (a * d - b * c); }
}
