public class Hero {
    private int HP;
    private int str;
    private int dex;
    private int wis;
    private int coin;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(int HP, int str, int dex, int wis, int coin, String name) {
        this.HP = HP;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.coin = coin;
        this.name = name;
    }

    public String getName() {
      return name;
    }

    public int getHP() {
      return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int buyItem(int cost){
      if (this.coin < cost){
        System.out.println("Not enough cash, stranger!");
        return 0;
      }
      else{
        this.coin-=cost;
        System.out.println("Heh heh heh... Thank you!");
        System.out.printf("You have %d coins left\n",this.coin);
        return 1;
      }

    }


    public void addVal(String stat, int val){
      switch(stat){
        case "HP":
          this.HP += val;
          break;
        case "str":
          this.str += val;
          break;
        case "dex":
          this.dex += val;
          break;
        case "wis":
          this.wis += val;
          break;
        case "coin":
          this.coin += val;
          break;
        default:
          System.out.println("you forgot the stat dummy"); 
          break;
      }
    }

}

class Warrior extends Hero {
    public Warrior(int HP, int str, int dex, int wis, int coin, String name) {
        super(HP, str, dex, wis, coin, name);
        setHP(11);
        setStr(7);
        setDex(6);
        setWis(0);
        setCoin(10);
    }

}

class Wizard extends Hero {
    public Wizard(int HP, int str, int dex, int wis, int coin, String name) {
        super(HP, str, dex, wis, coin, name);
        setHP(8);
        setStr(1);
        setDex(5);
        setWis(9);
        setCoin(10);
    }

}

class Thief extends Hero {
    public Thief(int HP, int str, int dex, int wis, int coin, String name) {
        super(HP, str, dex, wis, coin, name);
        setHP(11);
        setStr(4);
        setDex(8);
        setWis(3);
        setCoin(10);
    }
}
