package techmaster;

import techmaster.entities.*;
import techmaster.service.CourseService;
import techmaster.service.UserService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new HashMap<>() ;
        Map<Integer, TransitionHistory> transitionHistoryMap = new HashMap<>();
        Map<Integer, AccountBanking> accountBankingMap = new HashMap<>();
        Map<Integer, Role> roleMap = new HashMap<>();
        Map<Integer, OpenningScheduel> openningScheduelMap = new HashMap<>();
        Map<Integer, Course> courseMap = new HashMap<>();
        Map<Integer, UserDetailCourse> userDetailCourseMap = new HashMap<>();
        addUser(userMap);
        addOpen(openningScheduelMap);
        addRole(roleMap);
        addAccountBanking(accountBankingMap);
        UserService service = new UserService();
        for (int i = 1; i <= userMap.size(); i++) {
            service.display(userMap.get(1),accountBankingMap,roleMap);
        }
        CourseService courseService = new CourseService();
        courseService.displayCourseStartDay(courseMap,userDetailCourseMap);
    }

    public static void addUser(Map<Integer, User> user){
        User user1 = new User("Nguyen Van A","gmail","0123456789",1,1);
        User user2 = new User("Nguyen Van B","email","0123456789",0,0);
        user.put(user1.getId(), user1);
        user.put(user2.getId(), user2);
    }
    public static void addOpen(Map<Integer, OpenningScheduel> openningScheduelMap){
        OpenningScheduel openningScheduel = new OpenningScheduel(LocalDate.now(),"Ha Noi","2 4 6","18h");
        OpenningScheduel openningScheduel2 = new OpenningScheduel(LocalDate.now(),"Da Nang","3 5 7","18h30");
        openningScheduelMap.put(openningScheduel.getId(),openningScheduel);
        openningScheduelMap.put(openningScheduel2.getId(),openningScheduel2);
    }
    public static void addRole(Map<Integer, Role> roleMap){
        Role role1 = new Role(0, "hoc vien");
        Role role2 = new Role(1, "giang vien");
        roleMap.put(role1.getId(),role1);
        roleMap.put(role2.getId(),role2);
    }
    public static void addAccountBanking(Map<Integer, AccountBanking> accountBankingMap){
        AccountBanking accountBanking1 = new AccountBanking("1123", "Nguyen Van A" );
        AccountBanking accountBanking2 = new AccountBanking("1249142", "Nguyen Van B" );
        accountBankingMap.put(accountBanking1.getId(),accountBanking1);
        accountBankingMap.put(accountBanking2.getId(),accountBanking2);
    }
}

