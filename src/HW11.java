import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        System.out.println(Math.max(v3, Math.max(v1,v2)));
        System.out.println(Math.min(v3, Math.min(v1,v2)));

    }
}

