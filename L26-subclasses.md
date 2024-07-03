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


#TEAMWORK MAMMALIANS#

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mammalian> mammals = new ArrayList<>();

        Human human = new Human("Beatrice", 31, 69, "Musician", "English", "Female");
        Fox fox = new Fox("Trudy", 3, 7.5, "Red", "Forest");

        mammals.add(human);
        mammals.add(fox);

        System.out.println("Mammals Information:");
        for (Mammalian mammal : mammals) {
            System.out.println("Name: " + mammal.name);
            System.out.println("Age: " + mammal.age);
            System.out.println("Weight: " + mammal.weight + " kg");

            if (mammal instanceof Human) {
                Human humanInstance = (Human) mammal;
                System.out.println("Job: " + humanInstance.job);
                System.out.println("Nationality: " + humanInstance.nationality);
                System.out.println("Gender: " + humanInstance.gender);
            } else if (mammal instanceof Fox) {
                Fox foxInstance = (Fox) mammal;
                System.out.println("Fur Color: " + foxInstance.furColor);
                System.out.println("Habitat: " + foxInstance.habitat);
            }

            System.out.println(); 
        }
    }
}
class Mammalian {
    String name;
    int age;
    double weight;

    Mammalian(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void printProperties() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
    }
}
class Human extends Mammalian {
    String job;
    String nationality;
    String gender;

    Human(String name, int age, double weight, String job, String nationality, String gender) {
        super(name, age, weight);
        this.job = job;
        this.nationality = nationality;
        this.gender = gender;
    }
}
class Fox extends Mammalian {
    String furColor;
    String habitat;

    Fox(String name, int age, double weight, String furColor, String habitat) {
        super(name, age, weight);
        this.furColor = furColor;
        this.habitat = habitat;
    }
}
```
