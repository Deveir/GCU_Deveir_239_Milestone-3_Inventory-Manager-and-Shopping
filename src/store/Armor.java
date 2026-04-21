  package store;

/**
 * An armor product.
 */
public class Armor extends SalableProduct {
    private int defense;

    /**
     * Creates armor.
     *
     * @param id product ID
     * @param name armor name
     * @param price armor price
     * @param defense defense value
     */
    public Armor(String id, String name, double price, int defense) {
        super(id, name, price);
        this.defense = defense;
    }

    /**
     * Returns defense value.
     *
     * @return defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Returns armor info.
     *
     * @return armor text
     */
    public String toString() {
        return super.toString() + " - Defense: " + defense;
    }
}