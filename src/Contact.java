public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Object getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, phone);
    }
}
