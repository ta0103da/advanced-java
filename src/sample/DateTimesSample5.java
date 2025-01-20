package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimesSample5 {
    public static void main(String[] args) {
        
        LocalDateTime lDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH 時 mm 分 ss 秒");
        String fomat = lDateTime.format(formatter);
        System.out.println(fomat);

        String strLocalDateTime = "2018/12/31 23:59:59";

        DateTimeFormatter formatter2 =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime localDateTime2 =LocalDateTime.parse(strLocalDateTime,formatter2);
        System.out.println(localDateTime2);
        System.out.println(strLocalDateTime);
    }
    
}
