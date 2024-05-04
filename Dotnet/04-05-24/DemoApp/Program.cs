namespace DemoApp;

class Program
{
    /*
        This will work for all value types and reference types
        provided we cast it to appropriate type, but for value types
        it boxes to reference types and unboxes again to value type.
        Also boxing and unboxing is a expensive process
    */
    //static object Select(int index, object first, object second)
    // {
    //     if ((index % 2) == 1)
    //         return first;
    //     return second;
    // }

    static V Select<V>(int index, V first, V second)
    {
        if ((index % 2) == 1)
            return first;
        return second;
    }
    static void Main(string[] args)
    {
        // TryParse => tries to Parse to corresponding datatype
        // if successful then returns the value using the variable
        // else returns false
        if (args.Length > 0 && int.TryParse(args[0], out int s))
        {
            // string ss = (string)Select(s, "Monday", "Tuesday");
            // Console.WriteLine(ss);
            // double sd = (double)Select(s, 47.8, 54.3);
            // Console.WriteLine(sd);

            string ss = Select(s, "Monday", "Tuesday");
            Console.WriteLine(ss);
            double sd = Select(s, 47.8, 54.3);
            Console.WriteLine(sd);

        }
    }
}
