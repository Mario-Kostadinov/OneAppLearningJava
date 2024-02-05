package one.app.usersVanilla;

public class userModelVanilla {
    private String firstName;
    private String role;
    private Integer id;

    public userModelVanilla() {};

    public userModelVanilla(String firstName, String role) {
        this.firstName = firstName;
        this.role = role;
        this.id = 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
