package collection_and_multithreding_and_file_handling;
import java.util.*;

/*
 Q6. WAP to Create Player class with fields id, name, and salary.
 Store 5 player data in ArrayList and sort the player data by id
 using the Comparable interface (manually without Collections.sort()).
*/

class Player implements Comparable<Player> {
    int id;
    String name;
    double sal;

    public Player(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public Player() {}

    @Override
    public int compareTo(Player p) {
        return this.id - p.id; 
    }

    @Override
    public String toString() {
        return "Player id=" + id + ", name=" + name + ", salary=" + sal ;
    }
}

public class Q6_WAP_to_Create_Player_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Player> al = new ArrayList<>();

        System.out.println("Enter Size Of ArrayList:");
        int size = s.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Id:");
            int id = s.nextInt();
            s.nextLine(); 

            System.out.println("Enter Name:");
            String name = s.nextLine();

            System.out.println("Enter Salary:");
            double sal = s.nextDouble();

            Player play = new Player(id, name, sal);
            al.add(play);
        }

       
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).compareTo(al.get(j)) > 0) {
                    
                    Player temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }

        
        System.out.println("\nSorted Players by ID:");
        for (Player p : al) {
            System.out.println(p);
        }

        s.close();
    }
}
