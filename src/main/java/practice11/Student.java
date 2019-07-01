package practice11;

public class Student extends Person{
    public Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
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
        if (this == this.klass.getLeader()) {
            return this.basicIntroduce() + " I am Leader of " + this.klass.getDisplayName() + ".";
        }
        return this.basicIntroduce() + " I am at " + this.klass.getDisplayName() + ".";
    }
    
    private String basicIntroduce() {
        return super.introduce() + " I am a Student.";
    }
}
