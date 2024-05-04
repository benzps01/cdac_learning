
Patient p1 = new Patient();
p1.Pname = "Benson";
p1.Bed = BedType.ECONOMICAL;
p1.NoOfDays = 35;
p1.Display();

InHousePatient p2 = new();
p2.Pname = "Samson";
p2.Bed = BedType.EXECUTIVE;
p2.NoOfDays = 30;
p2.Display();