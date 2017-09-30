import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char a = scn.next().charAt(0);
        System.out.println(str.replace(a,'\n'));
    }
}
