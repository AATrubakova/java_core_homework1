public class Team {
    String name;
    Member[] members;

    public Team(String name) {
        this.name = name;
        this.members = new Member[0];
    }

    public void printInfoAboutMemberTeam() {
        System.out.println("Состав команды " + this.name + " :");
        for(Member member: this.members) {
            member.info();
        }
    }
    public void addToTeamMember(Member member){
        // создаем команду на 1 больше чем предыдущая
        Member[] tmpMembers = new Member[this.members.length + 1];
        // копируем участников из старой команды в новую
        for(int i=0; i < this.members.length; i ++) {
            tmpMembers[i] = this.members[i];
        }
        // в конец добавляем нового участника
        tmpMembers[tmpMembers.length-1] = member;
        // tmpMembers становится текущей командой
        this.members = tmpMembers;
      }

    public void printInfoAboutFinishedCourseTeam() {
        System.out.println("Из команды " + this.name + " прошли полосу препятствий:");
        for(Member member: this.members) {
            if (member.isFinishedCourse == true) {
                member.info();
            }

        }
    }
}
