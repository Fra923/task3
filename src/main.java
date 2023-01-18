import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<String> array1;
        int k=0;

        if (args.length == 2) {
            array1 = new ArrayList<String>(Arrays.asList(args[0].replace("[","").replace("]","").split(",")));
            k=Integer.parseInt(args[1]);

            while (array1.size()>0) {
                String a=array1.remove(0);
                if(Collections.frequency(array1,a)==k-1){
                    System.out.println(a);
                    System.exit(0);
                }
            }
            System.out.println("No match was found");
        } else {
            System.out.println("ERROR|Wrong number of arguments, one array and one integer is required");
        }
    }
}