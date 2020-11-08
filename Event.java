 import java.util.Random;
import java.util.Scanner;
public class Event{
  Scanner scan = new Scanner(System.in);
}
class Shop extends Event{
  public void shopEvent(Hero yuusha){
    System.out.println("-----------------------"); 
    System.out.println("You encounter a hunched over man wearing a decrepit old cloak");
    System.out.println("He raises his arm, displaying a vast amount of goods under his sleeve");
    System.out.println("He grumbles, \"What're ya buyin?\"\n\n");

    int option = 1;
    Scanner optionScan = new Scanner(System.in);
    System.out.println("1 - Health Item - 10 coins\n"); 
    System.out.println("2 - Strength Item - 10 coins\n"); 
    System.out.println("3 - Dexterity Item - 10 coins\n"); 
    System.out.println("4 - Wisdom Item - 10 coins\n"); 
    System.out.println("0 - Leave Shop\n");
    System.out.println("Please enter the number of what you'd like:\n");
    while(option != 0){
      option = scan.nextInt();
      if (option == 1){
        if(yuusha.buyItem(10) == 1){
          yuusha.setHP(yuusha.getHP() + 10);
          System.out.println("You gain 10 health.");
          System.out.printf("You are now at %d HP\n",yuusha.getHP());
        }
      }
      if (option == 2){
        if(yuusha.buyItem(10) == 1){
          yuusha.addVal("str",2);
        }
      }
      if (option == 3){
        if(yuusha.buyItem(10) == 1){
          yuusha.addVal("dex",2);
        }
      }
      if (option == 4){
        if(yuusha.buyItem(10) == 1){
          yuusha.addVal("wis",2);
        }
      }
      if (option == 0){
        System.out.println("\"Is that all, stranger?\"\n");
        System.out.println("You leave the shop.");
      }
    }
  }
}
class Chest extends Event{
  public void chestEvent(Hero yuusha , int wasMimic){
    System.out.println("-----------------------"); 
    System.out.println("You found a Chest!\n");
    Random rand = new Random();
    int itemNum = 0;
    if (wasMimic == 1){
      itemNum = rand.nextInt(5);
    }
    else{
      itemNum = rand.nextInt(6);
    }
    switch (itemNum){
      case 0:
        //HP item
        System.out.println("There was an HP item!");
        yuusha.addVal("HP",2);
        return;
      case 1:
        //str item
        System.out.println("There was a strength item!");
        yuusha.addVal("str",2);
        return;
      case 2:
        //dex item
        System.out.println("There was a dexterity item!");
        yuusha.addVal("dex",2);
        return;
      case 3:
        //wis item
        System.out.println("There was a wisdom item!");
        yuusha.addVal("wis",2);
        return;
      case 4:
        //coin item
        System.out.println("There was a coin!");
        yuusha.addVal("coin",2);
        return;
      case 5:
        //mimic Event
        System.out.println("You found a tongue!\n");
        System.out.println("Oh no! It's a mimic!");
        chestEvent(yuusha,1);
        return;
    }
    return;
  }
}
class Wrestle extends Event{
  public void wrestleEvent(Hero yuusha){
    System.out.println("-----------------------"); 
    System.out.println("You get into an arm wrestle with a dwarf\n");
    System.out.println("It's an intense battle\n");

    Random rand = new Random();
    int dwarfStr = rand.nextInt(7);
    int gold = 0;
    gold = rand.nextInt(6);
    

    if(yuusha.getStr() > dwarfStr){
      // win battle
      System.out.println("You've won!");
      System.out.println("The dwarf pays you in gold!");
      yuusha.setCoin(yuusha.getCoin() + 5 + gold);
      System.out.printf("You now have %d coins\n",yuusha.getCoin());
    }
    else{
      // lose battle
      System.out.println("Ow! That hurt!");
      System.out.println("You lose some hp. (HP - 1)");
      System.out.println("You've lost!");
      System.out.println("You pay the dwarf for your loss.");
      if(yuusha.getCoin() < (3 + gold)){
        System.out.println("You are now broke.");
        yuusha.setCoin(0);
      }
      else{
        yuusha.setCoin(yuusha.getCoin() - gold);
      }
      System.out.printf("You are at %d HP",yuusha.getHP());
      System.out.printf("You now have %d coins",yuusha.getCoin());
    }
  }
}
class Thorns extends Event{
  public void thornsEvent(Hero yuusha){
    System.out.println("You somehow get your leg stuck in a thorn bush.");
    System.out.println("You try to get out.");

    Random rand = new Random();
    int thorns = rand.nextInt(8);
    if(yuusha.getDex() > thorns){
      System.out.println("You skillfully navigate your leg through the thorns.\n");
    }
    else{
      System.out.println("Ow! You skillfully get your leg caught on every thorn in the bush.\n");
      System.out.println("You lose 2 HP.");
      yuusha.setHP(yuusha.getHP() - 2);
      System.out.printf("You are now at %d HP\n",yuusha.getHP());
    }
  }
}
class rap extends Event{
  public void rapBattle(Hero yuusha){
    System.out.println("A wizard challenges you to a mystical diss battle.");
    System.out.println("You spit flames to try to school this fool.");

    Random rand = new Random();
    int bars = rand.nextInt(8);
    if(yuusha.getWis() > bars){
      System.out.println("You show Dumbledore how it's done in the hood.\n");
    }
    else{
      System.out.println("Gandalf sends yo butt back to kindergarten.\n");
      System.out.println("You lose 2 HP.");
      yuusha.setHP(yuusha.getHP() - 2);
      System.out.printf("You are now at %d HP\n",yuusha.getHP());
    }
  }
}