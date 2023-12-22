package techmaster.service;

import techmaster.entities.TransitionHistory;
import techmaster.entities.User;

import java.util.ArrayList;
import java.util.Map;

public class TransistionService {
    public void displayHistoryTransistion(Map<Integer,User> user, Map<Integer,TransitionHistory> transitionHistories) {
        for (User i : user.values()) {
                if (transitionHistories.containsKey(i.getId())) {
                    System.out.println("User: " + i.getName() +"Co lich su giao dich: ");
                    System.out.println(transitionHistories.get(i.getId()).toString());
                }
            }
        }
    }

