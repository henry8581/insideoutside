public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x * x + y * y <= 100 * 100) {
            System.out.println("inside");
        } else
            System.out.println("outside");
    }
}