public class Monster{
  private int str;
  private int dex;
  private int con;
  private int coin;
  int difficultyNumber;
  int imageNumber;

  public Monster(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    this.str = str;
    this.dex = dex;
    this.con = con;
    this.coin = coin;
    this.difficultyNumber = difficultyNumber;
    this.imageNumber = imageNumber;
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

  public int getCon() {
    return con;
  }

  public void setCon(int con) {
    this.con = con;
  }

  public int getCoin() {
    return coin;
  }

  public void setCoin(int coin) {
    this.coin = coin;
  }

  public int getDifficultyNumber() {
    return difficultyNumber;
  }

  public void setDifficultyNumber(int difficultyNumber) {
    this.difficultyNumber = difficultyNumber;
  }

  public int getImageNumber() {
    return imageNumber;
  }

  public void setImageNumber(int imageNumber) {
    this.imageNumber = imageNumber;
  }
}

class Slime extends Monster{
  public Slime(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(0);
    setCon(20);
    setCoin(5);
    setDifficultyNumber(1);
    setImageNumber(1);
  }

}   

class Goblin extends Monster{
  public Goblin(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(2);
    setDex(5);
    setCon(9);
    setCoin(5);
    setDifficultyNumber(1);
    setImageNumber(2);
  }
}

class Kobold extends Monster{
  public Kobold(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(5);
    setCon(3);
    setCoin(5);
    setDifficultyNumber(1);
    setImageNumber(3);
  }
}


class Zombie extends Monster {
  public Zombie(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(1);
    setCon(14);
    setCoin(5);
    setDifficultyNumber(1);
    setImageNumber(4);
  }
}

class Skeleton extends Monster {
  public Skeleton(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(2);
    setDex(3);
    setCon(1);
    setCoin(5);
    setDifficultyNumber(1);
    setImageNumber(5);
  }
}
//level 2
class Orc extends Monster{

  public Orc(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(2);
    setDex(0);
    setCon(25);
    setCoin(7);
    setDifficultyNumber(2);
    setImageNumber(1);
  }
}

class Witch extends Monster{

  public Witch(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(3);
    setDex(1);
    setCon(13);
    setCoin(7);
    setDifficultyNumber(2);
    setImageNumber(2);
  }
}

class Dryad extends Monster{
  public Dryad(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(3);
    setCon(20);
    setCoin(7);
    setDifficultyNumber(2);
    setImageNumber(3);
  }
}

class Dark_elf extends Monster{
  public Dark_elf(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(7);
    setCon(1);
    setCoin(7);
    setDifficultyNumber(2);
    setImageNumber(4);
  }
}

class Mimic extends Monster{
  public Mimic(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(0);
    setCon(25);
    setCoin(7);
    setDifficultyNumber(2);
    setImageNumber(5);
  }
}

// level 3
class Kobold_knight extends Monster{
  public Kobold_knight(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(2);
    setDex(0);
    setCon(24);
    setCoin(10);
    setDifficultyNumber(3);
    setImageNumber(1);
  }
}
class Kobold_wizard extends Monster{
  public Kobold_wizard(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(3);
    setDex(0);
    setCon(17);
    setCoin(10);
    setDifficultyNumber(3);
    setImageNumber(2);

  }
}
class Kobold_saboteur extends Monster{
  public Kobold_saboteur(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
    super(str, dex, con, coin, difficultyNumber, imageNumber);
    setStr(1);
    setDex(5);
    setCon(18);
    setCoin(10);
    setDifficultyNumber(3);
    setImageNumber(3);
  }
}
