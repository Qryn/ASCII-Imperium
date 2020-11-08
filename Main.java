import java.util.Scanner;
import java.util.Random;
class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean gameover = false;
    MonsterImages monsterImages = new MonsterImages();
    Menu menu = new Menu();
    int classnumber = menu.printHeader();
    Hero hero = new Hero(0,0,0,0,0,"placeholder");
    String wizCheck;
    if (classnumber == 1){
      hero = new Warrior(0,0,0,0,0,menu.enterName());
    }
    if (classnumber == 2){
      hero = new Wizard(0,0,0,0,0,menu.enterName());
    
    }
    if (classnumber == 3){
      hero = new Thief(0,0,0,0,0,menu.enterName());
    }
    Chest chest = new Chest();
    Shop shop = new Shop();
    
    MonsterManager monsterManager = new MonsterManager();
    fillMonsters(monsterManager);
    Monster monster = monsterManager.getlvl1Monster(); 

while(!gameover){
  Random rand = new Random();
  int mDead = 0;
  int run = 0;
  MonsterASCII monsterprinter = new MonsterASCII();
  Monster mob;
  //monsterprinter.monsterImage(mob.getDifficultyNumber(),mob.getImageNumber())
  for(int i = 0; i<4; i++){
    mob = monsterManager.getlvl1Monster();
    //System.out.println(mob.getDifficultyNumber() +""+mob.getImageNumber());
    monsterprinter.monsterImage(mob.getDifficultyNumber(),mob.getImageNumber());
    System.out.println("You have encountered a" + mob.getClass());
    int mobCon = mob.getCon();
    mDead = 0;
    run = 0;
  
    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = mob.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        System.out.println("2.Run");
        int fightorno = scan.nextInt();
        if (fightorno == 1){
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + mob.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-mob.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + mob.getClass() +  " Missed!");
          }
        
        }
        else{
            if(hero.getDex() >= mob.getDex()){
              System.out.println("You ran away!");
              run = 1;
            }
            else{
              System.out.println("You Tripped!");
            }
        }
    }
    if (gameover == true){
    break;}
 System.out.println("And so the journey continues"); 
  }
  if (gameover == true){
    break;
  }
  shop.shopEvent(hero);
  
    Boss.Giant_Mutated_Spider spider = new Boss.Giant_Mutated_Spider(0,0,0,0,0,0);
    System.out.println(spider.getDifficultyNumber() +""+spider.getImageNumber());
    monsterprinter.monsterImage(spider.getDifficultyNumber(),spider.getImageNumber());
    System.out.println("You have encountered a " + spider.getClass());
    int mobCon = spider.getCon();
    mDead = 0;
    run = 0;
  
    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = spider.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        int fightorno = scan.nextInt();
        
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + spider.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
              System.out.println("Congrajulations you have slain the spider that was plagueing the sewers");
              break;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-spider.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + spider.getClass() +  " Missed!");
          }
        
      
       if (gameover == true){
        break; 
      }
    
    } 

    for(int i = 0; i<4; i++){
    mob = monsterManager.getlvl2Monster();
    //System.out.println(mob.getDifficultyNumber() +""+mob.getImageNumber());
    monsterprinter.monsterImage(mob.getDifficultyNumber(),mob.getImageNumber());
    System.out.println("You have encountered a" + mob.getClass());
    mobCon = mob.getCon();
    mDead = 0;
    run = 0;
  
    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = mob.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        System.out.println("2.Run");
        int fightorno = scan.nextInt();
        if (fightorno == 1){
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + mob.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-mob.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + mob.getClass() +  " Missed!");
          }
        
        }
        else{
            if(hero.getDex() >= mob.getDex()){
              System.out.println("You ran away!");
              run = 1;
            }
            else{
              System.out.println("You Tripped!");
            }
        }
    }
    }


    if (gameover == true){
    break;}
    System.out.println("And so the journey continues"); 
    shop.shopEvent(hero);

    Boss.Lich lich = new Boss.Lich(0,0,0,0,0,0);
    System.out.println(lich.getDifficultyNumber() +""+lich.getImageNumber());
    monsterprinter.monsterImage(lich.getDifficultyNumber(),lich.getImageNumber());
    System.out.println("You have encountered a " + lich.getClass());
    mobCon = lich.getCon();
    mDead = 0;
    run = 0;

    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = lich.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        int fightorno = scan.nextInt();
        
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + lich.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
              System.out.println("Congrajulations you have slaughtered the lich that has been unleashing a foul miasma");
              break;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-lich.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + lich.getClass() +  " Missed!");
          }
        
      
       if (gameover == true){
        break; 
      }
    }
    for(int i = 0; i<4; i++){
    mob = monsterManager.getlvl3Monster();
    //System.out.println(mob.getDifficultyNumber() +""+mob.getImageNumber());
    monsterprinter.monsterImage(mob.getDifficultyNumber(),mob.getImageNumber());
    System.out.println("You have encountered a" + mob.getClass());
    mobCon = mob.getCon();
    mDead = 0;
    run = 0;
  
    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = mob.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        System.out.println("2.Run");
        int fightorno = scan.nextInt();
        if (fightorno == 1){
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + mob.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-mob.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + mob.getClass() +  " Missed!");
          }
        
        }
        else{
            if(hero.getDex() >= mob.getDex()){
              System.out.println("You ran away!");
              run = 1;
            }
            else{
              System.out.println("You Tripped!");
            }
        }
    }
    }
    
    if (gameover == true){
    break;}
    System.out.println("And so the journey continues"); 
    shop.shopEvent(hero);

    Boss.Dragon dragon = new Boss.Dragon(0,0,0,0,0,0);
    System.out.println(dragon.getDifficultyNumber() +""+dragon.getImageNumber());
    monsterprinter.monsterImage(dragon.getDifficultyNumber(),dragon.getImageNumber());
    System.out.println("You have encountered a " + dragon.getClass());
    mobCon = dragon.getCon();
    mDead = 0;
    run = 0;

    while(mDead == 0 && run == 0 && !gameover){
        int mobDex = dragon.getDex()*5;
        int heroDmg;
        System.out.println(hero.getClass());
        if (classnumber == 2){
          heroDmg = hero.getWis();
        }
         else {
          heroDmg = hero.getStr();
        } 
        System.out.println("-----------------------"); 
        System.out.println("1.Attack");
        int fightorno = scan.nextInt();
        
          int hitchanceM = rand.nextInt(101); // 0-100
          if (hitchanceM>mobDex){
            mobCon = mobCon - heroDmg;
            System.out.println("You've scored a hit for " + heroDmg + "\nThey have " + mobCon + " health left");
            if (mobCon <= 0){
              hero.setCoin(hero.getCoin() + dragon.getCoin());
              System.out.println("You have " + hero.getCoin() + " coins");
              mDead = 1;
            } 
          }
          else{
            System.out.println("You Missed!");
          }
          int hitchanceH = rand.nextInt(101); // 0-100
          if (hitchanceH>hero.getDex()*5) { 
            hero.setHP(hero.getHP()-dragon.getStr());
            System.out.println("They've scored a hit!" + "\nYou have " + hero.getHP() + " health left");
            if (hero.getHP() <= 0){
              gameover = true;
              
            }
          }
          else{
            System.out.println("The " + dragon.getClass() +  " Missed!");
          }
        
      
       if (gameover == true){
        break; 
      }
    }
    System.out.println("Congrajulations you have cleared your way through the imperium and gathered its many treasures");
     gameover = true;
  }
  } 






  public static void returnHeroAdd(int i,Hero hero) {
    if (i == 0) {
      hero.addVal("HP", 1);
    }
    if (i == 1) {
      hero.addVal("str", 1);
    }
    if (i == 2) {
      hero.addVal("dex", 1);
    }
    if (i == 3) {
      hero.addVal("wis", 1);
    }
    if (i == 4) {
      hero.addVal("coin", 1);
    }
  }
    public static void fillMonsters (MonsterManager mManager){
    Slime slime = new Slime(0,0,0,0,0,0);
    Goblin goblin = new Goblin(0,0,0,0,0,0);
    Kobold kobold = new Kobold(0,0,0,0,0,0);
    Zombie zombie = new Zombie(0,0,0,0,0,0);
    Skeleton skeleton = new Skeleton(0,0,0,0,0,0);
    mManager.add1(slime);
    mManager.add1(goblin);
    mManager.add1(kobold);
    mManager.add1(zombie);
    mManager.add1(skeleton);
    Orc orc = new Orc(0,0,0,0,0,0);
    Witch witch = new Witch(0,0,0,0,0,0);
    Dryad dryad = new Dryad(0,0,0,0,0,0);
    Dark_elf dark_elf = new Dark_elf(0,0,0,0,0,0);
    mManager.add2(orc);
    mManager.add2(witch);
    mManager.add2(dryad);
    mManager.add2(dark_elf);
    Kobold_knight kobold_knight = new Kobold_knight(0,0,0,0,0,0);
    Kobold_wizard kobold_wizard = new Kobold_wizard(0,0,0,0,0,0);
    Kobold_saboteur kobold_saboteur = new Kobold_saboteur(0,0,0,0,0,0);
    mManager.add3(kobold_knight);
    mManager.add3(kobold_wizard);
    mManager.add3(kobold_saboteur);
    Wrestle wrestle = new Wrestle();
    Chest che = new Chest();
    mManager.addEvent(wrestle);
    mManager.addEvent(che);

    }
}