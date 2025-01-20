package sample;

public class ExceptionSample4 {
    public static void main(String[] args) {
        
        System.out.println("プログラム開始");

        try {
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("例外が発生しました");

        }

        System.out.println("プログラム終了");
        
            }
        
            private static void method1() throws ClassNotFoundException{
               Class.forName("java.lang.NoExistClass");
            }
    
    
}
