class LakeDuck extends Duck {
    public LakeDuck() {
        super(new CanFly(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Lake Duck!");
    }
}
