package programmeweek2homework;

/**
 * Write a java programme using the following steps
 * 4.1 Declare two instance and two static variables
 * 4.2 Declare one instance method
 * 4.3 Declare one static method
 * 4.4 Cal all four instance and static variables into both instance and static mehtods inside the print statement
 * 4.5 Declare the main method
 * 4.6 Call both instance and static method into the main method and run the programme
 */

public class Programme4 {
    //4.1 Declare two instance and two static variables
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement
    public void instanceMehtod(){
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Programme4.a);
        System.out.println(Programme4.b);
    }

    //4.3 Declare one static method
    //4.4 Call all four instance and static variables into both instance and static mehtods inside th eprint statement
    public static void staticMethod(){
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.Name);
        System.out.println(programme4.Surname);
        System.out.println(a);
        System.out.println(b);

    }

    //4.5 Declare the main method
    //4.6 Call both instance and static methods into main method and run the programme
    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        programme4.instanceMehtod();
        staticMethod();
    }
}
