package exercises;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(1996, 01, 03);
        System.out.println("私の誕生日は" + localDate.getYear() + "年" + localDate.getMonthValue() + "月" + localDate.getDayOfMonth() + "日です");

    }
    
}
