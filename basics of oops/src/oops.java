import java.util.Scanner;

class oops {

    boolean find_common(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;i<a.length;i++)
            {
                if(a[i] == a[j])
                {
                    return true;
                }
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