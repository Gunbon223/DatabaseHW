package techmaster.service;

import techmaster.entities.AccountBanking;
import techmaster.entities.Role;
import techmaster.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public void display(User user, ArrayList<AccountBanking> accountBankingList, ArrayList<Role> roleList) {
        System.out.println( "User{" +
                "id=" + user.getId() +
                ", name='" + user.getName() + '\'' +
                ", email='" + user.getEmail() + '\'' +
                ", phone='" + user.getPhone() + '\'' +
                ", roleId=" + findRoleById(user.getId(),roleList).getId() +
                ", bankId=" + findAccountBankingById(user.getBankId(),accountBankingList).getId()
        );
    }

    public void findOnlineUser(ArrayList<User> userList, ArrayList<AccountBanking> accountBankingList, ArrayList<Role> roleList) {
        int count = 0;
        for (User user : userList) {
            if (user.getRoleId() == 1) {
                count++;
                System.out.println("User online: ");
                display(user, accountBankingList, roleList);
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay user hoc online");
        }    }

    public AccountBanking findAccountBankingById(int id, ArrayList<AccountBanking> accountBankingList) {
        for (AccountBanking accountBanking : accountBankingList) {
            if (accountBanking.getId() == id) {
                return accountBanking;
            }
        }
        return null;
    }
    public Role findRoleById(int id, ArrayList<Role> roleList) {
        for (Role role : roleList) {
            if (role.getId() == id) {
                return role;
            }
        }
        return null;
    }
}
