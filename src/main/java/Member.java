public class Member {
    String name;
    int age;
    int jumpHeightLimit;
    boolean isFinishedCourse;

    public Member(String name, int age, int jumpHeightLimit) {
        this.name = name;
        this.age = age;
        this.jumpHeightLimit = jumpHeightLimit;
        this.isFinishedCourse = true;
    }

    public void info() {
        System.out.println(this.name + " " + this.age + " " + this.jumpHeightLimit);
    }

    public int getAge() {
        return age;
    }
}
