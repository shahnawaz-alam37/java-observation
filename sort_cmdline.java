// import java.util.Arrays;

// public class sort_cmdline {
//     public static void main(String[] args) {
//         Arrays.sort(args);
//         for (int i = 0; i < args.length; i++) {
//             System.out.println(args[i]);
//         }

//     }
// }
class Demo
{
  void sort (int args[])
  {
    for (int i = 0; i < args.length; i++){
	    for (int j = 0; j < args.length -i-1; j++){
	        if(args[j] > args[j+1]){
	            int temp = args[j];
	            args[j] = args[j+1];
	            args[j+1] = temp;
	            }
	    }
    }
  }
}
public class sort_cmdline
{
  public static void main (String[]args)
  {
    int a[] = new int[args.length];
    for (int i = 0; i < args.length; i++){
	    a[i] = Integer.parseInt (args[i]);
    }
    Demo ob = new Demo ();
    ob.sort (a);
    for (int i = 0; i < args.length; i++){
	    System.out.println (a[i]);
    }
  }
}
