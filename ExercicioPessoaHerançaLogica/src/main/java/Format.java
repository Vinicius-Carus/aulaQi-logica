import java.text.DecimalFormat;
public class Format {

    public String format(double number) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(number);

    }
}