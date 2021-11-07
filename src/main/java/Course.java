public class Course {
    int[] obstacles;

    public Course(int[] obstacles) {
        this.obstacles = obstacles;
    }

    public void finishCourse(Team team) {
        for(Member member: team.members) {
            for(int obstacle: this.obstacles) {
                if (member.jumpHeightLimit >= obstacle) {
                    System.out.println("Участник " + member.name + " команды " + team.name + " преодолел высоту " + obstacle);
                }
            }
        }
    }

    public  void doIt(Team team) {
        for(Member member: team.members) {
            member.isFinishedCourse = true;
            for(int obstacle: this.obstacles) {
                if (member.jumpHeightLimit < obstacle) {
                    member.isFinishedCourse = false;
                }
            }
        }
    }
}
