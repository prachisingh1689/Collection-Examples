package hashMapExamples;

public class HashMapOverrideHashcode
{
  private int num;
  public HashMapOverrideHashcode(int num)
  {this.num = num;}
  public int hashcode()
  {return 5;}
}

