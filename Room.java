package Hotel;
// Room class to represent a hotel room
public class Room {

	
	    private int id;
	    private String roomType;
	    private double price;
	    private boolean available;

	    public Room(int id, String roomType, double price) {
	        this.id = id;
	        this.roomType = roomType;
	        this.price = price;
	        this.available = true; // Rooms are available by default
	    }

	    // Getters and setters
	    public int getId() { return id; }
	    public String getRoomType() { return roomType; }
	    public double getPrice() { return price; }
	    public boolean isAvailable() { return available; }

	    public void bookRoom() { this.available = false; }
	    public void freeRoom() { this.available = true; }
}
