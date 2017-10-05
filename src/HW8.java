import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       float v1 = scn.nextInt();
        System.out.println(Math.round(v1 * 0.26418f*10)/10f);
    }
}
