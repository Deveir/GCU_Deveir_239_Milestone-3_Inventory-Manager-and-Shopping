 package store;

/**
 * A weapon product.
 */
public class Weapon extends SalableProduct implements Comparable<Weapon> {
    private int damage;

    /**
     * Creates a weapon.
     *
     * @param id product ID
     * @param name weapon name
     * @param price weapon price
     * @param damage damage value
     */
    public Weapon(String id, String name, double price, int damage) {
        super(id, name, price);
        this.damage = damage;
    }

    /**
     * Returns damage value.
     *
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Compares weapons by name, ignoring case.
     *
     * @param other other weapon
     * @return comparison result
     */
    public int compareTo(Weapon other) {
        return this.getName().compareToIgnoreCase(other.getName());
    }

    /**
     * Returns weapon info.
     *
     * @return weapon text
     */
    public String toString() {
        return super.toString() + " - Damage: " + damage;
    }
}