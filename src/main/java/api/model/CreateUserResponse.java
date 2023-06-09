package api.model;

public class CreateUserResponse {
    //Variables Declaration
    private String userID;
    private String username;

    //Setters&Getters
    public String getUserID () {
        return userID;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }
    public String getUsername () {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    //Operations
}
