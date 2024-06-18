**MAIN**    

```java
            import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        CheeseService cheeseService = new CheeseService();
        Cheese cheddar = new Cheese("Cheddar", 6.69);
        Cheese mozzarella = new Cheese("Mozzarella", 3.50);
        Cheese brie = new Cheese("Brie", 7.77);
        Cheese feta = new Cheese("Feta", 4.20);
        Cheese ricotta = new Cheese("Ricotta", 4.21);
        Cheese blueCheese = new Cheese("Blue Cheese", 9.99);

        cheeseService.addCheese(cheddar);
        cheeseService.addCheese(mozzarella);
        cheeseService.addCheese(brie);
        cheeseService.addCheese(feta);
        cheeseService.addCheese(ricotta);
        cheeseService.addCheese(blueCheese);

        CheeseShop shop = new CheeseShop(cheeseService);
        Customer customer = new Customer(50.0);

        System.out.printf("Customer's initial balance: $%.2f%n", customer.getMoney());

        shop.addCheeseToCart(cheddar);
        shop.addCheeseToCart(mozzarella);
        shop.addCheeseToCart(brie);
        shop.addCheeseToCart(feta);
        shop.addCheeseToCart(ricotta);
        shop.addCheeseToCart(blueCheese);

        for (Cheese cheese : shop.getCart()) {
            customer.buyCheese(shop, cheese);
            System.out.println("Successfully purchased " + cheese.getName());
        }

        System.out.printf("Customer's remaining balance: $%.2f%n", customer.getMoney());


        System.out.println("Cheeses bought:");
        for (Cheese cheese : customer.getOwnedItems()) {
            System.out.println("- " + cheese.getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the cheese to remove (or 'no' to skip): ");
        String cheeseToRemoveName = scanner.nextLine().trim();

        if (!cheeseToRemoveName.equalsIgnoreCase("no")) {
            
            Cheese cheeseToRemove = null;
            for (Cheese cheese : customer.getOwnedItems()) {
                if (cheese.getName().equalsIgnoreCase(cheeseToRemoveName)) {
                    cheeseToRemove = cheese;
                    break;
                }
            }

            if (cheeseToRemove != null) {
                customer.removeCheese(cheeseToRemove);
                System.out.println(cheeseToRemove.getName() + " removed from your cheeses.");
            } else {
                System.out.println("You do not own " + cheeseToRemoveName);
            }
        } else {
            System.out.println("No cheese removed.");
        }

        System.out.println("Cheeses owned after removal:");
        for (Cheese cheese : customer.getOwnedItems()) {
            System.out.println("- " + cheese.getName());
        }

        scanner.close();
    }
}

```
**CHEESESHOP**

```java

import java.util.ArrayList;
import java.util.List;

public class CheeseShop {
    private CheeseService cheeseService;
    private List<Cheese> cart;

    public CheeseShop(CheeseService cheeseService) {
        this.cheeseService = cheeseService;
        this.cart = new ArrayList<>();
    }

    public void addCheeseToCart(Cheese cheese) {
        cart.add(cheese);
    }

    public void removeCheeseFromCart(Cheese cheese) {
        cart.remove(cheese);
    }

    public List<Cheese> getCart() {
        return cart;
    }

    public List<Cheese> getAvailableCheeses() {
        return cheeseService.getAvailableCheeses();
    }
}
```

**CHEESE**

```java

class Cheese {
    private String name;
    private double price;

    public Cheese(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
```

**CHEESESERVICE**

```java

import java.util.ArrayList;
import java.util.List;

public class CheeseService {
    private List<Cheese> availableCheeses;

    public CheeseService() {
        this.availableCheeses = new ArrayList<>();
    }

    public void addCheese(Cheese cheese) {
        availableCheeses.add(cheese);
    }

    public List<Cheese> getAvailableCheeses() {
        return availableCheeses;
    }
}
```

**CUSTOMER**

```java 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {
    private double money;
    private List<Cheese> ownedItems;

    public Customer(double money) {
        this.money = money;
        this.ownedItems = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public List<Cheese> getOwnedItems() {
        return ownedItems;
    }

    public void buyCheese(CheeseShop shop, Cheese cheese) {
        double cheesePrice = cheese.getPrice();
        if (money >= cheesePrice) {
            money -= cheesePrice;
            ownedItems.add(cheese);
        }
    }

    public void removeCheese(Cheese cheese) {
        ownedItems.remove(cheese);
    }
}
```
