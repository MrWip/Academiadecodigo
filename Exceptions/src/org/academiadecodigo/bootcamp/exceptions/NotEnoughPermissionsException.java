package org.academiadecodigo.bootcamp.exceptions;

/**
 * Created by codecadet on 30/05/2018.
 */
public class NotEnoughPermissionsException extends FileExceptions {

    public NotEnoughPermissionsException(){
        super("You are not logged in");
    }
}
