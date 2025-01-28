public class Two extends One {
    // Constructor for class Two
    public Two(int x) {
        // Call the parameterized constructor of the superclass One
        super(x);
        System.out.println("Two's constructor with value: " + x);
    }
}
