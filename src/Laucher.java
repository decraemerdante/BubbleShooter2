import Welcome.BubbleShooterWelcomeFrame;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class Laucher {
    public static void main(String[] args){
        Laucher laucher = new Laucher();
        laucher.Run();
    }

    private void Run()
    {
        BubbleShooterWelcomeFrame bubbleShooterWelcomeFrame = new BubbleShooterWelcomeFrame();
        bubbleShooterWelcomeFrame.show();
    }
}
