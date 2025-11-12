
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    List<Customer> customers;

    public Main() {



        customers = new ArrayList<>();


        customers.add(new Customer("Thorkild Hansen", "81212183", "ThorkildHansen@gmail.com"));
        customers.add(new Customer("Frank Jensen" , "12345678", "FrankJensen@gmail.com"));
        customers.add(new Customer("Hans Christian", "87654321", "Hans-Christian@gmail.com"));
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.customers);
        writeCustomersToCSV(main.customers, "customers.cvs"); 
                                                              
    }
    public static void
    writeCustomersToCSV(List<Customer> customers, String filePath){
try(FileWriter writer = new FileWriter(filePath)) {
    writer.append("Name,Phone,Email" + "\n");
    for (Customer c : customers) {
        writer.append(c.getName()).append(",");
        writer.append(c.getPhone()).append(",");
        writer.append(c.getEmail()).append("\n");

    }
        writer.close(); 
    System.out.println("CVS fil skrevet til " + filePath);
}catch(IOException e){
    e.printStackTrace();
    }


    }
}
