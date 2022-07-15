import java.math.BigDecimal;
import java.text.NumberFormat;
public class Interest {
    public static void main(String[] args) {

        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        System.out.printf("%s30%s%n", "Year", "Amount on Deposit");
// displays Heading of the result
        for( int year =1; year <=10; year++){
            BigDecimal Amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            //amount = principal *((rate + 1)^year)

            System.out.printf("%4d%30s%n", year,NumberFormat.getCurrencyInstance().format(Amount));
            //get.currencyInstance adds the dollar sign

        }
    }

}
