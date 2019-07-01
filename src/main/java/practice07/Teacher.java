package practice07;

public class Teacher extends Person {
    private Klass klass;
    
    public Teacher(String name, int age) {
        super(name, age);
    }
    
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    
    public Klass getKlass() {
        return klass;
    }
    
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    
    @Override
    public String introduce() {
        String introduceTeacherStr = this.klass == null ? "No Class." : (this.klass.getDisplayName() + ".");
        return introduceSelf() + " I teach " + introduceTeacherStr;
    }
    
    public String introduceWith(Student student) {
        String introduceWithStr = this.klass == student.getKlass() ? (" I teach " + student.getName() + ".") : (" I don't teach " + student.getName() + ".");
        return introduceSelf() + introduceWithStr;
    }
    
    private String introduceSelf() {
        return super.introduce() + " I am a Teacher.";
    }
}
