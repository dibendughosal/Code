import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class UserAuthenticationSystem {
  private String username;
  private String hashedPassword;

  public User(String username, String password) {
    this.username = username;
    this.hashedPassword = hashPassword(password);
  }

  private String hashPassword(String password) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hashBytes = digest.digest(password.getBytes());
      StringBuilder hexString = new StringBuilder();
      for (byte b : hashBytes) {
        String hex = Integer.toHexString(0xff & b);
        if (hex.length() == 1)
          hexString.append('0');
        hexString.append(hex);
      }
      return hexString.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return null;
    }
  }

  public String getUsername() {
    return username;
  }

  public boolean verifyPassword(String password) {
    String hashedInput = hashPassword(password);
    return hashedInput != null && hashedInput.equals(hashedPassword);
  }
}

class AuthenticationService {
  private Map<String, User> users;

  public AuthenticationService() {
    this.users = new HashMap<>();
  }

  public void registerUser(String username, String password) {
    if (!users.containsKey(username)) {
      users.put(username, new User(username, password));
      System.out.println("User registered successfully.");
    } else {
      System.out.println("Username already exists.");
    }
  }

  public boolean authenticateUser(String username, String password) {
    User user = users.get(username);
    return user != null && user.verifyPassword(password);
  }
}

public class UserAuthenticationSystem {
  public static void main(String[] args) {

    AuthenticationService authService = new AuthenticationService();

    authService.registerUser("user1", "password123");
    authService.registerUser("user2", "securePassword");

    System.out.println("User1 authentication result: " + authService.authenticateUser("user1", "password123"));
    System.out.println("User2 authentication result: " + authService.authenticateUser("user2", "wrongPassword"));
  }
}