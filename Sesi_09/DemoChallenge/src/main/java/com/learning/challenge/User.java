<<<<<<< HEAD
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.challenge;

public class User {
    
    int id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("[").append(id).append(":")
                .append(firstName).append(":")
                .append(lastName).append("]");

        return builder.toString();
    }
}
=======
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.challenge;

public class User {
    
    int id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("[").append(id).append(":")
                .append(firstName).append(":")
                .append(lastName).append("]");

        return builder.toString();
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
