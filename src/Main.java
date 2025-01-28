public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Объявите переменные типа int, byte, short, long, float, double
        int a = 1000000000;
        byte b = 125;
        short c = 32000;
        long d = 57885885;
        float e = 3.123456F;
        double f = 1.123456789101112131415F;
        System.out.println("Значение переменной 'a' " + "с типом " + ((Object) a).getClass().getSimpleName() + " равно " + a);
        System.out.println("Значение переменной 'b' " + "с типом " + ((Object) b).getClass().getSimpleName() + " равно " + b);
        System.out.println("Значение переменной 'с' " + "с типом " + ((Object) c).getClass().getSimpleName() + " равно " + c);
        System.out.println("Значение переменной 'd' " + "с типом " + ((Object) d).getClass().getSimpleName() + " равно " + d);
        System.out.println("Значение переменной 'a' " + "с типом " + ((Object) e).getClass().getSimpleName() + " равно " + e);
        System.out.println("Значение переменной 'f' " + "с типом " + ((Object) f).getClass().getSimpleName() + " равно " + f);

        //Задача 2
        //Инициализируйте переменные 1000000000
        double ff = 27.12;
        double ee = 987678965549F;
        String aa = "2,786";
        short bb = 569;
        short cc = -159;
        short dd = 27897;
        byte gg = 67;

        //Задача 3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paperList = 480;
        System.out.println("На каждого ученика рассчитано " + (paperList / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna)) + " листов бумаги");

        //Задача 4
        byte bottle = 16;
        byte minutes = 2;
        System.out.println("За 20 минут машина произвела " + (bottle / minutes) * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + (bottle / minutes) * (24 * 60) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (bottle / minutes) * (24 * 60) * 3 + " штук бутылок");

        //Задача 5
        byte totalJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int totalClass = totalJar / (whiteJar + brownJar);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass * whiteJar + " банок белой краски и " + totalClass * brownJar + " банок коричневой краски");

        //Задача 6
        byte banana = 5;
        int kgBanana = banana * 80;
        short milk = 200;
        int kgMilk = milk / 100 * 105;
        byte iceCream = 2;
        int kgIceCream = iceCream * 100;
        byte eggs = 4;
        int kgEggs = eggs * 70;
        int grams = kgBanana + kgMilk + kgIceCream + kgEggs;
        float kg = grams / 1000F;
        System.out.println("Вес в граммах " + grams);
        System.out.println("Вес в Килограммах " + kg);

        //Задача 7
        short diet_1 = 250;
        short diet_2 = 500;
        byte targetDiet = 7;
        int gm250 = targetDiet * 1000 / diet_1;
        int gm500 = targetDiet * 1000 / diet_2;
        int averageDay = (gm250 + gm500) / 2;
        System.out.println("При Диете-1 и сбросом веса по 250гр. в день, потребуется " + gm250 + " дней");
        System.out.println("При Диете-2 и сбросом веса по 500гр. в день, потребуется " + gm500 + " дней");
        System.out.println("В среднем при Диете, потребуется " + averageDay + " дней");

        //Задача 8.
        int salaryMasha = 67760;
        int salaryMashaYear = salaryMasha * 12;
        int salaryDenis = 83680;
        int salaryDenisYear = salaryDenis * 12;
        int salaryKristina = 76230;
        int salaryKristinaYear = salaryKristina * 12;
        float bonus = 1.1F;
        float salaryMashaBonus = salaryMasha * bonus;
        float salaryDenisBonus = salaryDenis * bonus;
        float salaryKristinaBonus = salaryKristina * bonus;
        System.out.println("Маша теперь получает " + salaryMashaBonus + " рублей. Годовой доход вырос на " + (salaryMashaBonus * 12 - salaryMashaYear) + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisBonus + " рублей. Годовой доход вырос на " + (salaryDenisBonus * 12 - salaryDenisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaBonus + " рублей. Годовой доход вырос на " + (salaryKristinaBonus * 12 - salaryKristinaYear) + " рублей.");
    }
}