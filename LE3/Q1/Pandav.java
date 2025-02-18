class Pandav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    public Pandav(String name, boolean isObedient, boolean isKind) {
        super(name, true);  // Pandavs are fighters by default
        this.isObedient = isObedient;
        this.isKind = isKind;
    }

    @Override
    void fight() {
        System.out.println(this.name + " is fighting with valor!");
    }

    @Override
    void obey() {
        if (this.isObedient) {
            System.out.println(this.name + " is obeying orders.");
        } else {
            System.out.println(this.name + " is not obeying orders.");
        }
    }

    @Override
    void kind() {
        if (this.isKind) {
            System.out.println(this.name + " is kind.");
        } else {
            System.out.println(this.name + " is not kind.");
        }
    }
}
