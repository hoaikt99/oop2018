package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static String sum() {
        if (3>4) {
            return "true";
        }
        return null;
    }
    public static void main(String[] args) throws ArithmeticException,
                                                ArrayIndexOutOfBoundsException, 
                                                NullPointerException, 
                                                IOException,FileNotFoundException,
                                                ClassCastException{
        //bat loi ArithmeticException
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("phep chia cho 0 khong the thuc hien");
        }
        //bat loi ArrayIndexOutOfBoundsException
        int [] arr= new int [2];
        try{
            arr[5]=9;
        }catch(Exception e){
            System.out.println("tran mang");
        }
        //bat loi NullPointerException
        try{            
            String s=sum();
            int t= s.length();
        }catch(Exception e){
            System.out.println("Error: NULL");
        }
        //bat loi IOException
        BufferedReader br = null;
        try {   
            br = new BufferedReader(new FileReader("test.txt"));       
            int num=0;
            char ch;
            while((num = br.read()) != -1)
            {    
                ch = (char) num;
                System.out.print(ch);
            }
        } catch (IOException e) {
            System.out.println("file the mo file");
        } 
        //bat loi FileNotFoundException
        try {   
            br = new BufferedReader(new FileReader("D://test.txt"));       
            int num=0;
            char ch;
            while((num = br.read()) != -1)
            {    
                ch = (char) num;
                System.out.print(ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file khong tim thay");
        }
        //bat loi ClasscastException
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i;    
        }catch(Exception e){
            System.out.println("khong ep kieu duoc");
        }
    }    
}

}
