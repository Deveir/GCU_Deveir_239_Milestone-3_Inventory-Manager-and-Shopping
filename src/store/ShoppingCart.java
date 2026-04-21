package store;

import java.util.ArrayList;

/**
 * Represents a shopping cart.
 */
public class ShoppingCart {
    private ArrayList<SalableProduct> cart;

    /**
     * Creates a shopping cart.
     */
    public ShoppingCart() {
        cart = new ArrayList<SalableProduct>();
    }

    /**
     * Starts the cart empty.
     */
    public void initializeCart() {
        cart.clear();
    }

    /**
     * Adds a product to cart.
     *
     * @param product product to add
     */
    public void addToCart(SalableProduct product) {
        cart.add(product);
    }

    /**
     * Removes a product from cart.
     *
     * @param product product to remove
     */
    public void removeFromCart(SalableProduct product) {
        cart.remove(product);
    }

    /**
     * Returns cart contents.
     *
     * @return cart list
     */
    public ArrayList<SalableProduct> getCart() {
        return cart;
    }

    /**
     * Empties the cart.
     */
    public void emptyCart() {
        cart.clear();
    }

    /**
     * Finds a product in the cart by ID.
     *
     * @param id product ID
     * @return found product or null
     */
    public SalableProduct findProduct(String id) {
        for (SalableProduct product : cart) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }
}