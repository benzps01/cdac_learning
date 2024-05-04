using System.Security.Cryptography.X509Certificates;

class MathUtil
{
    private static bool IsPrime(int num)
    {
        if (num == 1 || num == 0)
        {
            return false;
        }
        if (num == 2 || num == 3 || num == 5)
        {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
        {
            return false;
        }
        for (int i = 5; i < num / 2; i += 6)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int CountPrime(int num1, int num2)
    {
        int Count = 0;
        for (int i = num1; i <= num2; i++)
        {
            if (IsPrime(i))
            {
                Count++;
            }
        }
        return Count;
    }

    public static int Add(int num1, int num2)
    {
        return num1 + num2;
    }

    public static int Subtract(int num1, int num2)
    {
        return num2 - num1;
    }

    public static int Multiply(int num1, int num2)
    {
        return num1 * num2;
    }
}