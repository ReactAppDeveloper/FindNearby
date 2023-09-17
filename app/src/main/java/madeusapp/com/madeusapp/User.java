package madeusapp.com.madeusapp;

/**
 * Created by Harshita on 06/04/2016.
 */
public class User {
    private String name;
    private String icon;
    private String about;
    private String birthday;
    private String email;

    public User() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;

    }
}
