package week1;

public class StudentManagement{
 public static int d=4;

     static boolean sameGroup(Student s1, Student s2)
    {
        // (9) viet phuong thuc kiem tra xem hai sv co cung group k
	if( s1.getgroup().equals(s2.getgroup())==true)
        return true;
	else
	return false;
    }
    public static Student s[]= new Student[100]; // (11)
    public void studentsByGroup() //(12)
   {
       // 
        for(int i=0;i<d;i++)
        {
           int check=0; // bien de kiem tra;
           for(int j=0;j<i;j++)
           {
               // kiem tra s[i]  co bi trung lop voi cac s[i] truoc hay k
               if(s[i].getgroup().equals(s[j].getgroup())==true) // neu dung 
                    check=1;// gan check =1 roi dung, thoat khoi phong for
                    break;
               
           }
           if(check==0) // so sanh check =0, thi s[i] k bi trung voi các s[i] truoc
           {
               System.out.println("group: "+s[i].getgroup()); // in ra group khac
               System.out.println(s[i].getname()); // in ra ten sv gr tren
               for(int j=i+1;j<d;j++) // 
               {
                   // kiem tra sv voi cac sv tiep theo
                 if(s[i].getgroup().equals(s[j].getgroup())==true) 
                     System.out.println(s[j].getname());
 
               }
           }
              
           
      }
   }
  public void removeStudent(String id) //(13)
{
    
      for(int i=0;i<d;i++)
      {
	if(s[i].getid().equals(id)==true)
	{
	for(int j=i;j<d-1;j++)
	s[j]=s[j+1];
	d--;
	break;
	}
      }

}
    public static void main(String args[]){
        // phuong thuc main
        Student s1= new Student(); // tao mot so doi tuong thuoc lop Student
	Student s2= new Student(); //tao mot so doi tuong thuoc lop Student
	Student s3= new Student("tieu tieu vu","17020754", "17020754@vnu.edu.vn"); // (8) kiem tra phuong thuc co tham so;
        //Student s5= new Student();
        //s5.setgroup("INT22042");
        s2.setgroup("INT22042");// (10)thay đổi phuong thuc main de tao ra 3 sv, 2 sv thuoc gr INT22041, 1 sv thuoc group INt22041
	s1.setname("luu thi thu hoai"); // (6) thiet lap cac thong tin ve sv la thong tin cua ban
	s1.setid("17020754");//
	s1.setgroup("INT22041");//
	s1.setemail("luuthithuhoaikt99@gmail.com");
	System.out.println("ten sinh vien la: " +s1.getname()); // (6)in ra ten sv
	System.out.println("thong tin cua toan bo sinh vien s1: luu thi thu hoai là: ");
        s1.getInfo(); // (6) in ra toan bo thong tin cua sv;
	System.out.println("thong tin sinh vien s2: ");
        s2.getInfo();// kiem tra phuong thuc k tham so
	System.out.println("thong tin sinh vien s3: ");
        s3.getInfo(); // kiem tra phuong thuc co tham so
	Student s4= new Student(s1); // kiem tra phuong thuc sao chep
	System.out.println("thong tin sinh vien s4");
        s4.getInfo();//
        //System.out.println("thong tin sinh vien s5");
        //s5.getInfo();
        System.out.println("sinh vien s1 và sinh vien s2 chung lop: ");
	System.out.println(sameGroup(s1, s2));// (9) goi va in ra ham samGroup
                                               // chua kiem tra chinh xac.
        s[0]=s1;s[1]=s2;s[2]=s3;s[3]=s4;
        StudentManagement ds = new StudentManagement();
        System.out.println("danh sach sinh vien in theo lop: ");
        ds.studentsByGroup();//in sv theo lop
        System.out.println("danh sach sinh vien xoa theo id: ");
	ds.removeStudent("000");//xoa sv theo id
	ds.studentsByGroup();
}
}
