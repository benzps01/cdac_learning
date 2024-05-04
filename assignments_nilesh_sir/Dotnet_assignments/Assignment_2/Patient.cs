using System;
class Patient
{
    private static int Count = 0;

    public int PatientId { get; } = ++Count;

    public string Pname { get; set; }

    public BedType Bed { get; set; }
    public int NoOfDays { get; set; }

    public int GetPricePerDay
    {
        get
        {
            switch (Bed)
            {
                case BedType.EXECUTIVE:
                    return 500;
                case BedType.SPECIAL:
                    return 350;
                default:
                    return 200;
            }
        }
    }

    public virtual double BillAmount => NoOfDays * GetPricePerDay;

    public void Display()
    {
        Console.WriteLine("Patient {0} with ID {1} has been admitted for {2} days with Bed as {3} and the bill total is: {4} ", Pname, PatientId, NoOfDays, Bed, BillAmount);
    }
}