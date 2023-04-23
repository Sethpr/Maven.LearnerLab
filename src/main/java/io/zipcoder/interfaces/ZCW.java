package io.zipcoder.interfaces;

import java.util.Map;
import java.util.stream.Collectors;

public class ZCW {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double hours){
        teacher.lecture(students.asArray(), hours);
    }

    public void hostLecture(long id, double hours){
        instructors.findById(id).lecture(students.asArray(), hours);
    }

    public Map<Student, Double> getStudyMap(){
        return students.stream().collect(Collectors.toMap(p->p, p->p.getTotalStudyTime()));
    }

}
