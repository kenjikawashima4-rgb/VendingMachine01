package パターン6;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VendingMachineGUI extends JFrame {

    private VendingMachine vm;
    private JLabel message;
    private int money;

    public VendingMachineGUI() {

        vm = new VendingMachine();

        String moneyStr =
                JOptionPane.showInputDialog("投入金額を入力してください");

        try {
            money = Integer.parseInt(moneyStr);
        } catch (Exception e) {
            money = 0;
        }

        setTitle("自動販売機");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel title = new JLabel(
                "自動販売機システム",
                SwingConstants.CENTER);

        title.setFont(new Font("MS Gothic", Font.BOLD, 24));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton colaBtn = new JButton("コーラ 150円");
        JButton teaBtn = new JButton("お茶 130円");
        JButton waterBtn = new JButton("水 100円");

        panel.add(colaBtn);
        panel.add(teaBtn);
        panel.add(waterBtn);

        message = new JLabel(
                "投入金額：" + money + "円",
                SwingConstants.CENTER);

        colaBtn.addActionListener(e -> buy(0));
        teaBtn.addActionListener(e -> buy(1));
        waterBtn.addActionListener(e -> buy(2));

        add(title, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(message, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void buy(int index) {

        String result = vm.buyProduct(index, money);

        Product p = vm.getProduct(index);

        if (money >= p.getPrice() && p.getStock() >= 0) {

            money -= p.getPrice();

            result += "　残高：" + money + "円";
        }

        message.setText(result);
    }

    public static void main(String[] args) {

        new VendingMachineGUI();

    }
}
