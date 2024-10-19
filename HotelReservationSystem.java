package Hotel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class for the hotel reservation system
public class HotelReservationSystem {
    private List<User> users = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public HotelReservationSystem() {
        // Adding some sample rooms
        rooms.add(new Room(1, "Single", 100));
        rooms.add(new Room(2, "Double", 150));
        rooms.add(new Room(3, "Suite", 250));
    }

    // Method to register a new user
    public void registerUser(String username, String password, String email) {
        users.add(new User(username, password, email));
        System.out.println("User registered successfully!");
    }

    // Method to search for available rooms
    public void searchAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room ID: " + room.getId() + ", Type: " + room.getRoomType() + ", Price: $" + room.getPrice());
            }
        }
    }

    // Method to make a booking
    public void bookRoom(User user, int roomId, LocalDate checkIn, LocalDate checkOut) {
        for (Room room : rooms) {
            if (room.getId() == roomId && room.isAvailable()) {
                room.bookRoom(); // Mark room as booked
                bookings.add(new Booking(user, room, checkIn, checkOut));
                System.out.println("Booking successful for " + user.getUsername() + "!");
                return;
            }
        }
        System.out.println("Room not available for booking.");
    }

    public static void main(String[] args) {
        HotelReservationSystem system = new HotelReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Sample user registration
        System.out.print("Register username: ");
        String username = scanner.nextLine();
        System.out.print("Register password: ");
        String password = scanner.nextLine();
        System.out.print("Register email: ");
        String email = scanner.nextLine();
        system.registerUser(username, password, email);

        // Search available rooms
        system.searchAvailableRooms();

        // Book a room
        System.out.print("Enter Room ID to book: ");
        int roomId = scanner.nextInt();
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInStr = scanner.next();
        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutStr = scanner.next();
        
        LocalDate checkIn = LocalDate.parse(checkInStr);
        LocalDate checkOut = LocalDate.parse(checkOutStr);
        system.bookRoom(system.users.get(0), roomId, checkIn, checkOut); // Using the first registered user

        scanner.close();
    }
}