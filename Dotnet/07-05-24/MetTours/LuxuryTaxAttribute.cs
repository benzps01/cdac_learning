namespace MetTours;

[AttributeUsage(AttributeTargets.Method)]
public class LuxuryTaxAttribute(int tax = 8) : Attribute
{
    public int Tax { get; set; } = tax;
}