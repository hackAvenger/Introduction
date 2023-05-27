package Map;

import java.util.ArrayList;
import java.util.List;

public class Map {

  public static  void main(String[] arg){

    List<String> list=new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.forEach(System.out::println);
  }
}
