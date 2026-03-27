class Database {
    static Database reference;

    private Database(){

    }
    public static Database creatDatabaseObject(){
        if(reference==null){
            reference = new Database();
        }
        return reference;
    }
}
class DatabaseUser {
    public static void main(String[] args) {
        Database db1 = Database.creatDatabaseObject();
        System.out.println(db1);
        Database db2 = Database.creatDatabaseObject();
        System.out.println(db2);
    }    
}
