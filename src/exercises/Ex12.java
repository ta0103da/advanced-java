package exercises;

public class Ex12 {
    public static void main(String[] args) {

        try {
            int answer = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("０で割ることができません");
        }
    }

}
