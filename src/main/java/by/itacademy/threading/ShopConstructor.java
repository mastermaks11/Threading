package by.itacademy.threading;

import by.itacademy.threading.cashbox.Cashbox;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 05.07.2018.
 */
public class ShopConstructor {
    public static Set<Cashbox> cashboxes;

    public ShopConstructor() {
        cashboxes = new HashSet<Cashbox>();
    }
    public void addCashboxs(Cashbox cashbox)
    {
        cashboxes.add(cashbox);
    }
}
