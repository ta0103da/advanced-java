package sample;

import java.time.LocalDateTime;

public class DateTimesSample2 {
    public static void main(String[] args) {

        // 年⽉⽇時分秒ナノ秒を指定して LocalDateTime オブジェクトを⽣成
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 2, 3, 4, 5, 999999999);
        System.out.println("日付と時間：" + localDateTime);

        // 年⽉⽇時分秒ナノ秒をひとつずつ取り出す
        int year = localDateTime.getYear();
        System.out.println("年：" + year);
        int month = localDateTime.getMonthValue();
        System.out.println("月：" + month);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("日：" + dayOfMonth);
        int hour = localDateTime.getHour();
        System.out.println("時：" + hour);
        int minute = localDateTime.getMinute();
        System.out.println("分：" + minute);
        int second = localDateTime.getSecond();
        System.out.println("秒：" + second);
        int nano = localDateTime.getNano();
        System.out.println("ナノ秒：" + nano);

    }

}
