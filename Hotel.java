import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();

        rooms.add(new Room(101, "Single", 1500));
        rooms.add(new Room(102, "Single", 1500));
        rooms.add(new Room(103, "Double", 2500));
        rooms.add(new Room(104, "Double", 2500));
        rooms.add(new Room(105, "Deluxe", 4000));
        rooms.add(new Room(106, "Deluxe", 4000));
    }

    public void displayRooms() {
        System.out.println("\n========== ROOM LIST ==========");

        for (Room room : rooms) {
            room.displayRoom();
        }

        System.out.println("===============================");
    }

    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }

        return null;
    }

    public boolean bookRoom(int roomNumber, String name, String phone) {

        Room room = findRoom(roomNumber);

        if (room == null) {
            System.out.println("Room does not exist.");
            return false;
        }

        if (room.isBooked()) {
            System.out.println("Sorry! Room is already booked.");
            return false;
        }

        Customer customer = new Customer(name, phone);

        room.bookRoom();

        Reservation reservation =
                new Reservation(customer, room);

        reservations.add(reservation);

        System.out.println("\nRoom booked successfully!");

        reservation.displayReservation();

        return true;
    }

    public boolean cancelReservation(int roomNumber) {

        for (int i = 0; i < reservations.size(); i++) {

            Reservation reservation = reservations.get(i);

            if (reservation.getRoom().getRoomNumber() == roomNumber) {

                reservation.getRoom().cancelRoom();

                reservations.remove(i);

                System.out.println(
                    "Reservation cancelled successfully!"
                );

                return true;
            }
        }

        System.out.println("No reservation found for this room.");
        return false;
    }

    public void displayReservations() {

        if (reservations.isEmpty()) {
            System.out.println("\nNo reservations available.");
            return;
        }

        System.out.println("\n======= ALL RESERVATIONS =======");

        for (Reservation reservation : reservations) {
            reservation.displayReservation();
        }
    }
}
