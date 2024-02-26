public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("GIANT Boss");
        boss.setHealth(550);
        boss.setDamage(40);
        boss.setWeapon(new Weapon(WeaponType.COMBAT, "DAGGER"));

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("FLYING Skeleton");
        skeleton1.setHealth(250);
        skeleton1.setDamage(15);
        skeleton1.setWeapon(new Weapon(WeaponType.EXPLOSIVE, "GRENADE"));
        skeleton1.setArrowNumber(13);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("FIGHTING Skeleton");
        skeleton2.setHealth(225);
        skeleton2.setDamage(10);
        skeleton2.setWeapon(new Weapon(WeaponType.SEMIAUTOMATIC, "M16 rifle"));
        skeleton2.setArrowNumber(42);


        System.out.println("\nSkeleton 1:\n" + skeleton1.printInfo());
        System.out.println("\nSkeleton 2:\n" + skeleton2.printInfo());
    }
}

