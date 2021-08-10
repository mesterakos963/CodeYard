import Animals.Animal;

import java.util.ArrayList;

public class Zoo {
    /* #TODO
     * - Név (statikus)
     * - Állatok tömb, Animals.Animal típúsú */

    public static String name;
    ArrayList<Animal> animals = new ArrayList<>();

    public static void setName(String name) {
        Zoo.name = name;
    }
}
