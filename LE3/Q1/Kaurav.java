class Kaurav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    public Kaurav(String name, boolean isObedient, boolean isKind) {
        super(name, true);  // Kauravs are fighters by default
        this.isObedient = isObedient;
        this.isKind = isKind;
    }

    @Override
    void fight() {
        System.out.println(this.name + " is fighting fiercely!");
    }

    @Override
    void obey() {
        if (this.isObedient) {
            System.out.println(this.name + " is obeying orders.");
        } else {
            System.out.println(this.name + " is disobedient.");
        }
    }

    @Override
    void kind() {
        if (this.isKind) {
            System.out.println(this.name + " is kind.");
        } else {
            System.out.println(this.name + " is cruel.");
        }
    }
}
