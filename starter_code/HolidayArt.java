/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;

        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        for(int i = 0; i < height; i++) {
            for(int space = 0; space < height - i - 1; space++) {
                System.out.print(" ");
            }
            for(int star = 0; star < (2 * i + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int space = 0; space < height - 1; space++) {
            System.out.print(" ");
        }
        System.out.println("|||");
    }
}
