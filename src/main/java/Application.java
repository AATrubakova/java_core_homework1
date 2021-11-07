public class Application {
    public static void main(String[] args) {

        Member members[] = {
                new Member("Ivan", 20, 197),
                new Member("Andrey", 38, 205),
                new Member("Jone", 33, 190),
                new Member("Sofia", 18, 220),
                new Member("Anna", 17, 225),
                new Member("Alex", 30, 200),
                new Member("Maria", 16, 202),
                new Member("Victor", 25, 210)
        };

        Team team1 = new Team("juniors");
        Team team2 = new Team("Older than twenty");

        for( Member member: members) {
            if (member.age <= 20) {
                team1.addToTeamMember(member);
            } else {
                team2.addToTeamMember(member);
            }
        }

        team1.printInfoAboutMemberTeam();
        team2.printInfoAboutMemberTeam();

        int[] sizeCourse = {190, 200, 220};
        Course course = new Course(sizeCourse);
        course.finishCourse(team1);
        course.finishCourse(team2);

        course.doIt(team1);
        course.doIt(team2);
        team1.printInfoAboutFinishedCourseTeam();
        team2.printInfoAboutFinishedCourseTeam();
    }
}
