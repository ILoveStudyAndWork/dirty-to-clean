package mysterious_naming;

public class TimesTable {
    public static void main(String[] args) {
        for (int firstItem = 1; firstItem < 10; firstItem++) {
            for (int secondItem = 1; secondItem <= firstItem; secondItem++) {
                System.out.printf("%d * %d = %d\t", firstItem, secondItem, firstItem * secondItem);
            }
            System.out.println();
        }
    }
}

