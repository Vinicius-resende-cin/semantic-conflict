package samples;

public class OverrideAssignmentVariable {
    public void conflict() {
        int x = 1;
        if (x > 0) {
            System.out.println(x);
        }
        x = 2;
        System.out.println(x);
    }

}
