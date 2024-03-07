public class LCSR {
    static String longestRepeatingSubstring(String str){
        int n = str.length();
        int LRS[][] = new int[n + 1][n + 1];
        String res = "";
        int res_len = 0;
        int index = 0;
        for(int i = 1; i <= n; ++i)
        {
            for(int j = i + 1; j <= n; ++j)
            {
                if(str.charAt(i - 1) == str.charAt(j - 1) && LRS[i - 1][j - 1] < j - i)
                {
                    LRS[i][j] = LRS[i - 1][j - 1] + 1;
                    if(LRS[i][j] > res_len)
                    {
                        res_len = LRS[i][j];
                        index = Math.max(i, index);
                    }
                }
                else
                {
                    LRS[i][j] = 0;
                }
            }
        }
        if(res_len > 0){
            for(int i = index - res_len + 1; i <= index; ++i)
            {
                res += str.charAt(i - 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abhidehiabc";
        System.out.println("The longest repeating non-overlapping substring in the given string : ");
        System.out.println(longestRepeatingSubstring(s));
    }
}
