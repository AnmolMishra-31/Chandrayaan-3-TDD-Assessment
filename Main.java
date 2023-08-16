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
        switch (command) {
            case 'f':
                if (direction == 'N') y++;
                else if (direction == 'S') y--;
                else if (direction == 'E') x++;
                else if (direction == 'W') x--;
                else if (direction == 'U') z++;
                else if (direction == 'D') z--;
                break;
            case 'b':
                if (direction == 'N') y--;
                else if (direction == 'S') y++;
                else if (direction == 'E') x--;
                else if (direction == 'W') x++;
                else if (direction == 'U') z--;
                else if (direction == 'D') z++;
                break;
            case 'l':
                if (direction == 'N') direction = 'W';
                else if (direction == 'S') direction = 'E';
                else if (direction == 'E') direction = 'N';
                else if (direction == 'W') direction = 'S';
                else if (direction == 'U') direction = 'N'; // After going up, then left, we assume it faces North again
                else if (direction == 'D') direction = 'S'; // After going down, then left, we assume it faces South again
                break;
            case 'r':
                if (direction == 'N') direction = 'E';
                else if (direction == 'S') direction = 'W';
                else if (direction == 'E') direction = 'S';
                else if (direction == 'W') direction = 'N';
                else if (direction == 'U') direction = 'S'; // After going up, then right, we assume it faces South again
                else if (direction == 'D') direction = 'N'; // After going down, then right, we assume it faces North again
                break;
            case 'u':
                direction = 'U';
                break;
            case 'd':
                direction = 'D';
                break;
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }
    public char getDirection() { return direction; }

    public static void main(String[] args) {
        Main spacecraft = new Main(0, 0, 0, 'N');
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        for (char cmd : commands) {
            spacecraft.move(cmd);
        }
        System.out.println("X: " + spacecraft.getX());
        System.out.println("Y: " + spacecraft.getY());
        System.out.println("Z: " + spacecraft.getZ());
        System.out.println("Direction: " + spacecraft.getDirection());
    }
}
