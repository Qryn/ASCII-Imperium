public class Boss {
  private int str;
  private int dex;
  private int con;
  private int coin;
  int difficultyNumber;
  int imageNumber;

  public Boss(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
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

  static class Lich extends Boss {
    public Lich(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
      super(str, dex, con, coin, difficultyNumber, imageNumber);
      setStr(2);
      setDex(1);
      setCon(35);
      setCoin(5);
      setDifficultyNumber(4);
      setImageNumber(1);
    }
  }

  static class Dragon extends Boss {
    public Dragon(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
      super(str, dex, con, coin, difficultyNumber, imageNumber);
      setStr(2);
      setDex(1);
      setCon(80);
      setCoin(5);
      setDifficultyNumber(4);
      setImageNumber(2);
    }
  }

  static class Giant_Mutated_Spider extends Boss {
    public Giant_Mutated_Spider(int str, int dex, int con, int coin, int difficultyNumber, int imageNumber) {
      super(str, dex, con, coin, difficultyNumber, imageNumber);
      setStr(1);
      setDex(2);
      setCon(45);
      setCoin(5);
      setDifficultyNumber(4);
      setImageNumber(3);
    }
  }
}