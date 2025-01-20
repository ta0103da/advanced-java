package exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex10 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2020, 07, 27);

        // System.out.println(localDate);

        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)", Locale.JAPANESE);

        String format1 = localDate.format(formatter1);
        String format2 = localDate.format(formatter2);
        String format3 = localDate.format(formatter3);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
    
}
