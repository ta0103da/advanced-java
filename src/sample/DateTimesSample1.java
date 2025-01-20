package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimesSample1 {
    public static void main(String[] args) {
        
        // ⽇付を表すクラス
        LocalDate localDate = LocalDate.now();
        System.out.println("現在の日付：" + localDate);
        // 時間を表すクラス
        LocalTime localTime = LocalTime.now();
        System.out.println("現在の時間：" + localTime);
        // ⽇付と時間
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の日付と時間：" + localDateTime);

        Date date =new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) +1 + "月" + calendar.get(Calendar.DATE) + "日" );
        

    }
    
}
