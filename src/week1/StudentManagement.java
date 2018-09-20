package week1;

public class StudentManagement {

      public static int d=4;

    public static boolean sameGroup(Student s3, Student s2)
    {
	if( s3.getgroup().equals(s2.getgroup())==true)
	return true;
	else
	return false;
    }
    public static Student s[]= new Student[100];
    public void studentsByGroup(){
        for(int i=0;i<4;i++)
        {
            
            System.out.println("sinh vien lop: "+ s[i].getgroup());
            System.out.println(s[i].getname());
            for(int k=i;k>0;k--)
            {
                if(s[i].getgroup().equals(s[k-1].getgroup())==true)
                   break;
            }
            for(int j=i+1;j<4;j++)
            if(s[i].getgroup().equals(s[j].getgroup())==true)
            {
                System.out.println(s[j].getname());
            }
   
            }
    }
    public void studentsByGroup(String id)
   {
        for(int i=0;i<4;i++)
        {
           int check=0;
           for(int j=0;j<i;j++)
           {
               if(s[j].getgroup().equals(s[i].getgroup())==true)
                    check=1;
                    break;
               
           }
           if(check==0)
           {
               System.out.println("group: "+s[i].getgroup());
               System.out.println(s[i].getname());
               for(int j=i+1;j<4;j++)
               {
                 if(s[i].getgroup().equals(s[j].getname())==true)
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
	for(int j=i;j<d;j++)
	s[i]=s[j+1];
	d--;
	break;
	}
      }

}
    public static void main(String args[]){
        
        Student s1= new Student();
	Student s2= new Student();
	Student s3= new Student("tieu tieu vu","INT22042","17020754", "17020754@vnu.edu.vn");
	s1.setname(" luu thi thu hoai");
	s1.setid("17020754");
	s1.setgroup("k62CF");
	s1.setemail("luuthithuhoaikt99@gmail.com");
	System.out.println("name: " +s1.getname());
	s1.getInfo();
	s2.getInfo();
	s3.getInfo();
	Student s4= new Student(s1);
	s4.getInfo();
	System.out.println(sameGroup(s3, s2));
        s[0]=s1;s[1]=s2;s[2]=s3;s[3]=s4;
        StudentManagement ds = new Studentmanagement();
        ds.studentsByGroup();//in sv theo lop
	ds.removeStudent("17020754");
	ds.studentsByGroup;
}
