public class Students {
    private String name;
    private int age;
    private String depart;
    
    public void setName(final String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAge(final int age) {
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setDepart(final String depart) {
        this.depart=depart;
    }
    public String getDepart() {
        return depart;
    }
    public Students(final String name,final int age,final String depart) {
        this.name=name;
        this.age=age;
        this.depart=depart;
    }
    public String toString() {
        return name+" "+age+"  "+depart;
    } 

}
public class Usestudents {
    public static void main(String[]args) {
        Students s1=new Students("Sara",20,"Cse");
        
System.out.println(s1);   
    String name="Sara";
    System.out.println(name); 
}
}