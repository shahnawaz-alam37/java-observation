class Demo{
    void opr(){
        String s="hello";
        String t="world";
        String r = "  java  ";
        String i = "String operation methods";
        int n= 12345;
        char ch[] = i.toCharArray();
        System.out.println("tochararray method:");
        System.out.println(ch);
        System.out.println("charat method in string "+ s.charAt(0));
        System.out.println("compare of two string " + s.compareTo(t));
        System.out.println("concat of string is "+s.concat(t));
        System.out.println("trim method in string "+r.trim());
        System.out.println("valueOf method: "+String.valueOf(n));
        System.out.println("substring of string is "+s.substring(0,3));
        System.out.println("length of string hello "+s.length());
        String res[] = i.split(" ");
        System.out.println("Split method");
        for(String str:res){
            System.out.print(str+", ");
        }
    }
}
public class string_opr{
    public static void main(String []args){
        Demo ob = new Demo();
        ob.opr();
    }
}