package User;

public class User {

    private String name;
    private String surename;
    private String email;
    private int idAdress;

    public User(String name, String surename, String email) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.idAdress = idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public int getIdAdress(){
        return idAdress;
    }
}
