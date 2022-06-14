package homework8.oop;

public class Cat implements Jump, Run {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
//
//    @Override
//    public void wall(int distance) {
//            System.out.printf("%s прыгнул на %d метров через препятствие.\n", name, distance);
//    }

    @Override
    public void runningTrack(int distance) {
        System.out.printf("%s пробежал %d метров.\n", name, distance);
    }
}
