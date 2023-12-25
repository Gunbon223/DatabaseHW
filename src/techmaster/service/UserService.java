package techmaster.service;

import techmaster.entities.AccountBanking;
import techmaster.entities.Role;
import techmaster.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

    public void display(User user, Map<Integer,AccountBanking> accountBankingList, Map<Integer,Role> roleList) {
        System.out.println( "User{" +
                "id=" + user.getId() +
                ", name='" + user.getName() + '\'' +
                ", email='" + user.getEmail() + '\'' +
                ", phone='" + user.getPhone() + '\'' +
                ", roleId=" + findRoleById(user.getId(),roleList).getId() +
                ", bankId=" + findAccountBankingById(user.getBankId(),accountBankingList).getId()
        );
    }

    public void findOnlineUser(Map<Integer,User> userList,Map<Integer,AccountBanking> accountBankingList, Map<Integer,Role> roleList) {
        int count = 0;
        for (User user : userList.values()) {
            if (user.getRoleId() == 1) {
                display(user,accountBankingList,roleList);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay user hoc online");
        }    }

    public AccountBanking findAccountBankingById(int id, Map<Integer,AccountBanking> accountBankingList) {
            if (accountBankingList.containsKey(id) ) {
                return accountBankingList.get(id);
            }
        return null;
    }
    public Role findRoleById(int id, Map<Integer,Role> roleList) {
            if (roleList.containsKey(id)) {
                return roleList.get(id);
            }
        return null;
    }
}
