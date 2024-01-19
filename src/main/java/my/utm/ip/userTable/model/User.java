package my.utm.ip.userTable.model;

public class User {

    //DTO
    
    private int userId;
    private String username;
    private String password;
    private String role;
    private String email;
    private String idCard;
    private String name;
    private String contact;
    private String status;
    private String address;
    private String category;

    public User() {
        this.userId = 0;
        this.username = "";
        this.password = "";
        this.role = "";
        this.email = "";
        this.idCard = "";
        this.name = "";
        this.contact = "";
        this.status = "";
        this.address = "";
        this.category = "";

    }

    public User(int userId, String username, String password, String role, String email, String idCard,
                String name, String contact, String status, String address, String category) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.idCard = idCard;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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