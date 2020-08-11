import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static ArrayList<Factory> data = new ArrayList<Factory>();
        static Scanner hold= new Scanner(System.in);
            
    public static void main(String[] args){
            menu();
    } 

    public static void menu(){
    
        try{    
        System.out.println("---------------------------------------------------------------------------------------\n---------------------------------------------------------------------------------------\n-------------------------------FACTORY MANAGEMENT SYSTEM-------------------------------");
        System.out.println("1. Add new Factory");
        System.out.println("2. List of all Factories with their details ");
        System.out.println("3. List of all Factories with their details established in same year. Year Required");
        System.out.println("4. Remove Factory");        
        System.out.println("5. Update a Factory attribute like name, location");
        System.out.println("6. Search for Factory By Name");        
        System.out.println("7. Exit");
        System.out.println("Enter Your Choice : ");

    Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                addFactory();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                FindByYear();
                break;
            case 4:
                RemoveFactoryDetails();
                break;
            case 5:
                UpdateDetails();
                break;
            case 6:
                FindByName();
                   break;   
            case 7:
                  System.out.println("Welcome to use this system next time!\n");
                break;
            default:
                  System.out.println("Input format is not standardized!\n");
                menu();
                break;
        }
        }
        catch(Exception e)  
        {  
            System.out.println("!!!!!!!!!!!Invalid Input!!!!!!!!!!!\n Press Enter to Continue.....................");
            hold.nextLine();
            menu();
        }  

}

             // Add Factory information
    public static void addFactory() {
                String name;
        String location;
        int estYear;
        int noOfMachines;
        int noOfEmployees;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name of the Company ");
        name = sc.nextLine();
        System.out.println("Enter The Location ");
        location = sc.nextLine();
        System.out.println("Enter The Year of Establishment of the Company ");
        estYear =sc.nextInt();
        System.out.println("Enter The Number of Machines");
        noOfMachines = sc.nextInt();
        System.out.println("Enter The Number of Employees");
        noOfEmployees = sc.nextInt();
                                
        data.add(new Factory( name, location, estYear,noOfMachines, noOfEmployees));
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
    }

    // Displaying all Factory information
    public static void displayAll() {
        if (!data.isEmpty()) {
            for (int i = 0; i < data.size(); i++) 
            {
                System.out.println("------------------------------\n"+" Factory  Name : " + data.get(i).getName()  + "\n Location : " + data.get(i).getLocation() + "\n Year of Establishment : " + data.get(i).getEstYear() + "\n No of Machines : "+ data.get(i).getNoOfMachines() + "\n No of Employees : "+ data.get(i).getNoOfEmployees() + "\n----------------------------");
            }
        } 
        else 
        {
            System.out.println("This system has no Factory Details temporarily!\n");
    }
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
    }

   // Find According to the Year of Establishment information
    public static void FindByYear() {
        int i;
        if (!data.isEmpty()) {
            int j = 0;
            System.out.println("Please enter Year ");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            for (i = 0; i < data.size(); i++) {
                if (data.get(i).getEstYear() == year) {
                    j++;
                System.out.println("------------------------------\n"+" Factory  Name : " + data.get(i).getName()  + "\n Location : " + data.get(i).getLocation() + "\n Year of Establishment : " + data.get(i).getEstYear() + "\n No of Machines : "+ data.get(i).getNoOfMachines() + "\n No of Employees : "+ data.get(i).getNoOfEmployees() + "\n----------------------------");
                }
            }
            if (j == 0) {
                                 System.out.println("There is no Factory Details of this year!\n");
            }
        } 
        else {
                         System.out.println("This system has no Factory information temporarily!\n");
        }
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
 
    }
    
    // Remove Factory information according to name.
    public static void RemoveFactoryDetails() {
        if (!data.isEmpty()) {
            int j = 0;
            System.out.println("Please enter Factory Name ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getName().equalsIgnoreCase(name)) {
                    String oname = data.get(i).getName();
                    data.remove(i);
                                System.out.println(oname + " Details has been deleted successfully!");
                                System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
                                menu();
                    break;
                }
                j++;
            }
            if (j == 0) {
                                 System.out.println("This system has no such Factory information!\n");
            }
        } else {
                         System.out.println("This system has no Factory information temporarily!\n");
        }
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
    }

         // Update Factory information
    public static void UpdateDetails() {
        if (!data.isEmpty()) {
            int j = 0;
                         System.out.println("Please enter Factory Name : ");
            Scanner sc = new Scanner(System.in);
            String oname = sc.nextLine();
            for (int i = 0; i < data.size(); i++) {
                String oldname = data.get(i).getName();
                if ( oldname.equalsIgnoreCase(oname)) {
                    String name;
                    String location;
                    
                                         System.out.println("Please enter the modified Factory Name : ");
                    name = sc.nextLine();
                                         System.out.println("Please enter the modified Factory Location : ");
                    location = sc.nextLine();
                                         
                    data.set(i, new Factory(name, location, data.get(i).getEstYear() , data.get(i).getNoOfMachines(),data.get(i).getNoOfEmployees()));
                    j++;
                    System.out.println("Factory Details Updated Successfully!\n");
                    break;
                }
            }
            if (j == 0) {
                                 System.out.println("This system has no such Factory information!\n");
            }
        } else {
                         System.out.println("This system has no Factory information temporarily!\n");
        }
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
    }

    // Find According to the Name information
    public static void FindByName() {
        int i;
        if (!data.isEmpty()) {
            int j = 0;
            System.out.println("Please Enter Name ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            for (i = 0; i < data.size(); i++) {
                if (data.get(i).getName().equals(name)) {
                    j++;
                System.out.println("------------------------------\n"+" Factory  Name : " + data.get(i).getName()  + "\n Location : " + data.get(i).getLocation() + "\n Year of Establishment : " + data.get(i).getEstYear() + "\n No of Machines : "+ data.get(i).getNoOfMachines() + "\n No of Employees : "+ data.get(i).getNoOfEmployees() + "\n----------------------------");
                    break;
                }
            }
            if (j == 0) {
                                 System.out.println("There is no Factory Details of this year!\n");
            }
        } 
        else {
                         System.out.println("This system has no Factory information temporarily!\n");
        }
        System.out.println("Press Enter to Continue...................................");
        hold.nextLine();
        menu();
 
    }
}
