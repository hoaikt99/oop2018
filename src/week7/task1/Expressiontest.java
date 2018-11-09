package week7.task1;
public class Expressiontest {
    public static void main(String[] args) {       
       Square ad= new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)),new Multiplication(new Numeral(2), new Numeral(3))));
       System.out.println(ad.toString());
       System.out.println("="+ ad.evaluete());
       Division di=new Division(new Numeral(3), new Numeral(0));
       try{
        System.out.println(di.toString());
        System.out.println(di.evaluete());
       }catch(ArithmeticException e){
           System.out.println("khong the chia cho 0");
       }
    }
}
