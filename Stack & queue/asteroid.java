import java.util.*;

public class asteroid {



    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {

                if (stack.peek() < -ast) {
                    stack.pop(); // stack wala explode
                } 
                else if (stack.peek() == -ast) {
                    stack.pop(); // dono explode
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true; // current asteroid explode
                    break;
                }
            }

            if (!destroyed) {
                stack.push(ast);
            }
        }

        int result[] = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};  // Example input

        int[] result = asteroidCollision(asteroids);

        System.out.println("Final asteroids:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}