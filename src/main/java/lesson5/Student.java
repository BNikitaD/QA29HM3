package lesson5;

public class Student {

    public static String firstname;
    public static String lastname;
    public int age;
    public int countoflesson;

    public Student(String Sfirstname, String Slastname){
        firstname=Sfirstname;
        lastname=Slastname;
    }
    public Student(String Sfirstname, String Slastname, int Sage){
        firstname=Sfirstname;
        lastname=Slastname;
        age=Sage;
    }
    public Student(String Sfirstname, String Slastname, int Sage, int Scountoflesson){
        firstname=Sfirstname;
        lastname=Slastname;
        age=Sage;
        countoflesson=Scountoflesson;

    }

    public static String Fullname(){
        String Fullname = "fname: " + firstname + ", Lstname: " + lastname;
        return Fullname;
    }
    public void LastnameLessons(){
        System.out.println(lastname+"posechaet"+ countoflesson+ "zanyatiy" );
    }


}