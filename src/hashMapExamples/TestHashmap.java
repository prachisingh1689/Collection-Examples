package hashMapExamples;

import java.util.HashMap;

public class TestHashmap
{
  public TestHashmap()
  {}
  public static void main(String args[])
  {
    HashMap<HashMapOverrideHashcode, String> map = new HashMap<>();
    HashMapOverrideHashcode obj1 = new HashMapOverrideHashcode(1);
    HashMapOverrideHashcode obj2 = new HashMapOverrideHashcode(2);
    HashMapOverrideHashcode obj3 = new HashMapOverrideHashcode(3);
    map.put(obj1, "string1");
    System.out.println(obj1);
    map.put(obj2, "String2");
    System.out.println(obj2);
    map.put(obj3, "String3");
    System.out.println(obj3);
    System.out.println(map.size());
    obj2 = new HashMapOverrideHashcode(2);
    map.get(obj2);
    
  }
}
