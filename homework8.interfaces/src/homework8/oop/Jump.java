package homework8.oop;

public interface Jump {
    String getName();

   default void wall(int distance){
           System.out.printf("%s прыгнул на %d метров через препятствие.\n", getName(), distance);
   }

}
