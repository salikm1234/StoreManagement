import java.util.ArrayList;
import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 3 objects for each class
        // Rental Objects
        Rental rental1 = new Rental(2021, "Rental Model A", true);
        Rental rental2 = new Rental(2019, "Rental Model B", false);
        Rental rental3 = new Rental(2023, "Rental Model C", true);

        // Boat Objects
        Boat boat1 = new Boat(2018, "Boat Model A", true, true, "Square");
        Boat boat2 = new Boat(2020, "Boat Model B", true, false, "Triangular");
        Boat boat3 = new Boat(2016, "Boat Model C", false, true, "None");

        // Car Objects
        Car car1 = new Car(2022, "Tesla Model S", true, true, 5, "Tesla Motor");
        Car car2 = new Car(2018, "Toyota Corolla", true, false, 5, "4 cylinder");
        Car car3 = new Car(2020, "Ford Mustang", true, false, 4, "V8");

        // Bike Objects
        Bike bike1 = new Bike(2021, "Mountain Bike", true, 2, "Mountain");
        Bike bike2 = new Bike(2017, "Road Bike", true, 2, "Road");
        Bike bike3 = new Bike(2019, "Hybrid Bike", false, 3, "Hybrid");

        // Create lists for each type
        ArrayList<Rental> rentalList = new ArrayList<>();
        ArrayList<Boat> boatList = new ArrayList<>();
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Bike> bikeList = new ArrayList<>();

        // Add objects to the respective lists
        rentalList.add(rental1);
        rentalList.add(rental2);
        rentalList.add(rental3);

        boatList.add(boat1);
        boatList.add(boat2);
        boatList.add(boat3);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        bikeList.add(bike1);
        bikeList.add(bike2);
        bikeList.add(bike3);

        // User input flow starts here
        while (true) {
            System.out.println("Would you like to rent a Rental, Boat, Car, or Bike?");
            String choice = input.nextLine().toLowerCase();

            // Confirm user's choice
            switch (choice) {
                case "rental":
                    System.out.println("You chose Rental.");
                    handleRental(input, rentalList);
                    break;
                case "boat":
                    System.out.println("You chose Boat.");
                    handleBoat(input, boatList);
                    break;
                case "car":
                    System.out.println("You chose Car.");
                    handleCar(input, carList);
                    break;
                case "bike":
                    System.out.println("You chose Bike.");
                    handleBike(input, bikeList);
                    break;
                default:
                    System.out.println("Invalid choice. Please select Rental, Boat, Car, or Bike.");
                    continue;
            }
            System.out.println("Would you like to start over? (yes or no)");
            String restart = input.nextLine().toLowerCase();
            if (!restart.equals("yes")) {
                break;
            }
        }

        // Closes the Scanner object
        input.close();
    }

    // Handling methods for each type

    public static void handleRental(Scanner input, ArrayList<Rental> rentalList) {
        System.out.println("What is the earliest year you want?");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        boolean found = false;
        for (Rental rental : rentalList) {
            if (rental.getYear() >= year) {
                System.out.println(rental);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rentals found for the specified year.");
            return;
        }
    }

    public static void handleBoat(Scanner input, ArrayList<Boat> boatList) {
        System.out.println("What is the earliest year you want?");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        boolean found = false;
        for (Boat boat : boatList) {
            if (boat.getYear() >= year) {
                System.out.println(boat);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No boats found for the specified year.");
            return;
        }

        System.out.println("Do you want a boat with a motor? (yes or no)");
        String motorChoice = input.nextLine().toLowerCase();
        boolean motorPreference = motorChoice.equals("yes");

        found = false;
        for (Boat boat : boatList) {
            if (boat.getYear() >= year && boat.getHasMotor() == motorPreference) {
                System.out.println(boat);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No boats match your preferences.");
        }
    }

    public static void handleCar(Scanner input, ArrayList<Car> carList) {
        System.out.println("What is the earliest year you want?");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        boolean found = false;
        for (Car car : carList) {
            if (car.getYear() >= year) {
                System.out.println(car);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No cars found for the specified year.");
            return;
        }

        System.out.println("Do you want an electric car? (yes or no)");
        String electricChoice = input.nextLine().toLowerCase();
        boolean electricPreference = electricChoice.equals("yes");

        found = false;
        for (Car car : carList) {
            if (car.getYear() >= year && car.getIsElectric() == electricPreference) {
                System.out.println(car);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No cars match your preferences.");
        }
    }

    public static void handleBike(Scanner input, ArrayList<Bike> bikeList) {
        System.out.println("What is the earliest year you want?");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        boolean found = false;
        for (Bike bike : bikeList) {
            if (bike.getYear() >= year) {
                System.out.println(bike);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bikes found for the specified year.");
            return;
        }

        System.out.println("How many wheels do you want?");
        int wheelChoice = input.nextInt();
        input.nextLine(); // Consume newline

        found = false;
        for (Bike bike : bikeList) {
            if (bike.getYear() >= year && bike.getNumWheels() == wheelChoice) {
                System.out.println(bike);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bikes match your preferences.");
        }
    }
}
