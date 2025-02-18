// All ducks can swim
class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck is swimming.");
    }
}
