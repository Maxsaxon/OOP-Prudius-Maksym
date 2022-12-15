/**
 * Практикум 7
 */
package Vehicles1;


public class Numbers {
    public static void main(String[] args) {
        //   digit1 -> {1}
        //   digit2 -> {2}

      Digit digit1 = new Digit(1);
      Digit digit2 = new Digit(1);

      System.out.println(digit1.equals(digit2));

    }
}

class Digit {
    private int id;

    public Digit(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Digit otherDigit = (Digit) obj;

        return this.id == otherDigit.id;
    }
}
