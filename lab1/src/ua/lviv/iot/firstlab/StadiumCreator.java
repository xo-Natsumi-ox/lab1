package ua.lviv.iot.firstlab;

import static ua.lviv.iot.firstlab.Stadium.*;

public class StadiumCreator {
    public static void main(String[] args) {
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ STADIUM OBJECTS ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        Stadium nsk = new Stadium(1, 70050, "Olympic Stadium", 500, 1923, "Kyiv", true, "Ukraine");
        Stadium dynamo = new Stadium(2, 16873, "Dynamo", 1200, 1934);
        Stadium arena = new Stadium();
        System.out.println(nsk);
        System.out.println(dynamo);
        System.out.println(arena);
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ RESET VALUES ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        arena.resetValues(3, 34951, "Arena Lviv", 2400, 2011, "Lviv", true, "Ukraine");
        System.out.println(arena);
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ STATIC METHODS AND FIELD ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ಠ‿ಠ)├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        dynamo.printNumberOfStadiums();
        printNumberOfViewers(nsk);
        printOpeningYear(arena);
        printPowerOfLightingInLux(dynamo);
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ 14 STEP ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        int stadiumIterator = 0;
        Stadium[] stadiums = new Stadium[4];
        do {
            stadiums[stadiumIterator] = new Stadium(getNumberOfStadiums() + 1, (stadiumIterator + 1) * 10000, "unknown", stadiumIterator * 400, 2020);
            stadiumIterator++;
        }
        while (stadiumIterator < 4);

        for (Stadium arrayIterator : stadiums) {
            System.out.println(arrayIterator);
        }
    }
}
