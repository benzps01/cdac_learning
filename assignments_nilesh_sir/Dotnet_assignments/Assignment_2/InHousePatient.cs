class InHousePatient : Patient
{
    public double Discount => base.BillAmount > 5000 ? 0.05 : 0.00;

    public override double BillAmount => base.BillAmount - (base.BillAmount * Discount);
}