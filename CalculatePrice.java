
import java.util.*;

class CalculatePrice{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    while(true){
      int tyreCost = sc.nextInt();
      int numberOfTyres = sc.nextInt();
      double ans = 0.0;
      ans = tyreCost / numberOfTyres * 1.0;
      ans = ans * 100.0 / 128.0;
      ans = ans - 937.5;
      ans-= 390.63;
      System.out.println(ans);
    }
  }


}
