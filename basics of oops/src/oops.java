import java.util.Scanner;
import java.util.Map;
class oops {

    boolean find_common(String a[])
    {
        // making changes useing a hashmap 
        Map<String> hm = new HashMap<String>();
        
        for(int i=0;i<a.length;i++)
        {
           if(hm.containsKey(a[i])
              {
                  return true;
              }
              else
              {
                  hm.add(a[i],1);
              }
        }
        return false;
    }
}
class main{
    public static void main(String[] args) {

        oops obj = new oops();
        String data[] = new String[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the data in the Array");
        for(int i=0;i<data.length;i++)
        {
            data[i] = in.nextLine();
        }

        System.out.println("Result is : "+obj.find_common(data));
    }
}
