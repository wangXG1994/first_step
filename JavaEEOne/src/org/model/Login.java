package org.model;

public class Login {
    private Integer id;
    private String name;
    private String password;
    private boolean role;

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id) {
        this.id=id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setRole(boolean role){
        this.role=role;
    }
    public boolean getRole() {
        return role;
    }
}
