class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new CanFly(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck!");
    }
}
