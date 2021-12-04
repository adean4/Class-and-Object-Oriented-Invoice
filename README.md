e adean4;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //creating ArrayLists
        ArrayList<String> course = new ArrayList<String>();
        ArrayList<Integer> credits = new ArrayList<Integer>();


        Scanner input = new Scanner(System.in); //input

        course.add("Math");
        credits.add(4);
        course.add("Foreign Language");
        credits.add(3);
        course.add("English");
        credits.add(3);
        course.add("Health");
        credits.add(1);

        String answer = "";
        ArrayList<String> schedule = new ArrayList<String>();

        do {
            System.out.println("What action would you like to complete?          ");
            System.out.println("1) add course 2) change course 3) show courses 4) finish registration");

            answer = input.nextLine();
            if (answer.equals("1"))
            {
                System.out.println("What course would you like to register for?");
                System.out.println("Menu: Math, Foreign Language, English, Health");
                answer = input.nextLine();
                schedule.add(answer);
            }

            else if (answer.equals("2"))
            {
                System.out.println("What course do you want to change?");
                String change = input.nextLine();

                System.out.println("What course do you want to change it with?");
                String changewith = input.nextLine();

                schedule.set(schedule.indexOf(change), changewith);
            }

            else if (answer.equals("3"))
            {
                for(int i = 0; i < schedule.size(); i++)
                {
                    System.out.println(schedule.get(i));
                }
            }
        } while (! answer.equals("4"));


        int totalcredits = 0;
        int j = 0;
        for (int i = 0; i < schedule.size(); i++)
        {
            j=0;
            do {
                if (schedule.get(i).equals(course.get(j)) )
                {
                    totalcredits = totalcredits + credits.get(j);
                }
                j++;
            } while (j < course.size());
        }
        System.out.println("Total Credits: "+totalcredits);
    }
}
