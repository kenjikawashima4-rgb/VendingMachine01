package パターン6;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> products;

    public VendingMachine() {

        products = new ArrayList<>();

        products.add(new Product("コーラ", 150, 5));
        products.add(new Product("お茶", 130, 5));
        products.add(new Product("水", 100, 5));
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public int getSize() {
        return products.size();
    }

    public String buyProduct(int index, int money) {

        Product p = products.get(index);

        if (p.getStock() <= 0) {
            return "売り切れです";
        }

        if (money < p.getPrice()) {
            return "お金が足りません";
        }

        p.decreaseStock();

        int change = money - p.getPrice();

        return p.getName() + "を購入しました。お釣り：" + change + "円";
    }
}
