package week7.task1;
public class Subtraction extends BlnanyExpression{
    Expression left, right;
    public Subtraction (Expression right , Expression left){
        this.left= left;
        this.right= right;
    }
    @Override 
    public Expression left(){
        return left;
    }
    @Override 
    public Expression right(){
        return right;
    }
    @Override
    public int evaluete(){
        return this.right.evaluete()- this.left.evaluete() ;
    }
    @Override
    public String toString(){
        return this.right.toString()+ " - "+ this.left.toString();
    }
}
