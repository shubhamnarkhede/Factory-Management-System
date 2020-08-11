public class Factory{
	
	private String Name;
	private String Location;
	private int EstYear;
	private int NoOfMachines;
	private int NoOfEmployees;

    public Factory(){};

    public Factory(String name, String location, int estYear, int noOfMachine, int noOfEmployees)
    {
     	this.Name = name;
        this.Location = location;
        this.EstYear = estYear;
        this.NoOfMachines = noOfMachine;
        this.NoOfEmployees = noOfEmployees;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getEstYear() {
        return EstYear;
    }

    public void setEstYear(int EstYear) {
        this.EstYear = EstYear;
    }

    public int getNoOfMachines() {
        return NoOfMachines;
    }

    public void setNoOfMachines(int NoOfMachines) {
        this.NoOfMachines = NoOfMachines;
    }

    public int getNoOfEmployees() {
        return NoOfEmployees;
    }

    public void setNoOfEmployees(int NoOfEmployees) {
        this.NoOfEmployees = NoOfEmployees;
    }
}