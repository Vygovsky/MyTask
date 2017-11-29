package Collection;

/**
 * Created by Roman_v on 11/29/2017.
 */
public class WebSiteUser {
    private String mail;
    private String name;
    private String lastName;
    private String phone;

    public WebSiteUser(String mail, String name, String lastName, String phone) {
        this.mail = mail;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
