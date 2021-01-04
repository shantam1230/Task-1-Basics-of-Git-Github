import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
class oops {

    boolean find_common(String a[])
    {
        // making changes using a hashmap
        Map<String,Integer> hm = new HashMap<String,Integer>();
        
        for(int i=0;i<a.length;i++)
        {
           if(hm.containsKey(a[i]))
              {
                  return true;
              }
              else
              {
                  hm.put(a[i],1);
              }
        }
        return false;
    }
}
class main_class{
    public static void main(String[] args) {

        oops obj = new oops();
        String[] data = new String[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the data in the Array");
        for(int i=0;i<data.length;i++)
        {
            data[i] = in.nextLine();
        }

        System.out.println("Result is : "+obj.find_common(data));
    }
}
