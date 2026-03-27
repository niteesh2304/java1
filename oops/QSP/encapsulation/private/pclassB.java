public class pclassB{
    public static void main(String args[]){
        pclassA a1 =new pclassA();
        {
            System.out.println(a1.a);
            //direct access is denied
            // System.out.println(a1.b); CTE
        }

    }
}
