package java_labs.Lab2;

abstract class Furniture {
    // Поля
    private String material;
    private String color;
    private double price;
    private static int furnitureCount = 0;

    // Конструкторы
    public Furniture() {
        material = "Неизвестен"; color = "Неизвестно"; price = 0.0;
        furnitureCount++;
    }

    public Furniture(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
        furnitureCount++;
    }

    // Методы
    public static int getFurnitureCount() {
        return furnitureCount;
    }

    public void displayInfo() {
        System.out.println("Материал: " + material + ", Цвет: " + color + ", Цена: " + price);
    }

    public abstract void displayFunction();

    // Геттеры и сеттеры
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
