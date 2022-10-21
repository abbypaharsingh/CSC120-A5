/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
        //first row of banner
        System.out.print("  ********");
        for (int i = 0;i < this.message.length(); i++){
            System.out.print("*");
        }
        System.out.println();

        //second row of banner
        System.out.print(" *** " );
        for (int i = 0;i < this.message.length(); i++){
            System.out.print("~");
        }
        System.out.print("~~ ***"); 
        System.out.println();

        // middle row of banner with message 
        System.out.println("*** " + "~  " + this.message + "  ~" + " ***" );

        //fourth row of banner 
        System.out.print(" *** " );
        for (int i = 0;i < this.message.length(); i++){
            System.out.print("~");
        }
        System.out.print("~~~  ***"); 
        System.out.println();
        
        // fifth row of banner 
        System.out.print("   ***");
        for (int i = 0;i < this.message.length(); i++){
            System.out.print("*");
        }
        System.out.print("    ***"); 
        System.out.println();
        
        // tail of banner
        for (int i = 0;i < this.message.length(); i++){
            System.out.print(" ");
        }
        System.out.print( "    ******");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}



