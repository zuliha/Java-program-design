//没写完
class point {
    double x;
    double y;

    point(double xx, double yy) {
        x = xx;
        y = yy;
    }
}

class A {
    void test() {
        point[] a = new point[5];
        a[0] = new point(1, 1);
        a[1] = new point(3, 9);
        a[2] = new point(2, 5);
        a[3] = new point(4, 6);
        a[4] = new point(5, 2);
    }

    public class xy {
        public static void main(String[] args) {
            System.out.println(a[0]);
        }
    }
