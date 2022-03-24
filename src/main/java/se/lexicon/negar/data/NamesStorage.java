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
        names = addStringToArray(names, fullName);
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


    public static String[] findByFirstName(final String firstName) {
        String[] result = new String[0];
        for (String fullName : names) {
            String extracted = fullName.substring(0, fullName.indexOf(" "));
            if (extracted.equalsIgnoreCase(firstName)) {
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }

    private static String[] addStringToArray(final String[] source, final String string) {
        String[] returnArray = Arrays.copyOf(source, source.length + 1);
        returnArray[returnArray.length - 1] = string;
        return returnArray;
    }

    public static String[] findByLastName(final String lastName) {
        String[] result = new String[0];
        for (String fullName : names) {
            String extracted = fullName.substring(fullName.indexOf(" ")).trim();
            if (extracted.equalsIgnoreCase(lastName)) {
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }


    public static boolean remove(final String fullName) {
        int index = getIndexOfString(names, fullName);
        if (index < 0) {
            return false;
        }
        names = removeByIndex(names, index);
        return false;
    }

    private static String[] removeByIndex(final String[] strings, final int index) {
        String[] first = Arrays.copyOfRange(strings, 0, index);
        String[] last = Arrays.copyOfRange(strings, index + 1, strings.length);

        String[] combined = Arrays.copyOf(first, first.length + last.length);
        for (int writePos = first.length, readPos = 0; readPos < last.length; writePos++, readPos++) {
            combined[writePos] = last[readPos];
        }
        return combined;
    }
/* this is another version of upper for loop
        System.arraycopy(last,
                0,
                combined,
                first.length,
                last.length
        );
        return combined;
    }
 */


    private static int getIndexOfString(String[] strings, String fullName) {
        int index = -1;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase(fullName)) {
                index = i;
                break;
            }
        }
        return index;
    }
}








