#MAIN#

  ```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<Item>();
        System.out.println("Hello world");
        
        var cheese = new Cheese();
        items.add(cheese);
        cheese.price = 10;
        cheese.name = "Parmesan";
        
        System.out.println(cheese.price);

        var wine = new Wine();
        items.add(wine);
        wine.price = 7;
        wine.name = "Chardonay, Merlot";


        System.out.println("These are all the things I can sell to you:");
        for(var item : items){
            System.out.println(item.name);
            System.out.println(item.price);
            if(item instanceof Wine){
                //All the items that are Wine
                Wine wineInstance = (Wine)item;
                System.out.println(wineInstance.age);
            }else if(item instanceof Cheese){
                //All the items that are cheese
                Cheese cheeseInstance = (Cheese)item;
                System.out.println(cheeseInstance.cheeseType);
                
            }
        }
    }
}
```


#ITEM#

  ```java
  public class Item{
  public float price;
  public String name;

  // setPrice
  // getPrice
  // setName
  // getName
}
```

#CHEESE#

  ```java
  public class Cheese extends Item{
  public String cheeseType;
  public String cheeseColor;
}
```


#WINE#

  ```java
  public class Wine extends Item{
    //Price
    //Name
    public String type;
    public int age;
    public float alchPercentage;
    public String color;
}
```
