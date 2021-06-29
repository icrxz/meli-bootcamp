package modulo5.aula4.exercicio2.itens;

import static java.lang.System.out;

class StringUtil {
    public static String rpad(String s, char c, int n) {
        if (s.length() >= n)
            return s;

        StringBuilder sb = new StringBuilder(s);

        while(sb.length() < n)
            sb.append(c);

        return sb.toString();
    }

    public static String ltrim(String s) {
        int trimIndex = 0;

        for(; trimIndex < s.length(); trimIndex++) {
            if (!Character.isWhitespace(s.charAt(trimIndex)))
                break;
        }

        return s.substring(trimIndex);
    }

    public static String rtrim(String s) {
        int trimIndex = s.length() - 1;

        for(; trimIndex > 0; trimIndex--) {
            if (!Character.isWhitespace(s.charAt(trimIndex)))
                break;
        }

        return s.substring(0, trimIndex + 1);
    }

    public static String trim(String s) {
        String ltrim = s.replaceAll("^\\s+", "");

        return ltrim.replaceAll("\\s+$", "");
    }

    public static int indexOfN(String s, char c, int n) {
        int count = 0;
        int charIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;

                if (count == n) {
                    charIndex = i;
                    break;
                }
            }
        }

        return charIndex;
    }
}

public class Exercise6 {
    public static void exec() {
        out.println("String padding: " + StringUtil.rpad("testing", '_', 10));

        out.println("String left trim: " + StringUtil.ltrim("   testing   "));
        out.println("String right trim: " + StringUtil.rtrim("   testing   "));
        out.println("String trim: " + StringUtil.trim("   testing   "));

        out.println("Index of 2 char t in word testing: " + StringUtil.indexOfN("testing", 't', 2));
        out.println("Index of 1 char t in word testing: " + StringUtil.indexOfN("testing", 't', 1));
        out.println("Index of char don't exist: " + StringUtil.indexOfN("testing", 't', 4));
    }
}
