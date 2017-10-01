/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * The object representation for user table.
 * @author prostaver
 */
public class User {
    Integer id;
    String userName;
    String password;

    //Getter and Setter methods for user object.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Method that shows a string value of all attributes of the user object.
    @Override
    public String toString() {
        StringBuilder string;
        string = new StringBuilder("User [id=").append(id)
                .append(", userName=").append(userName)
                .append(", password").append(password);
        return string.toString();
    }

    
}
