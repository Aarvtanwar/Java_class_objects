import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem(new CartItem("Book", 200, 2));
        sc.addItem(new CartItem("Pen", 10, 5));
        sc.displayTotalCost();
        sc.removeItem("Pen");
        sc.displayTotalCost();
    }
}
