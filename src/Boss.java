class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss: " + getName() + "\nHealth: " + getHealth() + "\nDamage: " + getDamage() +
                "\nWeapon: " + weapon.getName() + " (" + weapon.getType() + ")";
    }

    }
