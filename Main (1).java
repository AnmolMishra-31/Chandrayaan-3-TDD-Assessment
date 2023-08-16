/* Re-factor code considering several test cases*/
public class Main {
    private int x;
    private int y;
    private int z;
    private char direction;

    public Main(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void move(char command) {
        // ... [same as before]
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }
    public char getDirection() { return direction; }

    public static void executeCommandsAndPrintOutput(Main spacecraft, char[] commands) {
        for (char cmd : commands) {
            spacecraft.move(cmd);
        }
        System.out.println("Commands: " + java.util.Arrays.toString(commands));
        System.out.println("X: " + spacecraft.getX());
        System.out.println("Y: " + spacecraft.getY());
        System.out.println("Z: " + spacecraft.getZ());
        System.out.println("Direction: " + spacecraft.getDirection());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        char[][] allCommands = {
            {'f', 'r', 'u', 'b', 'l'},                          // Case 1
            {'f', 'r', 'f', 'r', 'f', 'r', 'f', 'r', 'f'},     // Case 2
            {'f', 'u', 'f', 'r', 'f', 'd', 'f', 'l', 'f'},     // Case 3
            {'l', 'l', 'l', 'l', 'r', 'r', 'r', 'r'},          // Case 4
            {'f', 'f', 'r', 'f', 'f', 'u', 'f', 'l', 'b'}      // Case 5
        };

        for (char[] commands : allCommands) {
            Main spacecraft = new Main(0, 0, 0, 'N');
            executeCommandsAndPrintOutput(spacecraft, commands);
        }
    }
}



