/*----------------------------------------------------------------------------------------------------------------------
	StringUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import java.util.Random;
import static java.lang.Character.isWhitespace;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.isLetter;

public class StringUtil {
    public static String capitalize(String s)
    {
        return s.isEmpty() ? s : toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s)
    {
        char [] c = new char[s.length()];

        for (int i = 0; i < c.length; ++i) {
            char ch = s.charAt(i);

            c[i] = Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        }

        return String.valueOf(c);
    }

    public static int countString(String s1, String s2)
    {
        int count = 0;

        for (int index = -1; (index = s1.indexOf(s2, index + 1)) != -1; ++count)
            ;

        return count;
    }

    public static int countStringIgnoreCase(String s1, String s2)
    {
        return countString(s1.toLowerCase(), s2.toLowerCase());
    }

    public static String getLetters(String s)
    {
        String str = "";
        int length = s.length();


        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);

            if (isLetter(c))
                str += c;
        }

        return str;
    }

    public static String getLongestPalindrome(String text)
    {
        String result = "";

        int end = text.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = text.substring(begin++, end);

                if (str.length() > 1 && isPalindrome(str) && str.length() > result.length())
                    result = str;
            }

            --end;
        }

        return result;
    }

    public static String getRandomText(Random r, int n, String sourceText)
    {
        int length = sourceText.length();
        char [] c = new char[n];

        for (int i = 0; i < n; ++i)
            c[i] = sourceText.charAt(r.nextInt(length));

        return String.valueOf(c);
    }

    public static String getRandomTextTR(Random r, int n)
    {
        return getRandomText(r, n, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String getRandomTextTR(int n)
    {
        return getRandomTextTR(new Random(), n);
    }

    public static String getRandomTextEN(Random r, int n)
    {
        return getRandomText(r, n, "ABCDEFGHIJKLMNOPQRSTUWXVYZabcdefghijklmnopqrstuvwxyz");
    }

    public static String getRandomTextEN(int n)
    {
        return getRandomTextEN(new Random(), n);
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = toLowerCase(s.charAt(left));

            if (!isLetter(cLeft)) {
                ++left;
                continue;
            }

            char cRight = toLowerCase(s.charAt(right));

            if (!isLetter(cRight)) {
                --right;
                continue;
            }

            if (cLeft != cRight)
                return false;

            ++left;
            --right;
        }

        return true;
    }

    public static boolean isPangram(String text, String alphabet)
    {
        int length = alphabet.length();

        for (int i = 0; i < length; ++i)
            if (text.indexOf(alphabet.charAt(i)) == -1)
                return false;

        return true;
    }

    public static boolean isPangramEN(String s)
    {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String padLeading(String s, int length, char ch)
    {
        return length <= s.length() ? s : (ch + "").repeat(length - s.length()) + s;
    }

    public static String padLeading(String s, int length)
    {
        return padLeading(s, length, ' ');
    }

    public static String padTrailing(String s, int length, char ch)
    {
        return length <= s.length() ? s : s + (ch + "").repeat(length - s.length());
    }

    public static String padTrailing(String s, int length)
    {
        return padTrailing(s, length, ' ');
    }

    public static String removeWhiteSpaces(String s)
    {
        int length = s.length();
        String str = "";

        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);

            if (!isWhitespace(ch))
                str += ch;
        }

        return str;
    }

    public static String reverse(String s)
    {
        char [] c = s.toCharArray();

        ArrayUtil.reverse(c);

        return String.valueOf(c);
    }

    public static String trimLeading(String s)
    {
        int i;
        int length = s.length();

        for (i = 0; i < length && isWhitespace(s.charAt(i)); ++i)
            ;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i;

        for (i = s.length() - 1; i >= 0 && isWhitespace(s.charAt(i)); --i)
            ;

        return s.substring(0, i + 1);
    }
}
