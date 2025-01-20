package exercises;

public class Ex05 {
    public static void main(String[] args) {

        String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";

        String[] bigNumbers = bigNumber.split(":");
        for (String num : bigNumbers) {
            System.out.println(num);
        }
    }

}
