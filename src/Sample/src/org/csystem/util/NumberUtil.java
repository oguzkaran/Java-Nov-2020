/*----------------------------------------------------------------------------------------------------------------------
	NumberUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import static java.lang.Math.log10;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class NumberUtil {
    public static int countDigits(int val)
    {
        return val == 1 ? 0 : (int)log10(abs(val)) + 1;
    }

    public static void displayCollatz(int n)
    {
        if (n <= 0) {
            System.out.println("Geçersiz değer");
            return;
        }

        for (;;) {
            System.out.println(n);

            if (n == 1)
                break;

            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
    }

    public static long factorial(int n)
    {
        long result = 1L;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static int getDigitalRoot(int val)
    {
        int root = abs(val);

        while (root > 9)
            root = sumDigits(root);

        return root;
    }


    public static int getDigitsFactorialSum(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += factorial(val % 10);
            val /= 10;
        }

        return sum;
    }

    public static int getDigitsPowSum(int val)
    {
        int n = countDigits(val);
        int sum = 0;

        while (val != 0) {
            sum += pow(val % 10, n);
            val /= 10;
        }

        return sum;
    }

    public static int getFibonacciNumber(int n)
    {
        if (n <= 0)
            return -1;

        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = 0;

        for (int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            prev2 = prev1;
            prev1 = val;
        }

        return val;
    }

    public static int getIndexOfPrimeNumber(int n)
    {
        int index = 1;
        int val = 2;

        for (;;) {
            if (val == n)
                return index;

            if (isPrime(val))
                ++index;

            ++val;
        }
    }

    public static int getNextFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, result;

        for (;;) {
            result = prev1 + prev2;

            if (result > val)
                return result;

            prev2 = prev1;
            prev1 = result;
        }
    }

    public static int getPrime(int n)
    {
        if (n <= 0)
            return -1;

        int count = 0;
        int val = 2;

        for (;;) {
            if (isPrime(val))
                ++count;

            if (count == n)
                return val;

            ++val;
        }
    }

    public static boolean isArmstrong(int val)
    {
        return val >= 0 && getDigitsPowSum(val) == val;
    }

    public static boolean isDecimalHarshad(int val)
    {
        if (val < 0)
            return false;

        return val % sumDigits(val) == 0;
    }

    public static boolean isEven(int val)
    {
        return val % 2 == 0;
    }

    public static boolean isFactorian(int val)
    {
        if (val <= 0)
            return false;

        return getDigitsFactorialSum(val) == val;
    }

    public static boolean isHardyRamanujan(int val)
    {
        if (val <= 0)
            return false;

        int count = 0;

        for (int x = 1; x * x * x < val;) {
            for (int y = x + 1; x * x * x + y * y * y <= val; ++y)  {
                if (x * x * x + y * y * y == val) {
                    ++count;
                    ++x;
                }
            }
            ++x;
        }

        return count >= 2;
    }

    public static boolean isOdd(int val)
    {
        return !isEven(val);
    }

    public static boolean isPalindrome(int val)
    {
        return reversed(val) == val;
    }

    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (int i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;

    }

    public static boolean isSuperPrime(int val)
    {
        return isPrime(val) && isPrime(getIndexOfPrimeNumber(val));
    }

    public static int max(int a, int b, int c)
    {
        return Math.max(Math.max(a, b),  c);
    }

    public static int min(int a, int b, int c)
    {
        return Math.min(Math.min(a, b),  c);
    }

    public static int reversed(int val)
    {
        int reverse = 0;

        while (val != 0) {
            reverse = reverse * 10 + val % 10;
            val /= 10;
        }

        return reverse;
    }

    public static int sumDigits(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return Math.abs(sum);
    }
}
