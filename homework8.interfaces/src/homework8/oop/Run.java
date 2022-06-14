package homework8.oop;

public interface Run {
    String getName();

    default void runningTrack(int distance){
        System.out.printf("%s пробежал %d метров.\n", getName(), distance);

    }

}
