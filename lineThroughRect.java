class vertexList {
    int[][] a() {
        int t = new int[4][4];

    }
}

    bool lineThroughRect(vertex, Vector2 begin, Vector2 end) {
        //求直线公式
        double k, b;
        k = (begin.y - end.y) / (begin.x - end.x);
        b = begin.y - begin.x * k;
        int count = 0;
        for (int i = 0; i < vertext.Count; i++) {
            if ((vertex[i].y - k * vertex[i].x - b) > 0)
                count++;
            else
                count--;
        }
        if (count == 4 || count == -4)
            return false;
        else
            return true;
    }

public class lineThroughRect {
    public static void main(String[] args) {


    }
}
