public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(allIndexOf("MMMM", 'M'));

    }

    public static String capVowelsLowRest(String string) {
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105
                        || string.charAt(i) == 111 || string.charAt(i) == 117) {

                    newString += (char) (string.charAt(i) - 32);

                } else {
                    newString += string.charAt(i);
                }

            } else {
                if ((string.charAt(i) >= 65 && string.charAt(i) <= 90)
                        && (!((string.charAt(i) == 65 || string.charAt(i) == 69 || string.charAt(i) == 73
                                || string.charAt(i) == 79 || string.charAt(i) == 85)))) {
                    newString += (char) (string.charAt(i) + 32);
                } else {
                    newString += string.charAt(i);
                }
            }

        }

        return newString;
    }

    public static String camelCase(String string) {
        String newString = "";
        int i = 0;
        while (i < string.length()) {
            char letter = string.charAt(i);
            if (letter != 32) {
                if (newString != "") {
                    if (string.charAt(i - 1) == 32) {
                        newString += upperCase(letter);
                    } else {
                        newString += lowerCase(letter);
                    }

                } else {
                    newString += lowerCase(letter);
                }

            }

            i++;
        }

        return newString;

    }

    public static char upperCase(char letter) {
        if ((letter >= 97 && letter <= 122)) {
            letter = (char) (letter - 32);
        }
        return letter;
    }

    public static char lowerCase(char letter) {
        if ((letter >= 65 && letter <= 90)) {
            letter = (char) (letter + 32);
        }
        return letter;
    }

    public static int[] allIndexOf(String string, char chr) {

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }

        int[] arr1 = new int[count];
        count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr1[count] = 1;
                count++;
            }
        }
        return arr1;
    }

}
