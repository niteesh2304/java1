public class DigitPurge{
    public static void main(String args[]){
            String n = "H3ll0J4v4";
            String res = "";
            for(int i=0;i<n.length();i++){
                char c = n.charAt(i);
                if(c < '0' || c > '9'){
                    res+=c;
                }
            }
        System.out.println(res);
    }
}