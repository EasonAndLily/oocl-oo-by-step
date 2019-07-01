package practice11;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    LinkedList<Klass> linkedKlassList;
    
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    
    public Teacher(int id, String name, int age, LinkedList<Klass> linkedKlassList) {
        super(id, name, age);
        this.linkedKlassList = linkedKlassList;
        linkedKlassList.forEach(klass -> klass.setTeacher(this));
    }
    
    
    @Override
    public String introduce() {
        if (this.linkedKlassList == null || this.linkedKlassList.size() == 0) {
            return introduceSelf() + " I teach No Class.";
        }
        
        String klassNumbes = this.linkedKlassList.stream().map(item -> item.getNumber()).map(String::valueOf).collect(Collectors.joining(", "));
        return introduceSelf() + " I teach Class " + klassNumbes + ".";
    }
    
    public String introduceWith(Student student) {
        String introduceWithStr = this.linkedKlassList.stream().filter(klass -> klass == student.getKlass()).count() > 0 ? (" I teach " + student.getName() + ".") : (" I don't teach " + student.getName() + ".");
        return introduceSelf() + introduceWithStr;
    }
    
    private String introduceSelf() {
        return super.introduce() + " I am a Teacher.";
    }
    
    public LinkedList<Klass> getClasses() {
        return this.linkedKlassList;
    }
    
    public boolean isTeaching(Student student) {
        return this.linkedKlassList.stream().filter(klass -> klass.isIn(student)).count() > 0;
    }
    
    public void sayMessage(Student student, Klass klass) {
        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + klass.getNumber() + ".");
    }
    
    public void sayLeader(Student leader, Klass klass) {
        System.out.println("I am " + this.getName() + ". I know " + leader.getName() + " become Leader of Class " + klass.getNumber() + ".");
    }
}
