import java.util.*;
import java.nio.Files;
import java.nio.Paths;
import java.nio.Path;

public class pipe{
  private Past path1, path2;
  public pipe(int pid_in, int pid_out){
    path1 = Paths.get("" + pid_in);
    path2 = Paths.get("" + pid_out);
  }
  public boolean hasNext(){
    boolean next = false;
    return next;
  }
  public String nextLine(){
    String input = new String(Files.readAllBytes(path1));
    return input;
  }
  public void writeOut(String output){

  }
}
