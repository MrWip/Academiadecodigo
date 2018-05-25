package org.academiadecodigo.carcrash.cars;
import org.academiadecodigo.carcrash.Randomizer;
import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed;
    private Direction direction;
    private int speed;
    private int random;


    public Car(Position pos){
        crashed = false;
        this.pos = pos;
        direction = Randomizer.randomDirection(Direction.NEW);
        random =  (int) ( Math.random() * 10 + 1);
        speed = 1;

    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int number){
        speed = number;
    }

    public Position getPos() {
        return pos;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void move(){

        if(crashed == true){
            return;
        }
        if(random == 0){
            if(direction == Direction.UP || direction == Direction.DOWN){
                while(direction == Direction.UP || direction == Direction.DOWN){
                    direction = Randomizer.randomDirection(direction);
                }
            }else if(direction == Direction.LEFT || direction == Direction.RIGHT){
                while(direction == Direction.LEFT || direction == Direction.RIGHT){
                    direction = Randomizer.randomDirection(direction);
                }
            }
            random = (int) ( Math.random() * 10 + 1);
        }
        random--;
        switch(direction){
            case UP:
                if(pos.limit(Direction.UP) == false){
                    pos.moveUp();
                    break;
                }else{
                    direction = Randomizer.randomDirection(direction);
                    break;
                }
            case DOWN:
                if(pos.limit(Direction.DOWN) == false){
                    pos.moveDown();
                    break;
                }else{
                    direction = Randomizer.randomDirection(direction);
                    break;
                }
            case RIGHT:
                if(pos.limit(Direction.RIGHT) == false){
                    pos.moveRight();
                    break;
                }else{
                    direction = Randomizer.randomDirection(direction);
                    break;
                }
            case LEFT:
                if(pos.limit(Direction.LEFT) == false){
                    pos.moveLeft();
                    break;
                }else{
                    direction = Randomizer.randomDirection(direction);
                    break;
                }
        }
    }
}
