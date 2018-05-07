package zad2;

import zad1.Product;

/**
 *
 * @author Daria
 */
public class dzem extends Product {
    public dzem(String nazwa, double price, String opis) {
        super(price, nazwa, opis);
    }

    @Override
    public void buy() {
        System.out.println("Kupiłem dżem");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}