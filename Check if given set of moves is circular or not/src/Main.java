public class Main {
    /*
     * Complete the solution function
     */
    static final int N = 1;
    static final int E = 2;
    static final int S = 3;
    static final int W = 4;

    public static int turnRight(int route) {
        if (route + 1 > W) {
            route = N;
        } else {
            route++;
        }
        return route;
    }

    public static int turnLeft(int route) {
        if (route - 1 < N) {
            route = W;
        } else {
            route = route - 1;
        }
        return route;
    }

    static boolean solution(String instructions) {
        /*
         *  Write your solution here !
         *  You can use the result variable
         *  below to return your answer
         */
        int initialX = 0;
        int initialY = 0;
        int initialRoute = N;
        int x = 0;
        int y = 0;
        int route = 1;
        for (int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            if (c == 'R') {
                route = turnRight(route);
            } else if (c == 'L') {
                route = turnLeft(route);
            } else {

                if (route == N) {
                    y++;
                } else if (route == E) {
                    x++;
                } else if (route == S) {
                    y--;
                } else if (route == W) {
                    x--;
                }

            }


        }
        if (initialX == x && initialY == y) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        boolean x = solution("MRMRMRM");
        System.out.println(x);
    }

}
