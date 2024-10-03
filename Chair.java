package java_labs.Lab2;

class Chair extends Furniture {
    // Поля
    private boolean hasBackrest;
    private boolean hasArmrest;

    // Конструкторы
    public Chair() {
        super();
        hasBackrest = true;
        hasArmrest = false;
    }

    public Chair(String material, String color, double price, boolean hasBackrest, boolean hasArmrest) {
        super(material, color, price);
        this.hasBackrest = hasBackrest;
        this.hasArmrest = hasArmrest;
    }

    // Методы
    @Override
    public void displayFunction() {
        System.out.println("Этот стул используется для сидения.");
    }

    public void displayChairFeatures() {
        System.out.println("Спинка: " + (hasBackrest ? "Да" : "Нет") + ", Подлокотники: " + (hasArmrest ? "Да" : "Нет"));
    }

    // Геттеры и сеттеры
    public boolean hasBackrest() {
        return hasBackrest;
    }

    public void setBackrest(boolean hasBackrest) {
        this.hasBackrest = hasBackrest;
    }

    public boolean hasArmrest() {
        return hasArmrest;
    }

    public void setArmrest(boolean hasArmrest) {
        this.hasArmrest = hasArmrest;
    }
}
