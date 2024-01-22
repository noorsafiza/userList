package my.utm.ip.userTable.model;

public class User {
    
    private int userId;
    private String username;
    private String password;
    private String email;
    private String name;
    private String contact;
    private String status;
    private String address;
    private String category;

    public User() {
        this.userId = 0;
        this.username = "";
        this.password = "";
        this.email = "";
        this.name = "";
        this.contact = "";
        this.status = "";
        this.address = "";
        this.category = "";

    }

    public User(int userId, String username, String password, String email,
                String name, String contact, String status, String address, String category) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.status = status;
        this.address = address;
        this.category = category;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}