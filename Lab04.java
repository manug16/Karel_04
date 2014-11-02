/**
*
* Get the team and the coach positioned on the pitch. // provide a brief description
*
* @author <Manu Gualandri>  // replace <...> with your name
* @version <2/10/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {
   
     public static void takeTheField(Athlete arg)
     {
         arg.move();
         arg.move();
         arg.move();
         arg.move();
         arg.turnRight();
         arg.move();
         arg.move();
     }
     public static void main(String[] args) {
     Display.openWorld("maps/arena.map");
     Display.setSize(10, 10);
     Display.setSpeed(8);
     Athlete manu = new Athlete();
     Athlete eddie = new Athlete();
     Athlete rob = new Athlete();
     Athlete carlo = new Athlete();
     Athlete shamrock = new Athlete();
     Athlete viola = new Athlete();
     Athlete coach = new Athlete (2, 7, Display.EAST, 0); // you could also position all the players using this kind of constructor.
     takeTheField(manu);
     takeTheField(eddie);
     takeTheField(rob);
     takeTheField(carlo);
     takeTheField(shamrock);
     takeTheField(viola);
     manu.move();
     manu.move();
     manu.move();
     manu.turnRight();
     eddie.move();
     eddie.move();
     eddie.move();
     eddie.turnLeft();
     eddie.move();
     eddie.move();
     eddie.turnAround();
     rob.move();
     rob.turnLeft();
     rob.move();
     rob.turnAround();
     shamrock.move();
     shamrock.move();
     shamrock.turnRight();
     viola.move();
     viola.move();
     viola.move();
     viola.move();
     viola.turnRight();
     carlo.move();
     carlo.move();
     carlo.move();
     carlo.move();
     carlo.move();
     carlo.turnLeft();
     carlo.move();
     carlo.turnAround(); 
     }
}
