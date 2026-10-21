package パターン６;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CoverPage extends JFrame {

    public CoverPage() {

        setTitle("卒業制作");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel(
                "<html><center>"
                        + "Python Java 複数言語習得科 卒業制作<br><br>"
                        + "自動販売機販売管理システム<br><br>"
                        + "Javaによる自動販売機シミュレーションプログラム<br><br>"
                        + "氏名：河島 健仁"
                        + "</center></html>",
                SwingConstants.CENTER);

        label.setFont(
                new Font("MS Gothic", Font.BOLD, 20));

        add(label);

        setVisible(true);
    }
}