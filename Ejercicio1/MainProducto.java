class Product {
    private int id;
    private String name;
    private double price;
    private boolean active;

    public Product(int id, String name, double price, boolean active) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + "]";
    }

    public class MainProducto {
        public static void main(String[] args) {
            System.out.println("Hola");
        }
    }
}
