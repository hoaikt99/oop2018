

class Student{
    private String name, id, group, email;
    public void setname(String name)
    {	this.name= name;}
    public String getname()
    {	 return name;}
    public void setid(String id){
        this.id=id;}
    public String getid()
    { return id;}
    public void setgroup(String group)
    { this.group= group;}
    public String getgroup()
    { return group;}
    public void setemail(String email)
    {	this.email= email;}
    public String getemail()
    { return email;}
    void getInfo(){
        System.out.println("name: " +name);
        System.out.println("id: " +id);
        System.out.println("group: " +group);
        System.out.println("email: " +email);
        System.out.println(" ");
    }
    public Student()
    {
        name="Student";
        id="0000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em){
        group="INT22041";
        name=n;
        id=sid;
        email=em;
    }
    public Student(Student s)
    {
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

}



public class Studentmanagement{
    public static boolean sameGroup(Student s3, Student s2) {
            if( s3.getgroup().equals(s2.getgroup())==true)
                return true;
            else
                return false;
    }
    public static void main(String [] args){
            Student s1= new Student();
            Student s2= new Student();
            Student s3= new Student("tieu tieu vu", "17020754", "17020754@vnu.edu.vn");
            s1.setname(" luu thi thu hoai");
            s1.setid("17020754");
            s1.setgroup("k62CF");
            s1.setemail("luuthithuhoaikt99@gmail.com");
            System.out.println("name: " +s1.getname());
            s1.getInfo();
            s2.getInfo();
            s3.getInfo();
            Student s= new Student(s1);
            s.getInfo();
          //  System.out.println(sameGroup(sv1, sv2));
        }

    }




