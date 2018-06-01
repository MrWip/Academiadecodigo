package org.academiadecodigo.bootcamp.exceptions;

/**
 * Created by codecadet on 30/05/2018.
 */
public class NotEnoughSpaceException extends FileExceptions {

    public NotEnoughSpaceException(){
        super("You dont have enough space for that file");
    }

}
