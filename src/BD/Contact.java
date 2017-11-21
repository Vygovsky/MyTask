package BD;

public class Contact {
    private Long id;
    private String name;
    private String lastName;
    private int phone;
    private String mail;

    public Contact() {
    }

    public Contact(Long id, String name, String lastName, int phone, String mail) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
    }

    public Contact(String name, String lastName, int phone, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", mail='" + mail + '\'' +
                '}';
    }
}
