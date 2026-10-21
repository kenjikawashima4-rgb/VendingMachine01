package パターン５;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {

        CoverPage cover = new CoverPage();

        cover.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {

                IntroPage intro = new IntroPage();

                intro.addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosed(WindowEvent e) {

                        new VendingMachineGUI();
                    }
                });
            }
        });
    }
}