package homework8.oop;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Kitty Mickey");
        Human human =  new Human("Human John");
        Robot robot = new Robot("Robot Siri");

        Object[] participants = new Object[3];
        participants[0] = cat;
        participants[1] = human;
        participants[2] = robot;

        for (Object participant: participants) {
            if(participant instanceof Jump){
                ((Jump)participant).wall(5);
            }
            if (participant instanceof Run){
                ((Run)participant).runningTrack(12);
            }
        }
    }
}
