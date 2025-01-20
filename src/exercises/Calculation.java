package exercises;

public class Calculation {

    // static int execute(int firstNum,char operator,int secondNum)throws OperatorException{
    static int execute(int firstNum,char operator,int secondNum){

        System.out.print(firstNum);
        System.out.print(operator);
        System.out.print(secondNum);
        System.out.println();

        if(!(operator == '+' || operator == '-' || operator == '*' || operator == '/')){
            throw new ArithmeticException();
            // throw new OperatorException("不正な演算子が使われました");
        }
        int cal = (firstNum + operator + secondNum);
        System.out.println(cal);

        return cal;
 }
    
}
