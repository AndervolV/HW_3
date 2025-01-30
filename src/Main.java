public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Объявите переменные типа int, byte, short, long, float, double
        int oneInt;
        oneInt = 1000000000;
        byte tooByte;
        tooByte = 125;
        short threeShort;
        threeShort = 32000;
        long fourLong;
        fourLong = 57885885;
        float fiveFloat;
        fiveFloat = 3.123456F;
        double sixDouble;
        sixDouble = 1.123456789101112131415F;
        System.out.println("Значение переменной 'a' с типом 'int' равно " + oneInt);
        System.out.println("Значение переменной 'b' с типом 'byte' равно " + tooByte);
        System.out.println("Значение переменной 'с' с типом 'short' равно " + threeShort);
        System.out.println("Значение переменной 'd' с типом 'long' равно " + fourLong);
        System.out.println("Значение переменной 'a' с типом 'float' равно " + fiveFloat);
        System.out.println("Значение переменной 'f' с типом 'double' равно " + sixDouble);

        //Задача 2
        //Инициализируйте переменные 1000000000
        double oD;
        oD = 27.12;
        long dV;
        dV = 987678965549L;
        float tR;
        tR = 2.786F;
        short cHe;
        cHe = 569;
        short pYa;
        pYa = -159;
        short sHe;
        sHe = 27897;
        byte sEm;
        sEm = 67;

        //Задача 3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int toEvereone = totalPaper / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + (toEvereone) + " листов бумаги");

        //Задача 4
        byte bottle = 16;
        byte minutes = 2;
        int bottle2 = bottle / minutes;
        int za_20Min = bottle2 * 20;
        int zaSutki = bottle2 * 60 * 24;
        int za_3Day = bottle2 * zaSutki * 3;
        int za_30Day = bottle2 * zaSutki * 30;
        System.out.println("За 20 минут машина произвела " + za_20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + zaSutki + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + za_3Day + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " + za_30Day + " штук бутылок");

        //Задача 5
        byte totalJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int totalClass = totalJar / (whiteJar + brownJar);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass * whiteJar + " банок белой краски и " + totalClass * brownJar + " банок коричневой краски");

        //Задача 6
        byte banana = 5;
        int weightBanana = banana * 80;
        short milk = 200;
        int weightMilk = milk / 100 * 105;
        byte iceCream = 2;
        int weightIceCream = iceCream * 100;
        byte eggs = 4;
        int weightEggs = eggs * 70;
        int grams = weightBanana + weightMilk + weightIceCream + weightEggs;
        float kg = grams / 1000F;
        System.out.println("Общий вес в граммах " + grams);
        System.out.println("Общий вес в Килограммах " + kg);

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

        //Задача 8
        int salaryMasha = 67760;
        int salaryMashaYear = salaryMasha * 12;
        int salaryDenis = 83680;
        int salaryDenisYear = salaryDenis * 12;
        int salaryKristina = 76230;
        int salaryKristinaYear = salaryKristina * 12;
        float bonus = 1.1F;
        float salaryMashaBonus = salaryMashaYear * bonus;
        float salaryDenisBonus = salaryDenisYear * bonus;
        float salaryKristinaBonus = salaryKristinaYear * bonus;
        System.out.println("Маша получила в этом году " + salaryMashaYear + " рублей");
        System.out.println("Маша теперь получает " + salaryMashaBonus + " рублей в год. Годовой доход вырос на " + (salaryMashaBonus - salaryMashaYear) + " рублей.");
        System.out.println("Денис получил в этом году " + salaryDenisYear + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisBonus + " рублей в год. Годовой доход вырос на " + (salaryDenisBonus - salaryDenisYear) + " рублей.");
        System.out.println("Кристина получила в этом году " + salaryKristinaYear + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaBonus + " рублей в год. Годовой доход вырос на " + (salaryKristinaBonus - salaryKristinaYear) + " рублей.");
    }
}