package techmaster;

import techmaster.entities.*;
import techmaster.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, User> user = new HashMap<>() ;
        Map<Integer, TransitionHistory> transitionHistoryMap = new HashMap<>();
        Map<Integer, AccountBanking> accountBankingMap = new HashMap<>();
        Map<Integer, Role> roleMap = new HashMap<>();


        User user1 = new User("Nguyen Van A","gmail","0123456789",1,1);
        User user2 = new User("Nguyen Van B","email","0123456789",2,2);

        OpenningScheduel openningScheduel = new OpenningScheduel();
        addUser(user,user1);
        UserService service = new UserService();
        service.display(user1,accountBankingMap,roleMap);
    }

    public static void addUser(Map<Integer, User> user, User user1){
        user.put(user1.getId(), user1);
    }
}
}
