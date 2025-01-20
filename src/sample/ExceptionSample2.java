package sample;

public class ExceptionSample2 {
    public static void main(String[] args) {

        System.out.println("プログラム開始");
        
        
        try {
            Class.forName("java.lang.NotExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("例外が発生しました");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("例外が発生しました");
        }finally{
            System.out.println("finally");
        }

        System.out.println("プログラム終了");
    }
    
}
