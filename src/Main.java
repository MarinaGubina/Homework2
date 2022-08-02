public class Main {
    public static void main(String[] args) {

        // Задача 1

        byte apples = 2;
        short pears = 50;
        int plums = 230;
        long cherry = 1056L;
        float saltWeight = 4.67f;
        double sugarWeight = 3.9786;
        char ampersand = 38;
        boolean c = 10>5;

        // Задача 2

        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float sumWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров: "+sumWeight+ " кг.");
        float differenceWeight = weightBoxer1 - weightBoxer2;
        System.out.println("Разница в весе бойцов: " + Math.abs(differenceWeight) + " кг.");

        // Задача 3

        int bananas = 5;
        int bananaWeight = 80 ;
        int milk = 200/100;
        int milkWeight = 105;
        int ice = 2;
        int iceWeight = 100;
        int eggs = 4;
        int eggWeight = 70 ;
        int shakeWeightG = bananas*bananaWeight + milk * milkWeight + ice * iceWeight + eggs * eggWeight;
        int gPerKg = 1000;
        float shakeWeightKg = shakeWeightG / (float)gPerKg;
        System.out.println("Вес спорт-завтрака: " + shakeWeightKg+ " кг.");

        // Задача 4

        int goal = 7 * 1000;
        int step1 = 250;
        int step2 = 500;
        int weightLose250 = goal / step1;
        int weightLose500 = goal / step2;
        int mediumDay = (weightLose250 + weightLose500) / 2;
        System.out.println(" Если спортсмен будет терять в весе 250 грамм в день, то он похудеет на 7 кг за " + weightLose250 + " дней.");
        System.out.println(" Если спортсмен будет терять в весе 500 грамм в день, то он похудеет на 7 кг за " + weightLose500 + " дней.");
        System.out.println(" В среднем для похудения потребуется " + mediumDay + " дней.");

        // Задача 5

        int payMasha = 67_760;
        int payDenis = 83_690;
        int payKris = 76_230;
        int payRaiseMasha = payMasha + payMasha * 10/100;
        int payRaiseDenis = payDenis + payDenis * 10/100;
        int payRaiseKris = payKris + payKris * 10/100;
        int month = 12;
        int diffPayYearMasha = (payRaiseMasha-payMasha)* month;
        int diffPayYearDenis = (payRaiseDenis - payDenis) * month;
        int diffPayYearKris = (payRaiseKris - payKris) * month;
        System.out.println("Маша теперь получает " + payRaiseMasha + " рублей. Годовой доход вырос на " + diffPayYearMasha + " рублей.");
        System.out.println("Денис теперь получает " + payRaiseDenis + " рублей. Годовой доход вырос на " + diffPayYearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + payRaiseKris + " рублей. Годовой доход вырос на " + diffPayYearKris + " рублей.");


    }
}