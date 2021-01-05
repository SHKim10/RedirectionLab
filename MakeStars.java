import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    while(read.hasNextLine()){
      String line = read.nextLine();
      Scanner scanLine = new Scanner(line);
      while (scanLine.hasNext()){
        String stars = scanLine.next();
        for (int i = 0; i < stars.length(); i++){
          System.out.print("*");
        }
        if (scanLine.hasNext()) System.out.println(" ");
      }
      if (read.hasNextLine()) System.out.println();
    }
  }
}
