/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    String name;
    boolean isFighter;

    public Bharatvanshi(String name, boolean isFighter) {
        this.name = name;
        this.isFighter = isFighter;
    }

    // Abstract methods to be implemented by subclasses
    abstract void fight();
    abstract void obey();
    abstract void kind();
}
