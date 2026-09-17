import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        System.out.println("======================================");
        System.out.println("       HOTEL RESERVATION SYSTEM");
        System.out.println("======================================");

        do {

            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. View Reservations");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Exit");
            System.out.println("---------------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:
                    hotel.displayRooms();
                    break;

                case 2:

                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    hotel.displayRooms();

                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();

                    hotel.bookRoom(
                        roomNumber,
                        name,
                        phone
                    );

                    break;

                case 3:
                    hotel.displayReservations();
                    break;

                case 4:

                    System.out.print(
                        "Enter room number to cancel: "
                    );

                    int cancelRoom = sc.nextInt();

                    hotel.cancelReservation(cancelRoom);

                    break;

                case 5:

                    System.out.println(
                        "\nThank you for using the Hotel Reservation System!"
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}
