package numbersExercises;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex8 {



    public static String formatAndDivide (String money) throws ParseException {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(); //same goes if I use the param LOCALE.US
    Number value = numberFormat.parse(money);
    BigDecimal result = new BigDecimal(money).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
    return numberFormat.format(result);
}

    public static void main(String[] args) throws ParseException {
        System.out.println(formatAndDivide("$12,345.93"));
    }
}
