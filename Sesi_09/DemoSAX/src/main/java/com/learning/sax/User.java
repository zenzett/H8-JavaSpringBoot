<<<<<<< HEAD
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.sax;
public class User {
    
    int id;
    private String Name;
    private String Gender;
    private String Role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User{").append("id=").append(id)
                .append(", Name=").append(Name)
                .append(", gender=").append(Gender)
                .append(", role=").append(Role).append("}");

        return builder.toString();
    }
}
=======
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.sax;
public class User {
    
    int id;
    private String Name;
    private String Gender;
    private String Role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User{").append("id=").append(id)
                .append(", Name=").append(Name)
                .append(", gender=").append(Gender)
                .append(", role=").append(Role).append("}");

        return builder.toString();
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
