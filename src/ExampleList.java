public class ExampleList {
    private  String name = null;
    private  String surname = null;

    private boolean status = false;


    public ExampleList(String name, String surname, boolean status) {
        this.name = name;
        this.surname = surname;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isStatus() {
        return status;
    }
}
