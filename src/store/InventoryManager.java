package store;

import java.util.ArrayList;

/**
 * Manages the store inventory.
 */
public class InventoryManager {
    private ArrayList<SalableProduct> inventory;

    /**
     * Creates inventory manager.
     */
    public InventoryManager() {
        inventory = new ArrayList<SalableProduct>();
    }

    /**
     * Adds starting items to inventory.
     */
    public void initializeInventory() {
        inventory.add(new Weapon("W1", "Iron Sword", 50.0, 10));
        inventory.add(new Weapon("W2", "Hunter Bow", 65.0, 8));
        inventory.add(new Armor("A1", "Steel Armor", 80.0, 15));
        inventory.add(new HealthPotion("H1", "Small Potion", 10.0, 20));
    }

    /**
     * Adds product to inventory.
     *
     * @param product product to add
     */
    public void addProduct(SalableProduct product) {
        inventory.add(product);
    }

    /**
     * Removes product from inventory.
     *
     * @param product product to remove
     */
    public void removeProduct(SalableProduct product) {
        inventory.remove(product);
    }

    /**
     * Returns all inventory items.
     *
     * @return inventory list
     */
    public ArrayList<SalableProduct> getInventory() {
        return inventory;
    }

    /**
     * Finds a product by ID.
     *
     * @param id product ID
     * @return found product or null
     */
    public SalableProduct findProduct(String id) {
        for (SalableProduct product : inventory) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }
}