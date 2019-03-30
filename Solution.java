public class Solution {
    int countLetter(char searchLetter, String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == searchLetter){
                count++;
            }
        }
        return count;
    }

    int numJewelsInStones(String J, String S) {
        int numJewel = 0;
        for(int i = 0; i < J.length(); i++) {
            char j = J.charAt(i);
            numJewel += countLetter(j, S);
        }
        return numJewel;
    }

    public static void main(String args[]){
        Solution solution = new Solution();
        int answer = 0;
        String j = "aAbcn";
        String s = "aaaAAAbbbsssssssss";
        answer = solution.numJewelsInStones(j, s);
        System.out.println(answer);
    }
}

