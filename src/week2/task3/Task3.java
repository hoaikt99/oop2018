package week2.task3;

public class Task3 {
  package Tash1;
import java.util.Scanner;
class giao_vien{
    private String name, lop;
    private int tuoi;
    public giao_vien(){}
    public giao_vien(String name, String lop, int tuoi){
        this.name=name;
        this.lop=lop;
        this.tuoi=tuoi;
    }
	public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
	public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public int gettuoi(){
        return tuoi;
    }
	public void setlop(String lop){
        this.lop=lop;
    }
    public String getlop(){
        return lop;
    }
 
    public void check(giao_vien other){
        if(lop.equals(other.getlop())==true) System.out.println("cung day mot lop");
        else System.out.println("khong day cung lop");
    }
    public void print_(){
        System.out.println("Thong tin giao vien: ");
		System.out.println("Ten giao vien: " + name);
		System.out.println("Tuoi: "+ tuoi);
		System.out.println("Lop giang day: "+lop)
	}
	
}
class dog{
    private float cao, nang;
    private String name, chu;
    public dog(){
    }
    public dog(float cao, float nang, String name, String chu){
        this.cao =cao; this.nang=nang; this.name=name; this.chu=chu;
    }
    public float getcao(){
        return cao;
    }
    public float getnang(){
        return nang;
    }
    public String getname(){
        return name;
    }
    public String getchu(){
        return chu;
    }
    public void setcao(float cao){
        this.cao=cao;
    }
    public void setnang(float nang){
        this.nang=nang;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setchu(String chu){
        this.chu= chu;
    }
    public void samechu(dog other){
        if(chu.equals(other.getchu())==true){
            System.out.print("cung chu");
        }
        else {
            System.out.print("khac chu");
        }
    }
    public void print_(){
        System.out.println("thong tin :\nTen cho: "+ name+ "\nChu: "+chu+"\nCan nang: "+ nang+"Chieu cao: "+cao);
    }
}
class benhnhan{
    private String name, gioi_tinh, benh, tinh_trang;
    private int tuoi;
    public benhnhan(){}
    public benhnhan(String name,String gioi_tinh, String benh,String tinh_trang, int tuoi){
        this.name=name;
        this.gioi_tinh=gioi_tinh;
        this.benh=benh;
        this.tinh_trang=tinh_trang;
        this.tuoi=tuoi;
    }
    public String getname(){
        return name;
    }
    public String getbenh(){
        return benh;
    }
    public String getgioi_tinh(){
        return gioi_tinh;
    }
    public String gettinh_trang(){
        return tinh_trang;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setbenh(String benh){
        this.benh=benh;
    }
    public void setgioi_tinh(String gioi_tinh){
        this.gioi_tinh=gioi_tinh;
    }
    public void settinh_trang(String tinh_trang){
        this.tinh_trang=tinh_trang;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public void getInf(){
        System.out.println("Thong tin benh nhan :\nTen: "+name+"Tuoi: "+tuoi+"Gioi tinh: "+ gioi_tinh+"\nBenh: "+ benh+ "Tinh trang suc khoe: "+ tinh_trang);

    }
    public void uu_tien(){
        if (tinh_trang.equals("yeu")==true){
            System.out.println("Gap");
        }
        else if(tinh_trang.equals("hoi phuc")==true){
            System.out.println("Xep lich ra vien");
        }
        else if(tinh_trang.equals("khoe")==true){
            System.out.println("Ra vien");
        }
        else if(tinh_trang.equals("nguy kich")==true){
            System.out.println("Can cap cuu gap");
        }
    }
    public void samebenh(benhnhan other){
        if(benh.equals(other.getbenh())==true){
            System.out.println("xep cung phong");
        }
    }
}

class Task3 {
    public static giao_vien n1[]=new giao_vien[100];

    public static void main(String [] args) {
        giao_vien other = new giao_vien("b", "11", 27);
       Scanner a=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       for(int i=0;i<2;i++){
           String name,lop;
           int tuoi;
           System.out.println("giao vien thu "+i);
           name=a.nextLine();
           lop=a.nextLine();
           tuoi=b.nextInt();
           n1[i]= new giao_vien(name,lop,tuoi);

       }
        for(int i=0;i<2;i++){
       n1[i].print_();
       n1[i].check(other);
        }
    }
}

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
