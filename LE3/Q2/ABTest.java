abstract class AbsTest implements Testable {
    // We don't have to implement the display() method here because AbsTest is abstract
    // However, we can leave it unimplemented and force subclasses to implement it
}

class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method from ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // Calling the display method
    }
}
