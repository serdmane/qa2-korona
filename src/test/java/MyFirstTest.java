import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MyFirstTest {
    Integer age = 18;
//  BigDecimal price = new BigDecimal("10.01");
    private int globalVar = 10;

    // pishetsa vse chto ugodno

    /*
    kak zhe vse slozhno, moj mozg vishel pokuritj
     */

    @Test
    public void firstTest() {
        System.out.println("Hello, corona, maza faka!");
        int sum = sumTwoDigits(10, 20);
        System.out.println("Aaaand the sum is: " + sum);
        System.out.println(sumTwoDigits(3, 8));

           }

  private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
  }
}
