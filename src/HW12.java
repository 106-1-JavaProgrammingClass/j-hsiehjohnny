import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double v1 = scn.nextDouble();
        int v2 = scn.nextInt();
        double v3 = Math.pow(10,v2);
        System.out.println(Math.round(v1*v3)/v3);
    }
}
