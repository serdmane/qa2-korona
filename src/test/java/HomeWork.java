import org.junit.jupiter.api.Test;

public class HomeWork {
    @Test
    public void loanCounter() {
        float startSum = 7500;
        float interestRate = 2.6f; // 2,6%
        float interestRateSum = startSum * interestRate / 100;
        float totalLoanSum = interestRateSum + startSum;
        System.out.println("Interest Rate Sum " + interestRateSum);
        System.out.println("Total loan Sum " + totalLoanSum);
    }

    @Test
    public void stringCounter() {
        String testString = "Hodor, Hodor, Winter is Coming!";
        System.out.print(testString.length());

    }


}









