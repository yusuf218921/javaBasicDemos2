public class MultiplicationTable {
    public void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "x" + i + " = " + i * j+ "     ");
            }
            System.out.println();
        }
    }
}
