// Ducks that cannot fly
class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck can't fly.");
    }
}

// Ducks that can fly
class CanFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck is flying!");
    }
}
