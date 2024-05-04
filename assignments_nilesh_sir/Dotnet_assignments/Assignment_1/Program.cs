using System;
class Program
{
    public static void Main(string[] args)
    {
        int n1 = int.Parse(args[0]);
        int n2 = int.Parse(args[1]);


        Console.WriteLine("Total Primes are: {0}", MathUtil.CountPrime(n1, n2));
        Console.WriteLine("Addition of {0} & {1} is: {2}", n1, n2, MathUtil.Add(n1, n2));
        Console.WriteLine("{1} - {0} is: {2}", n2, n1, MathUtil.Subtract(n1, n2));
        Console.WriteLine("{0} * {1} = {2}", n1, n2, MathUtil.Multiply(n1, n2));
    }
}