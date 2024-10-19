package Hotel;
//User class to represent a user in the hotel reservation system
public class User {
	
	
	    private String username;
	    private String password; // In a real application, store hashed passwords
	    private String email;

	    public User(String username, String password, String email) {
	        this.username = username;
	        this.password = password;
	        this.email = email;
	    }

	    // Getters and setters
	    public String getUsername() { return username; }
	    public String getPassword() { return password; }
	    public String getEmail() { return email; }
	}

