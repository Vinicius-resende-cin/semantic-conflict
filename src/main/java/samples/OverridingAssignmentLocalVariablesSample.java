package samples;

public class OverridingAssignmentLocalVariablesSample {
    public static int x, y;
    public static void conflict() {
        x = x+1; // base
        System.out.println(x);
    }
}
