package web.model;

public class User {
    private String Username;

    public User(String username, String currenFirstName, String currentLastName, String currentMiddleName) {
        Username = username;
        CurrenFirstName = currenFirstName;
        CurrentLastName = currentLastName;
        CurrentMiddleName = currentMiddleName;
    }

    private String CurrenFirstName;
    private String CurrentLastName;
    private String CurrentMiddleName;
    private String ExternalUserId;
    private String UserId;

    public User() {
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getCurrenFirstName() {
        return CurrenFirstName;
    }

    public void setCurrenFirstName(String currenFirstName) {
        CurrenFirstName = currenFirstName;
    }

    public String getCurrentLastName() {
        return CurrentLastName;
    }

    public void setCurrentLastName(String currentLastName) {
        CurrentLastName = currentLastName;
    }

    public String getExternalUserId() {
        return ExternalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        ExternalUserId = externalUserId;
    }

    public String getCurrentMiddleName() {
        return CurrentMiddleName;
    }

    public void setCurrentMiddleName(String currentMiddleName) {
        CurrentMiddleName = currentMiddleName;
    }



}
