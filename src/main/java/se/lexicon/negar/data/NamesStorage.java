package se.lexicon.negar.data;

public class NamesStorage {
    private static String[] names = new String[0];

    /**
     *
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



