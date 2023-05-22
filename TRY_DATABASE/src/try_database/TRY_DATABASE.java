package try_database;

public class TRY_DATABASE extends StudentInfo{
    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo();
        
        int i;
        for( i = 0; i < 5; i++ )
            System.out.println(obj.toString());
        
    }
    
}
