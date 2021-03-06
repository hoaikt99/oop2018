
package week7.task1;

public class Addition extends BlnanyExpression{
    Expression left, right;
    public Addition(Expression right, Expression left){
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
        return this.left.evaluete()+ this.right.evaluete() ;
    }
    @Override
    public String toString(){
        return this.right.toString()+ " + "+ this.left.toString();
    }
    
    
}
