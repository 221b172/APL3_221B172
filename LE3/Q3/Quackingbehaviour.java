// Ducks that quack
class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This duck is quacking!");
    }
}

// Ducks that are mute and can't quack
class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This duck is mute.");
    }
}
