package day25_26.inheritance;

import day25_26.inheritance.animal.Cat;

/**
 * @author piotr
 */
public class CatOwner {
    Cat ownedCat;

    public CatOwner(Cat owneCat) {
        this.ownedCat = owneCat;
    }
    
    public void doSthWithCat() {
//        System.out.println("Print name: " + ownedCat.name);
//        System.out.println("Pring color: " + ownedCat.color);
    }
        
}
