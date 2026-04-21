package store;

/**
 * Main store front program.
 */
public class StoreFront {
    private InventoryManager inventoryManager;
    private ShoppingCart shoppingCart;

    /**
     * Creates a StoreFront object.
     */
    public StoreFront() {
        inventoryManager = new InventoryManager();
        shoppingCart = new ShoppingCart();
    }

    /**
     * Starts the store.
     */
    public void startStore() {
        inventoryManager.initializeInventory();
        shoppingCart.initializeCart();
    }

    /**
     * Buys a product by moving it from inventory to cart.
     *
     * @param id product ID
     */
    public void buyProduct(String id) {
        SalableProduct product = inventoryManager.findProduct(id);

        if (product != null) {
            shoppingCart.addToCart(product);
            inventoryManager.removeProduct(product);
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    /**
     * Cancels a product purchase by moving it from cart back to inventory.
     *
     * @param id product ID
     */
    public void cancelProduct(String id) {
        SalableProduct product = shoppingCart.findProduct(id);

        if (product != null) {
            shoppingCart.removeFromCart(product);
            inventoryManager.addProduct(product);
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    /**
     * Displays inventory.
     */
    public void showInventory() {
        System.out.println("Inventory:");
        for (SalableProduct product : inventoryManager.getInventory()) {
            System.out.println(product);
        }
        System.out.println();
    }

    /**
     * Displays cart.
     */
    public void showCart() {
        System.out.println("Shopping Cart:");
        for (SalableProduct product : shoppingCart.getCart()) {
            System.out.println(product);
        }
        System.out.println();
    }

    /**
     * Main method.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        StoreFront store = new StoreFront();

        store.startStore();
        store.showInventory();
        store.showCart();

        store.buyProduct("W1");
        store.showInventory();
        store.showCart();

        store.cancelProduct("W1");
        store.showInventory();
        store.showCart();

        store.shoppingCart.emptyCart();
        System.out.println("Cart emptied.");
        store.showCart();
    }
}