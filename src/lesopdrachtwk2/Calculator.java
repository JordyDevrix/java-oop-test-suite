package lesopdrachtwk2;

import java.util.Objects;

public class Calculator {
    private int valueA;

    private int valueB;

    public Calculator(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public int Devide() {
        if (Objects.equals(valueB, 0)) {
            throw new ArithmeticException("whomp whomp, you entered zero, cry about it :_(");
        } else {
            return valueA / valueB;
        }
    }
}
