import java.util.Scanner;
public class Menu{
 

  public int printHeader(){
    System.out.println("=================================================");
    System.out.println("                      ASCII           ");
    System.out.println("        A Soldier\'s Crusade Into Imperium"      );
    System.out.println("=================================================");
    Scanner Charname = new Scanner(System.in);
    System.out.println("Please Choose a Class:");
    System.out.println("1.Warrior");
    System.out.println("2.Wizard");
    System.out.println("3.Thief");
    int classname = Charname.nextInt();
    System.out.println("You are a " + classname);
    
    return classname;
  }

  public static String enterName(){
    Scanner Charname = new Scanner(System.in);
    System.out.println("Please enter your name:");
    String name = Charname.next();
    System.out.printf("Hello %s!\n",name);
    return name;
  }
  
}


