
 public class Test {
 public static int letterNum(String s, int i) {
 int ithChar = s.charAt(i);
 if((ithChar < 'a' ) || (ithChar > 'z'))
 {throw new IllegalArgumentException();}
 return ithChar - 'a' + 1;
 }


 public static int convertToInt(String s) {
 int intRep = 0;
 for (int i = 0; i < s.length(); i ++  ) {
 intRep = intRep << 5;
 intRep = intRep + letterNum(s, i);

 }
 return intRep;
 }

 public static void main(String[] args) {
 Test test1 = new Test();
 test1.convertToInt("abcd");
 }
 }