package samples;

public class OverridingAssignmentLocalVariablesSample {
    public static int x, y;
    public static void conflict() {
        y = 2;   // left
        x = x+1; // base
        y = 3;   // right
        System.out.println(x);
    }
}
