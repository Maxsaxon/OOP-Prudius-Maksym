package Vehicles1;

/**
 * Практикум №5
 */
public class Logic extends Box1 { // Практикум 6 - Успадкування класів
    /**
     * Статична змінна Main,
     * що містить в собі дані про ціни автомобіля та персональний дохід
     * @param args тип даних
     */
    public static void main(String [] args)
    {
        int ford_price = 20000;
        int tesla_price = 35000;

        int personal_income = 34000;

        if (personal_income == ford_price) // Can I afford this car? First case
        {
            System.out.println("Yes, I will buy this car");
        }
        else if (personal_income >= tesla_price) // Can I afford this car? Second case
        {
            System.out.println("Yes, I will buy this car later");
        }
        else if (personal_income < tesla_price)
        {
           System.out.println("No, I wont buy this car");
        }
        /**
         * конструкція switch
         */
        int num1 = 5;
        switch (num1) {
            case 1:
                System.out.println("Number 1");
            break;
            case 8:
                System.out.println("Number 8");
                break;
            case 25:
                System.out.println("Number 25");
               break;
            default:
                System.out.println("Number 1, 8, 25");
        }
        for (int i = 0;i<20; i++){ // цикл for, бінарні та унарні оператори
            if(i==3)
                break;
            System.out.println(i);
        }
        int count = 8;
        while(count<23){ // цикл while
            System.out.println("Count is" + count);
            count++;
        }
        }
    }

