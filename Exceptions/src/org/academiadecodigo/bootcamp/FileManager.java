package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughSpaceException;

/**
 * Created by codecadet on 30/05/2018.
 */
public class FileManager {

    private File[] newfiles;
    private int fileIndex;
    private int code;
    private boolean logged;

    public FileManager(){
        newfiles = new File[3];
        logged = false;
        fileIndex = 0;
    }


    public void createFile(String name) throws NotEnoughPermissionsException, NotEnoughSpaceException {

        if(logged==false){
            throw new NotEnoughPermissionsException();
        }else if(fileIndex >= newfiles.length){
            throw new NotEnoughSpaceException();
        }
        for (int i = 0; i <= fileIndex; i++) {
            newfiles[fileIndex] = new File(name);
        }
        fileIndex++;
    }

    public File getFile(String name) throws NotEnoughPermissionsException, FileNotFoundException{
        if(logged == false){
            throw new NotEnoughPermissionsException();
        }else{
            for(int i = 0; i<fileIndex;i++){
                if(newfiles[i].getName().equals(name)){
                    return newfiles[i];
                }
            }
            throw new FileNotFoundException();
        }
    }

    public void login(){
            logged = true;
            System.out.println("loggedin");
    }

    public void logout(){

             logged = false;
             System.out.println("logged out");
    }
}
