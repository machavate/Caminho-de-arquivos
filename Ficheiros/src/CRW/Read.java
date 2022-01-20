package CRW;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[]args){
        try{
             File myObj = new File("/home/islands/Documentos/Texto.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
             }
             myReader.close();
        }catch (FileNotFoundException e){
            e.getMessage();
        }
    }
}
