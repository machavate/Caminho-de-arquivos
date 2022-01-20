package CRW;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[]args){
        File myObj = new File("/home/islands/Documentos/Texto.txt");
        try {
            if(myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());
            }else{
                System.out.println("O ficheiro ja existe");
            }
        } catch (IOException e) {
            System.out.println("An error ocurred: " + e.getMessage());
        }
    }

}
