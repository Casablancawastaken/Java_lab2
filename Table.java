package java_labs.Lab2;

class Table extends Furniture {
    // Поля
    private int legs;
    private double length;
    private double width;

    // Конструкторы
    public Table() {
        super();
        legs = 4;
        length = 0.0;
        width = 0.0;
    }

    public Table(String material, String color, double price, int legs, double length, double width) {
        super(material, color, price);
        this.legs = legs;
        this.length = length;
        this.width = width;
    }

    // Методы
    @Override
    public void displayFunction() {
        System.out.println("Этот стол используется для работы или еды.");
    }

    public double calculateArea() {
        return length * width;
    }

    // Геттеры и сеттеры
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

