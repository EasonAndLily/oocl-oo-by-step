package practice06;

public class Teacher extends Person{
    private Integer klass;
    
    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }
    
    public Teacher(String name, int age) {
        super(name, age);
    }
    
    public Integer getKlass() {
        return klass;
    }
    
    public void setKlass(Integer klass) {
        this.klass = klass;
    }
    
    @Override
    public String introduce() {
        String introduceStr = super.introduce() + " I am a Teacher. I teach ";
        if (this.klass == null) {
            introduceStr += "No Class.";
        } else {
            introduceStr += "Class "+this.klass + ".";
        }
        return introduceStr;
    }
}
