package Hotel;
import java.time.LocalDate;
// Booking class to represent a room booking
	public class Booking {
	    private User user;
	    private Room room;
	    private LocalDate checkIn;
	    private LocalDate checkOut;

	    public Booking(User user, Room room, LocalDate checkIn, LocalDate checkOut) {
	        this.user = user;
	        this.room = room;
	        this.checkIn = checkIn;
	        this.checkOut = checkOut;
	    }

	    // Getters
	    public User getUser() { return user; }
	    public Room getRoom() { return room; }
	    public LocalDate getCheckIn() { return checkIn; }
	    public LocalDate getCheckOut() { return checkOut; }
	}

