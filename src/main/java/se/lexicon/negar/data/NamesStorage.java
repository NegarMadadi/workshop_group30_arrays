package se.lexicon.negar.data;

import java.util.Arrays;

/**
 * @author Negar Madadi
 */
public class NamesStorage {
    private static String[] names = new String[0];

    public static boolean add(final String fullName) {
        if (fullName == null) {
            return false;
        }
        if (nameExist(fullName)) {
            return false;
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;
        return true;
    }


    /**
     * @param fullName String fullName
     * @return true if found.
     */
    public static boolean nameExist(String fullName) {
        boolean exists = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public static void clear() {
        names = new String[0];
    }
}






