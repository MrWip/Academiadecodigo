package org.academiadecodigo.bootcamp.gfx.simplegfx;

import com.sun.org.apache.regexp.internal.RE;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    private int cols;
    private int rows;
    private int cellsize;
    Rectangle rectangle;

    public static final int PADDING = 10;

    public SimpleGfxGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        cellsize = 10;


        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        rectangle = new Rectangle(PADDING,PADDING,columnToX(cols),rowToY(rows));
        rectangle.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
       return cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
       return rows;
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
       return rectangle.getX();
    }

    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
       return rectangle.getY();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
       return rectangle.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
       return rectangle.getY();
    }



    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize() {
       return cellsize;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
       SimpleGfxGridPosition newgrid = new SimpleGfxGridPosition(this);
       return newgrid;
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {

        SimpleGfxGridPosition newgrid = new SimpleGfxGridPosition(col, row, this);
        return newgrid;
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return row * cellsize;
    }



    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column*cellsize;
    }
}
