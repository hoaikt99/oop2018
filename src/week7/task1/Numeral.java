package week7.task1;
public class Numeral extends Expression{
    int numeral;
    public Numeral(){}
    public Numeral(int numeral){
        this.numeral= numeral;        
    }
    @Override
    public String toString(){
        return Integer.toString(this.numeral);
    }
    @Override
    public int evaluete(){
        return this.numeral;
    }
}
