package week7.task1;
public  class Multiplication extends BlnanyExpression{
    Expression left, right;
    public Multiplication(Expression right , Expression left){
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
    public String toString(){
        return right.toString()+"*"+ left.toString();
    }
    @Override
    public int evaluete(){
        return left.evaluete()*right.evaluete();
    }
}
