package day03;

/**
 * 学生类，提供学生学习和考试方法
 * @author  actstrady
 */
public class Student {
    private int stuId;
    private String name;
    private int age;
    // 班级
    private String cls;

    public Student(int stuId, String name, int age, String cls) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.cls = cls;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void study(String course) {
        System.out.println(name + "正在学习" + course);
    }

    public void exam(String course) {
        System.out.println(name + "正在考" + course + "的考试");
    }
}
