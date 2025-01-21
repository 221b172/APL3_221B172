/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Juet{
    private String name;
    private int age;
    public void setName( String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public int getAge(){
        return age;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	   Juet juet=new Juet();
	   juet.setName("Harsh");
	   juet.setAge(25);
	   
	   System.out.println("Name "+juet.getName());
	   System.out.println("Age "+juet.getAge());
	}
}
