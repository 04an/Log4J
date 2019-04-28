package Servise;


import User.Adress;
import User.User;

public class UserService {

    private DataBase <Adress> adressDatabase = new Database<>();
    private Database<User> userDatabase = new Database<>();

    public void create(User user, Adress adress) {

        Adress tomAdress = new Adress("Poland", "Szczecin", "Columba");
        int idTomAdress = adressDatabase.add(tomAdress);
        user.setIdAdress(idTomAdress);
        userDatabase.add(user);
    }

    public void removeUserById(int id) {
        User user = userDatabase.getById(id);


        userDatabase.remove(id);
        adressDatabase.remove(user.getIdAdress());
    }
}
