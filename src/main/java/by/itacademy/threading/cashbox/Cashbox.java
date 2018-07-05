package by.itacademy.threading.cashbox;

import by.itacademy.threading.buyer.Buyer;
import by.itacademy.threading.product.Product;

import static java.lang.Thread.sleep;

/**
 * Created by user on 05.07.2018.
 */
public class Cashbox<T extends Product> implements CalculateThePrice {
    public Boolean openCashbox = true;
    private String name;

    public Cashbox(String name) {
        this.name = name;
    }

    public synchronized void calculateThePrice(Buyer buyer) {
        {
            openCashbox = false;
            Integer summ = 0;

            for (Object key : buyer.getProductBasket().keySet()) {
                Integer count = (Integer) buyer.getProductBasket().get(key);
                Integer price = ((T) key).getPrice();
                System.out.println(((T) key).getNameProduct() + " количество " + count + " сумма " + price * count + " рублей ");
                summ += price * count;
            }
            try {
                sleep(summ * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Общая сумма к оплате " + summ + " рублей номер кассы " + name);
            openCashbox = true;
        }

    }
}
