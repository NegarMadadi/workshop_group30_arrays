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
      names = addStringToArray(names,fullName);
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


    public static String[] findByFirstName(final String firstName){
        String[] result = new String[0];
        for(String fullName: names){
            String extracted = fullName.substring(0,fullName.indexOf(" "));
            if (extracted.equalsIgnoreCase(firstName)){
                result = addStringToArray(result, fullName);
            }
        }
    return result;
    }

    private static String[] addStringToArray(final String[] source,final String string) {
        String[] returnArray = Arrays.copyOf(source,source.length+1);
        returnArray[returnArray.length-1] = string;
        return returnArray;
    }

}










