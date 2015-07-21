/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment.system.aviv.zikel;

/**
 *
 * @author daniel
 */
public class User {
    private String username;
    private String password;
    private String name;
    private String ID;
    public User(String username,String password,String name, String ID){
        this.username = username;
        this.password = password;
        this.name = name;
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }
    
}
