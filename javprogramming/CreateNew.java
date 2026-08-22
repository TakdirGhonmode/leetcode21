import java.io.File;
public class CreateNew {
  public static void main(String arg[]){
    File f=new File("basic.txt");
    try {
      if(f.createNewFile()){
        System.out.println("the file is created successfully");
     }
    } catch (Exception e) {
      System.out.print(e);
    }
  }
}
