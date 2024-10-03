package java_labs.Lab2;

import static java.lang.System.*;

public class FurnitureOutput {
    public static void main(String[] args) {
        // Экземпляры разных видов мебели
        Table table = new Table("Дерево", "Коричневый", 5000, 4, 1.2, 0.8);
        table.setColor("Оранженый");
        table.setLegs(6);
        Table table1 = new Table();
        Chair chair = new Chair("Металл", "Черный", 1500, true, true);
        Bed bed = new Bed("Ткань", "Серый", 10000, "Большая", true);


        table.displayFunction();
        table.displayInfo();
        table1.displayFunction();
        table1.displayInfo();
        out.println("Площадь стола: " + table.calculateArea() + " м²" + " " + table.getLegs() + " ножки");
        out.println("Площадь стола: " + table1.calculateArea() + " м²" + " " + table1.getLegs() + " ножки");

        chair.displayFunction();
        chair.displayInfo();
        chair.displayChairFeatures();

        bed.displayFunction();
        bed.displayInfo();
        bed.displayBedFeatures();
        out.println("Наличие ящиков: " + bed.gethasStorage());

        out.println("Всего создано мебели: " + Furniture.getFurnitureCount());
    }
}
