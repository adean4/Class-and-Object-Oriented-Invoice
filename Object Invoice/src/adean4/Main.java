package adean4;

import java.util.ArrayList;
import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {

                ArrayList<String> candy = new ArrayList<String>();



                Scanner input = new Scanner(System.in);

                candy.add("Twix");
                candy.add("Almond Joy");
                candy.add("Kit-Kat");
                candy.add("Snickers");


                String answer = "";
                ArrayList<String> selections = new ArrayList<String>();

                do {
                    System.out.println("Trick of Treat Simulation: What action would you like to complete?          ");
                    System.out.println("1) choose a piece of candy 2) change selection 3) show selected candy 4) finish selecting");

                    answer = input.nextLine();
                    if (answer.equals("1")) {
                        System.out.println("What piece of Halloween candy would you like to add to your bag?");
                        System.out.println("Select from these options: Twix, Almond Joy, Kit-Kat, Snickers");
                        answer = input.nextLine();
                        selections.add(answer);
                    } else if (answer.equals("2")) {
                        System.out.println("What candy do you want to trade?");
                        String change = input.nextLine();

                        System.out.println("What do you want to trade for?");
                        String changewith = input.nextLine();

                        selections.set(selections.indexOf(change), changewith);
                    } else if (answer.equals("3")) {
                        for (int i = 0; i < selections.size(); i++) {
                            System.out.println(selections.get(i));
                        }
                    }
                } while (!answer.equals("4"));
                {

                    System.out.println("Neighbor: Your costume looks great!");
                    for (int i = 0; i < selections.size(); i++)
                    System.out.println("Enjoy your " + selections.get(i));


                }
            }
        }