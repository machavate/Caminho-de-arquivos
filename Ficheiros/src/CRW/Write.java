package CRW;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
      public static void main(String[]args){
          try {
              FileWriter writer = new FileWriter("/home/islands/Documentos/Texto.txt");
              writer.write("Consegui escrever nesse arquivo");
              writer.close();
              System.out.println("linha escrita com sucesso");
          }catch (IOException e){
              e.getMessage();
          }

      }

}
