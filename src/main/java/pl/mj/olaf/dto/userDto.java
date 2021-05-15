package pl.mj.olaf.dto;

public class userDto {
    private String eMail;
    private String password;

    public userDto(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
