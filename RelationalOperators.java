package May24thAssignment;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Equal: False
        boolean isEqual = num1 == num2;
        System.out.println("Equal: " + isEqual);

        // Not Equal: True
        boolean isNotEqual = num1 != num2;
        System.out.println("Not Equal: " + isNotEqual);

        // num1 is Greater Than num2: False
        boolean isGreaterThan = num1 > num2;
        System.out.println("num1 is Greater Than num2: " + isGreaterThan);

        // num1 is Less Than num2: True
        boolean isLessThan = num1 < num2;
        System.out.println("num1 is Less Than num2: " + isLessThan);
    }
}
