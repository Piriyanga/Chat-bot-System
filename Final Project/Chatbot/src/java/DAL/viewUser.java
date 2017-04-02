package DAL;

public class viewUser {
        
    private String UserName;
    private String Password;
    private String UserType;
    

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserType() {
        return UserType;
    }
    
}
