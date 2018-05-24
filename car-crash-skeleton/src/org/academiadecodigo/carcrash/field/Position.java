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
    public boolean limit(int direction){

        switch(direction){
            case 1:
               if(row == 0){ return true;}
               return false;
            case 2:
                if(row == Field.height-1){return true;}
                    return false;
            case 3:
                if(col == Field.width-1){return true;}
                    return false;
            case 4:
                if(col == 0){return true;}
                    return false;
        }
        return false;
    }
}
