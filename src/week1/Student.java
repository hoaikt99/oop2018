package week1;

public class Student {

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

    public Student() {
        // TODO:
	name="Student";
	email="uet@vnu.edu.vn";
	id="000";
	group="INT2208";
    }

    public Student(String n, String sid,String gr, String em) {
        // TODO:
	group=gr;
	name=n;
	id=sid;
	email=em;
    }

 
    public Student(Student s) {
        // TODO:
	name=s.getname();
	id=s.getid();
	group=s.getgroup();
	email=s.getemail();
    }

    void getInfo() {
        // TODO:
        System.out.println("name: " +name);
	System.out.println("id: " +id);
	System.out.println("group " +group);
	System.out.println(" email: " +email);
    }
}
