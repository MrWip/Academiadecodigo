package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughSpaceException;

/**
 * Created by codecadet on 30/05/2018.
 */
public class Main {

    public static void main(String[] args) {

        FileManager filemanager = new FileManager();

        try{
            filemanager.createFile("ze");
            filemanager.createFile("antonio");
            filemanager.createFile("zezito");
            filemanager.createFile("fonseca");

        } catch(NotEnoughPermissionsException ex){
            System.out.println(ex.getMessage());
        }catch (NotEnoughSpaceException ex){
            System.out.println(ex.getMessage());
        }




    }
}
