/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TestOverride {
    public static void main(String[] args) {
        // Creating an object of Child class, referenced by a Mother type variable
        Mother m1 = new Child();
        m1.show();  // This will call the overridden show() method in Child class

        // Creating an object of Mother class
        Mother m2 = new Mother();
        m2.show();  // This will call the show() method in Mother class
    }
}

