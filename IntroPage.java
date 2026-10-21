package パターン6;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IntroPage extends JFrame {

    public IntroPage() {

        setTitle("システム概要");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea();

        area.setText(
                "本日は卒業制作として、\n"
                        + "自動販売機販売管理システムを発表します。\n\n"
                        + "Javaのオブジェクト指向を利用し、\n"
                        + "商品の購入処理、在庫管理、\n"
                        + "お釣り計算機能を実装しました。");

        area.setFont(
                new Font("MS Gothic", Font.PLAIN, 20));

        area.setEditable(false);

        add(new JScrollPane(area));

        setVisible(true);
    }
}