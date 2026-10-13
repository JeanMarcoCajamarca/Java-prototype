/* import java.util.ArrayList; */
public class LearnJava {
    public static void main(String[] args) {
        
        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);
    }
        /*Animal a = new Animal();
        String wolf = a.iAmWolf();  -->a.doStuff();<--
        System.out.println(wolf); */

    public static String addExclamationPoint(String s) {
        return s + "!";
    }

}
