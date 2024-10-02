import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your player name!");
        String name = sc.nextLine();
        Player p1 = new Player(name, 1);

        System.out.println("Player name is "+ p1.name + " with the level of "+ p1.level);

        Monster m1 = new Monster("Ypsilon", 1);
        Monster m2 = new Monster("Bub", 2);

    }
    public static void Fight(Player p1, Monster m1, Monster m2) {

        System.out.println("Starting fight!");
        System.out.println("First opponent " + m1.name + " with the level of " + m1.level);
        if (p1.level >= m1.level) {
            System.out.println(p1.name + " has won!");
            int level = p1.level++;
        }
    }
}
