/**
 * @version 0.2022.0
 * @author Prudius Maksim АС-214
 */
package Vehicles1; // Практикум 3 - створення членів класів

/** Практикум 4 - документація класів
 * Клас Cars1 - містить в собі інформацію про виробника,
 * модель, рік випуску зазначених авто
 */
public class Cars1  {
//TODO: Конструктор класу Cars1
    /**
     * Три змінні нижче характеризують виробника, модель та рік випуску авто
     */
    private String manufacturer;
    private String model;
    private String color;

    /**
     * Створюємо метод, що повертає марку виробника автівки
     * @return бренд виробника
     */
    String getManufacturer(){
        return manufacturer;
    }

    /**
     * Створення об'єкту - Виробник з його указаним ім'ям
     * @param manufacturer - тип виробника
     */
    void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    /**
     * Метод - визначає модель авто
     * @return назву моделі
     */
    public String getModel() {
        return model;
    }

    /**
     * Створюємо Об'єкт - зазначена модель автомобіля
     * @param model - тип моделі
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Створення методу, що показує колір машини
     * @return колір машини
     */
    public String getColor() {
        return color;
    }

    /**
     * Цей об'єкт визначає колір машини
     * @param color - назва кольору
     */
    public void setColor(String color) {
        this.color = color;
    }
}

