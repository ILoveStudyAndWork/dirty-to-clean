package mysteriousNaming;

public class AlanAndItem {
    public static void main(String[] args) {
        for (int alan = 1; alan < 10; alan++) {
            for (int item = 1; item <= alan; item++) {
                System.out.printf("%d * %d = %d\t", alan, item, alan * item);
            }
            System.out.println();
        }
    }
}

