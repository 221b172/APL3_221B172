class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CannotFly(), new Mute(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}
