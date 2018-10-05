public class Utility1 {

    public static boolean containsConsecutiveDuplicate(String str) {
        char[] str_array = str.toCharArray();
        boolean flag = false;
        for (int i = 1; i < str_array.length; i++) {
            if (str_array[i - 1] == str_array[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static String reverseString(String str) {
        char[] c_ar = str.toCharArray();
        char temp;
        int length = c_ar.length;
        for (int i = 0; i < length / 2; i++) {
            temp = c_ar[i];
            c_ar[i] = c_ar[length - 1 - i];
            c_ar[length - 1 - i] = temp;
        }
        return reverseCharArray(c_ar);
    }

    public static String reverseCharArray(char[] c_ar) {
        int length = c_ar.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toString(c_ar[i]));
        }
        return sb.toString();
    }

}
