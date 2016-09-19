public class Solution {
    public String modifyHere = "";
    boolean judge[];
    public String convert(String text, int nRows) {
        String t = text;
        int n = nRows;
        int combNum;


        char strChar[] = t.toCharArray(); // 变成数组
        char strCharChanged[] = new char [t.length()];
        String last = "";

        judge = new boolean[t.length() * 5];
        for(int i=0; i<t.length() * 5; i++) {
            judge[i] = false;
        }




        if(nRows == 1)
            combNum = 1;
        else
            combNum = 2 * (nRows - 1);

        int totalComb =  t.length()/combNum + 1 ;
        int x[] = new int[totalComb + 2];



        if(n == 1 || combNum/2 + 1 >= t.length()) {
            return t;
        } else {



        /* Define a x Array which can point to the first line of chars*/
            for (int i = 0; i <= totalComb + 1; i ++) {
                x[i] = 2 * i * (n - 1);
                if(x[i] < t.length())
                get(t,x[i]); //
            }

            if(nRows - 2 == 0) {

            }


            else {


                int leftLeanNum = nRows - 2;
                for (int i = 1; i <= leftLeanNum; i++)

                    for (int j = 1; j < x.length; j++) {
                        get(t, i);
                        get(t, x[j] - i);
                        get(t, x[j] + i);

                    }


            }

            for (int i = 0; i <= totalComb; i ++) {

                get(t, x[i] + n - 1);
            }



        }
        return modifyHere;
    }

    public void get(String text, int n) {
        if(judge[n] == true){}
        else {
            if (n >= text.length()) {
            } else {
                int catching = n;
                String temp = String.valueOf(text.charAt(n));
                modifyHere += temp;
                judge[n] = true;
            }
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String outcome = s.convert("ABCDE", 3);
        System.out.println(outcome);
    }

}