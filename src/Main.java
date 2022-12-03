public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork06");
        System.out.println("\nPart 1");

        int amountMoneyToCollect = 2_459_000;
        int increasePerMonth = 15000;
        int currentMoneyCollected = 0;
        int needMonthsForCollectMoney = 0;
        while (currentMoneyCollected < amountMoneyToCollect) {
            currentMoneyCollected += increasePerMonth;
            needMonthsForCollectMoney++;
        }
        System.out.println("Для накопления " + amountMoneyToCollect + " понадобится откладывать по " + increasePerMonth + "р. в течение " + needMonthsForCollectMoney + " месяцев");

        System.out.println("\nPart 2");
        int temp = 1;
        while (temp <= 10) {
            System.out.print(temp + " ");
            temp++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nPart 3");
        int currentPeople = 12_000_000;
        int yearAddPer1000 = 17;
        int yearDecPer1000 = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Год " + i + " , численость населения составляет " + currentPeople + " человек");
            currentPeople = currentPeople + currentPeople * (yearAddPer1000 - yearDecPer1000) / 1000;
        }

        System.out.println("\nPart 4");
        double currentMoneyInBank = 15000;
        int bankSavingPercent = 7;
        int amountMoneyNeedVasiliy = 12_000_000;
        int needMonthsForVasiliy = 0;
        while (currentMoneyInBank < amountMoneyNeedVasiliy) {
            currentMoneyInBank += currentMoneyInBank * bankSavingPercent / 100;
            needMonthsForVasiliy++;
            if (needMonthsForVasiliy % 6 == 0) {
                System.out.println("Месяц " + needMonthsForVasiliy + " сумма " + (int) currentMoneyInBank);
            }
        }
        System.out.println("Для накопления суммы " + amountMoneyNeedVasiliy + " Василию понадобится " + needMonthsForVasiliy + " месяцев");

        System.out.println("\nPart 5");
        currentMoneyInBank = 15000;
        bankSavingPercent = 7;
        int amountYearsSaving = 9;
        for (int i = 1; i < amountYearsSaving; i++) {
            for (int j = 1; j <= 12; j++) {
                currentMoneyInBank += currentMoneyInBank * bankSavingPercent / 100;
                if (j % 6 == 0) {
                    System.out.println("Год: " + i + " , Месяц: " + j + "  Сумма " + (int) currentMoneyInBank);
                }
            }
        }

        System.out.println("\nPart 6");
        int fridayInOrder = 2;
        int daysInMonth = 31;
        for (int i = 1; i <= daysInMonth; i++) {
            if ((i - fridayInOrder) % 7 == 0) {
                System.out.println("Cегодня " + i + " число, пятница! Необходимо подготовить отчет !");
            }
        }

        System.out.println("\nPart 7");
        int yearFirstComet = 0;
        int periodYearComet = 79;
        int currentYear = 2022;
        int intervalYearsStart = 200;
        int intervalYearsFinish = 100;
        for (int i = yearFirstComet; i < (currentYear + intervalYearsFinish); i += periodYearComet) {
            if (i % periodYearComet == 0) {
                if ((currentYear - intervalYearsStart) < i && i <= (currentYear + intervalYearsFinish)) {
                    System.out.println("Год наблюдения кометы " + i);
                }
            }
        }

        System.out.println("\nPart 8");
        int firsTableNumber = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(firsTableNumber + "*" + i + "=" + firsTableNumber * i);
        }

        System.out.println("\nAddon Task 4 Ping-Pong\n");
        for (int i = 1; i <= 30; i++) {
            System.out.print("\n" + i + ":");
            if (i % 3 == 0) {
                System.out.print(" Ping");
            }
            if (i % 5 == 0) {
                System.out.print(" Pong");
            }
        }

        System.out.println("\n\nAddon Task 5 Fibonachi\n");
        int fibonachiLeftNumber = 0;
        int fibonachiRightNumber = 1;
        int temporaryNumberFibonachi = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonachiLeftNumber + " ");
            temporaryNumberFibonachi = fibonachiLeftNumber + fibonachiRightNumber;
            fibonachiLeftNumber = fibonachiRightNumber;
            fibonachiRightNumber = temporaryNumberFibonachi;
        }
    }
}