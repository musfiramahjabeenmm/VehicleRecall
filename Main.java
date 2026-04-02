import Services.RecallService;
import Exception.DataNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecallService service = new RecallService();

        while (true) {

            System.out.println("\nCommands:");
            System.out.println("1. add manufacturer");
            System.out.println("2. add vehicle");
            System.out.println("3. add recall");
            System.out.println("4. recalls <manufacturerId>");
            System.out.println("5. exit");

            String input = sc.nextLine();

            try {

                if (input.equalsIgnoreCase("add manufacturer")) {

                    System.out.println("Enter: id name location contact");
                    String[] data = sc.nextLine().split(" ");

                    service.addManufacturer(
                            Integer.parseInt(data[0]),
                            data[1],
                            data[2],
                            data[3]
                    );

                    System.out.println("Manufacturer added.");
                }

                
                else if (input.equalsIgnoreCase("add vehicle")) {

                    System.out.println("Enter: id model year manufacturerId");
                    String[] data = sc.nextLine().split(" ");

                    service.addVehicle(
                            Integer.parseInt(data[0]),
                            data[1],
                            Integer.parseInt(data[2]),
                            Integer.parseInt(data[3])
                    );

                    System.out.println("Vehicle added.");
                }

            
                else if (input.equalsIgnoreCase("add recall")) {

                    System.out.println("Enter: id vehicleId component description risk remedy");
                    System.out.println("(Use _ instead of spaces)");

                    String[] data = sc.nextLine().split(" ");

                    service.addRecall(
                            Integer.parseInt(data[0]),
                            Integer.parseInt(data[1]),
                            data[2],
                            data[3],
                            data[4],
                            data[5]
                    );

                    System.out.println("Recall added.");
                }

                else if (input.startsWith("recalls")) {

                    String[] parts = input.split(" ");
                    int manufacturerId = Integer.parseInt(parts[1]);

                    service.getRecallsByManufacturer(manufacturerId);
                }

             
                else if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting...");
                    break;
                }

                else {
                    System.out.println("Invalid command.");
                }

            } catch (DataNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input format.");
            }
        }

        sc.close();
    }
}
