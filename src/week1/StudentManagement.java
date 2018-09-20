package week1;


// tao lop StudentManagement

      public static int d=4;

    public static boolean sameGroup(Student s1, Student s2)
    {
        // (9) viet phuong thuc kiem tra xem hai sv co cung group k
	if( s1.getgroup().equals(s2.getgroup())==true)
        return true;
	else
	return false;
    }
    public static Student s[]= new Student[100];
   public void studentsByGroup()
   {
       // 
        for(int i=0;i<4;i++)
        {
           int check=0;
           for(int j=0;j<i;j++)
           {
               if(s[i].getgroup().equals(s[j].getgroup())==true)
                    {check=1;
                    break;}
               
           }
           if(check==0)
           {
               System.out.println("group: "+s[i].getgroup());
               System.out.println(s[i].getname());
               for(int j=i+1;j<4;j++)
               {
                 if(s[i].getgroup().equals(s[j].getgroup())==true)
                     System.out.println(s[j].getname());
 
               }
           }
              
           
      }
   }
  public void removeStudent(String id)
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
	s1.setname(" luu thi thu hoai"); // (6) thiet lap cac thong tin ve sv la thong tin cua ban
	s1.setid("17020754");//
	s1.setgroup("22041");//
	s1.setemail("luuthithuhoaikt99@gmail.com");
	System.out.println(" ten sinh vien la: " +s1.getname()); // (6)in ra ten sv
	System.out.println("thong tin cua toan bo sinh vien luu thi thu hoai là: ");
        s1.getInfo(); // (6) in ra toan bo thong tin cua sv;
	System.out.println(" thong tin sinh vien s2: ");
        s2.getInfo();// kiem tra phuong thuc k tham so
	System.out.println(" thong tin sinh vien s3: ");
        s3.getInfo(); // kiem tra phuong thuc co tham so
	Student s4= new Student(s1); // kiem tra phuong thuc sao chep
	System.out.println(" thong tin sinh vien s4");
        s4.getInfo();//
        System.out.println(" sinh vien s1 và sinh vien s2 chung lop: ");
	System.out.println(sameGroup(s1, s2));// (9) goi va in ra ham samGroup
        s[0]=s1;s[1]=s2;s[2]=s3;s[3]=s4;
        StudentManagement ds = new StudentManagement();
        System.out.println("danh sach sinh vien in theo lop: ");
        ds.studentsByGroup();//in sv theo lop
        System.out.println("danh sach sinh vien xoa theo id: ");
	ds.removeStudent("17020754");//xoa sv theo id
	ds.studentsByGroup();
}
}
