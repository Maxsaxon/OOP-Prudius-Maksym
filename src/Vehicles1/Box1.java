/** Практикум 3, 4
 * @version 0.2022.0
 * @author Prudius Maksim АС-214
 */
package Vehicles1; // Практикум 2 - створення структури проекту та Джава класів

/**
 * Клас Box з конкретними даними про автівки
 */
public class Box1 {
    /**
     * Змінна, що вміщує в собі дані про виробника, модель та колір автівок
     * @param args - тип даних
     */
    public static void main(String[] args) {
        Cars1 n = new Cars1();
        n.setManufacturer("Tesla");
        n.setModel("X");
        n.setColor("White");

        Cars1 m = new Cars1();
        m.setManufacturer("Ford");
        m.setModel("Mustang");
        m.setColor("Red");

        System.out.println(n.getManufacturer());
        System.out.println(n.getModel());
        System.out.println(n.getColor());

        System.out.println(m.getManufacturer());
        System.out.println(m.getModel());
        System.out.println(m.getColor());
    }
}
