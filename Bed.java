package java_labs.Lab2;

class Bed extends Furniture {
    // Поля
    private String size;
    private boolean hasStorage;

    // Конструкторы
    public Bed() {
        super();
        size = "Single";
        hasStorage = false;
    }

    public Bed(String material, String color, double price, String size, boolean hasStorage) {
        super(material, color, price);
        this.size = size;
        this.hasStorage = hasStorage;
    }

    // Методы
    @Override
    public void displayFunction() {
        System.out.println("Эта кровать используется для сна.");
    }

    public void displayBedFeatures() {
        System.out.println("Размер кровати: " + size + ", Наличие ящиков: " + (hasStorage ? "Да" : "Нет"));
    }

    // Геттеры и сеттеры
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean gethasStorage() {
        return hasStorage;
    }

    public void setStorage(boolean hasStorage) {
        this.hasStorage = hasStorage;
    }
}

