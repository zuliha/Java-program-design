//控制台读入数据

import java.util.Scanner;

public class circle_area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area is:" + area);
        input.close();
    }
}
