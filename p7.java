class Vertex {
    double x;
    double y;

    Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class p7 {
    public static void main(String[] args) {
        Vertex[] p = new Vertex[4];
        p[0] = new Vertex(1, 2);
        p[1] = new Vertex(3, 4);
        p[2] = new Vertex(5, 1);
        p[3] = new Vertex(4, 7);
        for (int i = 0; i < 4; i++) {
            System.out.println(p[i].x);
            System.out.println(p[i].y);
        }

    }

}
/*
1.0
2.0
3.0
4.0
5.0
1.0
4.0
7.0
*/