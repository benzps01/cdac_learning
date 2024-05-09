using MetTours;
using System.Reflection;
using CostDelegate = System.Func<int, int, double>;

class Program
{
    static void Main(string[] args)
    {
        Type t = Type.GetType($"MetTours.{args[0]},MetTours");
        object policy = Activator.CreateInstance(t);
        MethodInfo scheme = t.GetMethod(args[1]);
        CostDelegate cpd = scheme.CreateDelegate<CostDelegate>(policy);
        double CostPerDay = cpd(int.Parse(args[2]), int.Parse(args[3]));
        double FinalCostBeforeTax = TotalCost.TotalAmount(CostPerDay, int.Parse(args[2]), int.Parse(args[3]));
        Console.WriteLine("Cost Per Day: " + CostPerDay);
        Console.WriteLine("Cost Of Days: " + FinalCostBeforeTax);
    }
}
