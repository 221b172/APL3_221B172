/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TestPolymorphism {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Upcasting: Mother reference, Child object
        m1.show();  // Calls Child's show() method due to dynamic method dispatch

        // Also test with Mother instance directly
        Mother m2 = new Mother();  // Mother object
        m2.show();  // Calls Mother's show() method
    }
}

