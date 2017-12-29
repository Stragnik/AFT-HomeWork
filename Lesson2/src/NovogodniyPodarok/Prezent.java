import java.util.ArrayList;

/**
 * Формируется новогодний подарок.
 * Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

public class Prezent {
    private ArrayList<Sweet>sweetArrayList = new ArrayList<Sweet>();
    public ArrayList<Sweet> getSweetArrayList() {
        return sweetArrayList;
    }


    public static void main(String[] args) {
        /*
        initialize sweets
         */
        Bar mars = new Bar("Mars",0.05,45,false);
        Bar snickers = new Bar("Snickers", 0.05, 50, true);
        Cookie oreo = new Cookie("Oreo", 0.125, 100, "chocolate-sugar");
        Jellybean haribo = new Jellybean("Haribo", 0.1, 50, 0.3);
        Candy merci = new Candy("Merci", 0.2, 300, "Marzipan");
        Candy raffaello = new Candy("Raffaello", 0.15, 200, "Coconut");
        /*
        make a gift
         */
        NewYear gift = new NewYear();
        /*
        add all sweets to gift
         */
        gift.getSweetArrayList().add(mars);
        gift.getSweetArrayList().add(snickers);
        gift.getSweetArrayList().add(oreo);
        gift.getSweetArrayList().add(haribo);
        gift.getSweetArrayList().add(merci);
        gift.getSweetArrayList().add(raffaello);
        
        /*
        total weight of gift
         */
        double totalWeight = 0;
        for (Sweet sweets: gift.getSweetArrayList()) {
            totalWeight += sweets.getWeight();
        }
        System.out.println("Total weight of gift: " + totalWeight);

        /*
        total cost of gift
         */
        float totalCost = 0;
        for (Sweet sweet: gift.getSweetArrayList()) {
            totalCost += sweet.getCost();
        }
        System.out.println("Total cost of gift: " + totalCost);

        /*
        information about all sweets
         */
        System.out.println("Gift consists of:");
        for (Sweet sweet: gift.getSweetArrayList()) {
            System.out.println(sweet.toString());
        }
    }
}