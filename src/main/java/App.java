import Servise.UserService;
import User.Adress;
import User.User;

public class App {
//    private static final Logger log = Logger.getLogger(App.class.getName());


    public static void main(String[] args) {
//        Database<String> stringDb = new Database<>();
//        stringDb.add("hello");
//        int id =stringDb.add("babajka");
//        System.out.println(stringDb.getById(id));
//
//
//        Database<LocalDate> dateDb = new Database<>();
//
//        dateDb.add(LocalDate.now());
//        int dateId= dateDb.add(LocalDate.parse("1991-10-15"));
//        System.out.println(dateDb.getById(dateId));

//        Database<Adress> adressDatabase = new Database<>();
//        Database<User> userDatabase = new Database<>();
//
//        Adress tomAdress= new Adress("Poland","Szczecin","Columba");
//         int idTomAdress =adressDatabase.add(tomAdress);
//
//         User user = new User("Tom","Kowalski","TK@g.dim", idTomAdress);
//         userDatabase.add(user);

        UserService userService = new UserService();
        Adress tomAdress= new Adress("Poland","Szczecin","Columba");
        User tom = new User("Tom", "Kowalski", "TK@g.dim");
        userService.create(tom,tomAdress);

    }
}
