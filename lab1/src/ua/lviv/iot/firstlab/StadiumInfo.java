package ua.lviv.iot.firstlab;

import static ua.lviv.iot.firstlab.Stadium.*;

public class StadiumInfo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ STADIUM OBJECTS ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        Stadium NSK = new Stadium(1, 70050, "Olympic Stadium", 500, 1923, "Kyiv", true, "Ukraine");
        Stadium dynamo = new Stadium(2, 16873, "Dynamo", 1200, 1934);
        Stadium arena = new Stadium();
        System.out.println(NSK);
        System.out.println(dynamo);
        System.out.println(arena);
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ RESET VALUES ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        System.out.println();
        arena.resetValues(3, 34951, "Arena Lviv", 2400, 2011, "Lviv", true, "Ukraine");
        System.out.println(arena);
        System.out.println();
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ STATIC METHODS AND FIELD ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ಠ‿ಠ)├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        dynamo.printNumber_of_stadiums();
        printNumber_of_viewers(NSK);
        printOpening_year(arena);
        printPower_of_lighting_inlux(dynamo);
        System.out.println();
        System.out.println("├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤ 14 STEP ├┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┤");
        //Stadium abroad[];
        //Stadium random[];
        int chisloforcikly = 0;
        Stadium[] random = new Stadium[4];
        do {
            //int forViewersAndLighting = chisloforcikly;
            random[chisloforcikly] = new Stadium(getNumber_of_stadiums() + 1, (chisloforcikly + 1) * 10000, "unknown", chisloforcikly * 400, 2020);
            chisloforcikly++;
        }
        while (chisloforcikly < 4);

        for (Stadium chisloforrandom : random) {
            System.out.println(chisloforrandom);
        }
    }
}
