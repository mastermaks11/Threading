package by.itacademy.threading;

import by.itacademy.threading.buyer.Buyer;
import by.itacademy.threading.cashbox.Cashbox;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 05.07.2018.
 */
public class Queue implements Runnable {
    private static final Set<Cashbox> box = ShopConstructor.cashboxes;
    private Set<Buyer> queueBuyrs;
    private Buyer buyer;

    public Queue(Buyer buyer) {
        this.queueBuyrs = new HashSet<Buyer>();
        this.buyer = buyer;
    }

    public void addBuyrs(Buyer buyer) {
        queueBuyrs.add(buyer);
    }

    public void run() {
        for (Buyer buyer : queueBuyrs)
        {
            new Thread(buyer).start();
        }
        for(Buyer buyer : queueBuyrs)
            for (Cashbox cashbox : box)
                {
                {
                    if(cashbox.openCashbox) {
                        cashbox.calculateThePrice(buyer);
                        break;
                    }
                    else continue;
                }
            }
        }
    }

