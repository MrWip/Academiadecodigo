package org.academiadecodigo.carcrash.field;
import org.academiadecodigo.carcrash.cars.Car;

public class Position {

    private int col;
    private int row;

    public Position(){
        col = (int)(Math.random() * Field.width-2) + 1;
        row = (int)(Math.random() * Field.height-2) + 1;
    }

    //GETTERS SETTERS
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    //MOVE
    public void moveUp(){
        row--;
    }
    public void moveDown(){
        row++;
    }
    public void moveRight(){
        col++;
    }
    public void moveLeft(){
        col--;
    }

    //CHECK LIMITS
    public boolean limit(Direction direction){

        switch(direction){
            case UP:
               if(row == 0){ return true;}
               return false;
            case DOWN:
                if(row == Field.height-1){return true;}
                    return false;
            case RIGHT:
                if(col == Field.width-1){return true;}
                    return false;
            case LEFT:
                if(col == 0){return true;}
                    return false;
        }
        return false;
    }
}
