package techmaster.service;

import techmaster.entities.Course;
import techmaster.entities.OpenningScheduel;
import techmaster.entities.UserDetailCourse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class CourseService {
    public void displayCourseStartDay(Map<Integer,Course> course, Map<Integer,UserDetailCourse> usd) {
        for (Course i : course.values()) {
            if (usd.containsKey(i.getId())) {
                System.out.println("Khoa hoc: " + i.getName() +"Co lich hoc: ");
                System.out.println(usd.get(i.getId()).toString());
            }
        }
    }



}
