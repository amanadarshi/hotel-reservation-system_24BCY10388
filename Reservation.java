public class Reservation {
    private Customer customer;
    private Room room;

    public Reservation(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public void displayReservation() {
        System.out.println("\n========== RESERVATION DETAILS ==========");
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Phone Number  : " + customer.getPhone());
        System.out.println("Room Number   : " + room.getRoomNumber());
        System.out.println("Room Type     : " + room.getRoomType());
        System.out.println("Room Price    : Rs." + room.getPrice());
        System.out.println("Status        : Confirmed");
        System.out.println("=========================================");
    }
}
