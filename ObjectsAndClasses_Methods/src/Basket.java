public class Basket {
    private static int count = 0;
    private static int totalQuantity = 0;
    private static int totalCost = 0;
    private static int basketCount = 0;
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private String items = "";



    public Basket() {
        increaseCount(1);
        basketCount++;
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public static int getTotalQuantity(){
        return totalQuantity;
    }
    public static int getTotalCost(){
        return totalCost;
    }
    public static double getAveragePrice(){
        return (double) totalCost / basketCount;
    }
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        //totalCost += price;
        add(name, price, count, 0.0);
    }

    public void add(String name, int price, int count, double weight) {
        totalCost += price;
        totalQuantity += count;
        boolean error = false;
        //totalCost += price;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * weight * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + weight + " кг - " + price + " р.";
        totalPrice = totalPrice + count * price;
        totalWeight += count * weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
    public static int getCount() {
        return count;
    }
    public static int getBasketCount() {
        return basketCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

}
