package StudentDatabase;

/**
 * Created by tlepr on 2018-01-10.
 */
public class StudentDataBase {

    public static void main(String[] args) {

        StudentDataBase student1 = new StudentDataBase("tony","44433344",12345);
        student1.enroll("english", "jeff");

        System.out.println(student1.rollout("Jack",8998,900 ));



    }


    private String name;
    private String ssn;
    private static int iD = 1000;
    public String classRoom = "math";
    public int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        StudentDataBase.iD = iD;
    }

    public StudentDataBase(String name, String ssn, int iD){
        int random = (int) (Math.random()*100);
        System.out.println("new Student " + name + " ssn: " + ssn + "ID" + random + iD);
    }
    public void enroll(String classRoom, String name){

        System.out.println(name + " starts in " + classRoom);
    }
    public void pay(){

    }
    public int balance( int amount){
        int random = (int) (Math.random()*10000);
        amount = random;

        return amount;
    }

    //@Override
    public String rollout( String name, int ssn, int amount ){
          int r = (int) (Math.random()*1000);
        return "[Name: " + name + "]\n[ssn: "+ ssn + r + "]\n"
                + "[Balance " + amount +"]";
    }

}
