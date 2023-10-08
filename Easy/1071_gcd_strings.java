import java.util.*;
class Solution 
{
    public String gcdStrings(String st1, String st2) 
    {
        if (!(st1 + st2).equals(st2 + st1)) return "";
        int gcd = gcd(st1.length(), st2.length());
        return st1.substring(0, gcd);
    }
    private int gcd(int a, int b) 
    { 
        return b == 0 ? a : gcd(b, a % b); 
    }
}
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String st1 = sc.next();
//         String st2 = sc.next();
//         Solution obj = new Solution();
//         System.out.println(obj.gcdStrings(st1, st2));
//     }
// }
