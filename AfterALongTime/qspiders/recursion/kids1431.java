class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0;
        int l=candies.length;
        boolean [] result = new boolean[candies.length];
        int j = 1;
        while(i<l){
            if(candies[i]+extraCandies>j++)
                result[i] =true;
            else
                result[i] =false;
            i++;
        }
        return ;
    }
}