package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> member = new ArrayList<>();
    private Teacher teacher;
    
    
    public Klass(int number) {
        this.number = number;
    }
    
    public Student getLeader() {
        return leader;
    }
    
    public void assignLeader(Student leader) {
        if (this.teacher != null) {
            teacher.sayLeader(leader, this);
        }
    
        if (leader.klass != this && this.teacher == null) {
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = leader;
        
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getDisplayName() {
        return "Class " + this.number;
    }
    
    public boolean appendMember(Student student) {
        if (this.teacher != null) {
            teacher.sayMessage(student, this);
        }
        return this.member.add(student);
    }
    
    public boolean isIn(Student student) {
        return student.klass == this;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
