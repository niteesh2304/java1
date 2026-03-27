public class stringmail{
    public static void main(String args[]){

        String[] emails = {"a@gmail.com","b@yahoo.com","c@apple.com"};

        for(int i =0;i<emails.length;i++){
            String cur = emails[i];
            for(int j=0;j<cur.length();j++){
                if(cur.charAt(j)=='@'){
                    int p = j;
                    System.out.println(cur.substring(p+1,p+4));
                }
            }
        } 
    }
}