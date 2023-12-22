package techmaster.service;

import techmaster.entities.Course;
import techmaster.entities.OpenningScheduel;
import techmaster.entities.UserDetailCourse;

import java.time.LocalDate;
import java.util.ArrayList;

public class CourseService {
    public void displayCourseStartDay(ArrayList<Course> course ) {
        for (Course i : course) {
            System.out.println(i.toString());
        }
    }

    public void displayCourseStartDay(ArrayList<Course> course, ArrayList<UserDetailCourse> usd, ArrayList<OpenningScheduel> os) {
        for (Course i : course) {
            for(UserDetailCourse j : usd){
                for(OpenningScheduel k : os){
                    if(i.getId() == j.getCourseId() && j.getOpenningScheduelId() == k.getId()){
                        System.out.println(i.toString());
                    }
                }
            }
        }
    }


}
