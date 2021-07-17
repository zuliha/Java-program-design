import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    //Create a Scanner object
    Scanner input = new Scanner(System.in);
    //Get data from console
    double radius = input.nextDouble();
    //Compute area
    double area = radius * radius * 3.141592;
    //Display results
	System.out.println(area);
