package AIM;
import java.net.Authenticator;
import java.sql.*;
import java.util.*;
import java.io.*;
import Map.*;

public class Main {

    public static void line() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) throws SQLException, IOException {

        Authentication A1 = new Authentication();
        Commando C1 = new Commando();
        Inventory I1 = new Inventory();
        Diary D1 = new Diary();
        FindShortestPath F1 = new FindShortestPath();
        int x = 0;
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("\n" +
                "                                                                                    \n" +
                "                                                                                    \n" +
                "               AAA                    IIIIIIIIII     MMMMMMMM               MMMMMMMM\n" +
                "              A:::A                   I::::::::I     M:::::::M             M:::::::M\n" +
                "             A:::::A                  I::::::::I     M::::::::M           M::::::::M\n" +
                "            A:::::::A                 II::::::II     M:::::::::M         M:::::::::M\n" +
                "           A:::::::::A                  I::::I       M::::::::::M       M::::::::::M\n" +
                "          A:::::A:::::A                 I::::I       M:::::::::::M     M:::::::::::M\n" +
                "         A:::::A A:::::A                I::::I       M:::::::M::::M   M::::M:::::::M\n" +
                "        A:::::A   A:::::A               I::::I       M::::::M M::::M M::::M M::::::M\n" +
                "       A:::::A     A:::::A              I::::I       M::::::M  M::::M::::M  M::::::M\n" +
                "      A:::::AAAAAAAAA:::::A             I::::I       M::::::M   M:::::::M   M::::::M\n" +
                "     A:::::::::::::::::::::A            I::::I       M::::::M    M:::::M    M::::::M\n" +
                "    A:::::AAAAAAAAAAAAA:::::A           I::::I       M::::::M     MMMMM     M::::::M\n" +
                "   A:::::A             A:::::A        II::::::II     M::::::M               M::::::M\n" +
                "  A:::::A               A:::::A       I::::::::I     M::::::M               M::::::M\n" +
                " A:::::A                 A:::::A      I::::::::I     M::::::M               M::::::M\n" +
                "AAAAAAA                   AAAAAAA     IIIIIIIIII     MMMMMMMM               MMMMMMMM\n" +
                "                                                                                    \n" +
                "                                                                                    \n" +
                "                                                                                    \n" + "");

        System.out.printf("********************************* WELCOME TO AIR DROP MANAGEMENT SYSTEM ***********************************\n\n");

        String name;
        String ID;
        do {
            System.out.print("Enter your ID:- ");
            ID = d.readLine();
            System.out.print("Enter your password:- ");
            name = d.readLine();
        } while (!A1.isAuthentication(ID, name));

        System.out.println("Authentication Successful...");

        line();

        PrintTables table = new PrintTables();

        table.P_Tables();

        char temp = 'Y';

        do {

            System.out.println("Enter\n\t1.Inventory\n\t2.Maps\n\t3.To exit");
            System.out.print("Enter the number:- ");
            int num = in.nextInt();

            switch (num) {
                case 1: {
                    char Is_Continue = 'Y';
                    do {
                        int flag = 0;
                        line();
                        System.out.println(
                                "Enter\n\t1.To Request Items\n\t2.To see Updated Tables\n\t3.Search Item\n\t4.Search by Quantity\n\t5.To send a message\n\t6.For Maps");
                        System.out.print("Enter the number:- ");

                        int a = in.nextInt();
                        line();

                        switch (a) {
                            case 1: {
                                line();
                                System.out.println("Enter \n\t1.Food Items\n\t2.Ammunition\n\t3.Clothes");
                                System.out.print("Enter the number:- ");

                                int item = in.nextInt();

                                switch (item) {
                                    case 1:
                                        line();
                                        System.out.println(
                                                "Enter the Food item\n\t1.Rice\n\t2.Potato\n\t3.Carrots\n\t4.Tomato\n\t5.Wheat flour\n\t6.Lentils\n\t7.Sugar\n\t8.Tea\n\t9.Chicken\n\t10.Salt");
                                        System.out.print("Enter the number:- ");
                                        int food = in.nextInt();
                                        System.out.print("Enter the Quantity:- ");
                                        int quantity = in.nextInt();

                                        switch (food) {
                                            case 1:

                                                C1.DeleteFood("Rice", quantity);
                                                break;

                                            case 2:
                                                C1.DeleteFood("Potato", quantity);
                                                break;

                                            case 3:
                                                C1.DeleteFood("Carrots", quantity);
                                                break;

                                            case 4:
                                                C1.DeleteFood("Tomato", quantity);
                                                break;

                                            case 5:
                                                C1.DeleteFood("Wheat flour", quantity);
                                                break;

                                            case 6:
                                                C1.DeleteFood("Lentils", quantity);
                                                break;

                                            case 7:
                                                C1.DeleteFood("Sugar", quantity);
                                                break;

                                            case 8:
                                                C1.DeleteFood("Tea", quantity);
                                                break;

                                            case 9:
                                                C1.DeleteFood("Chicken", quantity);
                                                break;

                                            case 10:
                                                C1.DeleteFood("Salt", quantity);
                                                break;

                                            default:
                                                break;
                                        }

                                        break;

                                    case 2:

                                        line();
                                        System.out.println(
                                                "Enter\n\t1.Small Barrel Gun\n\t2.AK 47\n\t3.AK 46\n\t4.Sniper\n\t5.Grenade\n\t6.SBG Bullets\n\t7.Sniper Bullets");
                                        System.out.print("Enter the number:- ");
                                        int option = in.nextInt();

                                        System.out.print("Enter quantity:- ");
                                        int Quant = in.nextInt();
                                        switch (option) {
                                            case 1:
                                                C1.DeleteAmmunitions("Small Barrel Gun", Quant);
                                                break;
                                            case 2:
                                                C1.DeleteAmmunitions("AK 47", Quant);
                                                break;
                                            case 3:
                                                C1.DeleteAmmunitions("AK 46", Quant);
                                                break;
                                            case 4:
                                                C1.DeleteAmmunitions("Sniper", Quant);
                                                break;
                                            case 5:
                                                C1.DeleteAmmunitions("Grenade", Quant);
                                                break;
                                            case 6:
                                                C1.DeleteAmmunitions(" SBG Bullets", Quant);
                                                break;
                                            case 7:
                                                C1.DeleteAmmunitions("AK 46 Bullets", Quant);
                                                break;
                                            case 8:
                                                C1.DeleteAmmunitions("Sniper Bullets", Quant);
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    case 3:

                                        line();
                                        System.out.println(
                                                "Enter\n\t1.Uniform\n\t2.Shoes\n\t3.Gloves\n\t4.Bullet Proof Jackets\n\t5.Night Vision Goggles");
                                        System.out.print("Enter the number:- ");
                                        int option1 = in.nextInt();

                                        System.out.print("Enter quantity:- ");
                                        int Quant1 = in.nextInt();
                                        switch (option1) {
                                            case 1:
                                                C1.DeleteClothes("Uniform", Quant1);
                                                break;
                                            case 2:
                                                C1.DeleteClothes("Shoes", Quant1);
                                                break;
                                            case 3:
                                                C1.DeleteClothes("Gloves", Quant1);
                                                break;
                                            case 4:
                                                C1.DeleteClothes("Bullet Proof Jackets", Quant1);
                                                break;
                                            case 5:
                                                C1.DeleteClothes("Night Vision Goggles", Quant1);
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 2: {

                                line();
                                System.out.println("Enter\n\t1.Foods\n\t2.Clothes\n\t3.Ammunition's");
                                line();
                                System.out.print("Enter the number:- ");
                                int str = in.nextInt();

                                switch (str) {
                                    case 1:
                                        C1.UpdateFood();
                                        break;
                                    case 2:
                                        C1.UpdateClothes();
                                        break;
                                    case 3:
                                        C1.UpdateAmmunitions();
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 3: {
                                line();
                                System.out.println("Enter\n\t1.Search In Food\n\t2.Search In Clothes\n\t3.Search In Ammunitions");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                System.out.print("Enter Item Name:- ");
                                String item = d.readLine();
                                switch (opt) {
                                    case 1: {
                                        if (C1.SearchByFoodItem(item))
                                            System.out.println(item + " is Present");
                                        else
                                            System.out.println(item + " is not Present");
                                        break;
                                    }
                                    case 2: {
                                        if (C1.SearchByClothes(item))
                                            System.out.println(item + " is Present");
                                        else
                                            System.out.println(item + " is not Present");
                                        break;
                                    }
                                    case 3: {
                                        if (C1.SearchByAmmunitions(item))
                                            System.out.println(item + " is Present");
                                        else
                                            System.out.println(item + " is not Present");
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 4: {

                                System.out.print("Enter the Quantity to search:- ");
                                int qua = in.nextInt();
                                System.out.println("This is the list of items having quantity less than "+qua+" : ");
                                C1.SearchByQuantity(qua);
                                break;
                            }
                            case 5: {
                                line();
                                System.out.print("Enter the message to send:- ");
                                String text1 = d.readLine();
                                int encrypt[];
                                String result;
                                encrypt = C1.encryption(text1);
                                result = I1.decryption(encrypt);
                                System.out.println("Text after decryption is : " + result);
                                break;

                            }
                            case 6: {
                                flag = 1;
                                Is_Continue = 'N';
                                break;
                            }
                            default:
                                break;

                        }
                        if (flag == 0) {
                            System.out.print("Do you want to continue, enter Y/N:- ");
                            Is_Continue = in.next().charAt(0);

                        }


                    } while (Is_Continue == 'Y' || Is_Continue == 'y');

                }

                case 2: {

                    char runAgain = 'Y';
                    basicmap enemy = new enemyhotspot();
                    basicmap ebase = new enemybase();
                    basicmap safelocation = new safelocation();
                    basicmap electricity = new electricpower();
                    basicmap f = new fuel();
                    basicmap water = new waterresources();
                    airdrop adp = new airdrop();
                    time t = new time();

                    System.out.println("Enter latitude and longitude of the troop location:- ");
                    int tlati = in.nextInt();
                    int tlongi = in.nextInt();
                    location troop = new location(tlati, tlongi);
                    int elati, elongi, radius;
                    location l = new location();

                    do {
                        int flag = 0;
                        line();
                        System.out.println("Enter\n\t1.Enemy Hotspot\n\t2.Safe Locations\n\t3.Electricity\n\t4.Fuel\n\t5.Water\n\t6.Package\n\t7.Attacking Enemies\n\t8.Diary\n\t9.Enemy Base\n\t10.For exit");
                        System.out.print("Enter the number:- ");

                        int select = in.nextInt();
                        line();

                        switch (select) {
                            case 1: {
                                line();
                                System.out.println("Enter\n\t1.Update Enemy Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.println("Enter latitude and longitude of the enemy location:- ");
                                        elati = in.nextInt();
                                        elongi = in.nextInt();
                                        System.out.println("Enter radius:- ");
                                        radius = in.nextInt();
                                        l = new location(elati, elongi);
                                        enemy.setlocation(l, radius);
                                        enemy.printmap();
                                        break;
                                    }
                                    case 2: {
                                        enemy.printmap();
                                        break;
                                    }
                                    case 3: {
                                        enemy.localmap(l);
                                        break;
                                    }
                                    case 4: {
                                        l = enemy.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                line();
                                System.out.println("Enter\n\t1.Update Safe Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.println("Enter radius:- ");
                                        int r = in.nextInt();
                                        safelocation.setlocation(troop, r);
                                        safelocation.printmap();
                                        break;
                                    }
                                    case 2: {
                                        safelocation.printmap();
                                        break;
                                    }
                                    case 3: {
                                        safelocation.localmap(troop);
                                        break;
                                    }
                                    case 4: {
                                        l = safelocation.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 3: {
                                line();
                                System.out.println("Enter\n\t1.Update Electricity Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.print("Enter radius:- ");
                                        int r = in.nextInt();
                                        electricity.setlocation(troop, r);
                                        electricity.printmap();
                                        break;
                                    }
                                    case 2: {
                                        electricity.printmap();
                                        break;
                                    }
                                    case 3: {
                                        electricity.localmap(troop);
                                        break;
                                    }
                                    case 4: {
                                        l = electricity.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 4: {
                                line();
                                System.out.println("Enter\n\t1.Update Fuel Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.print("Enter radius:- ");
                                        int r = in.nextInt();
                                        f.setlocation(troop, r);
                                        f.printmap();
                                        break;
                                    }
                                    case 2: {
                                        f.printmap();
                                        break;
                                    }
                                    case 3: {
                                        f.localmap(troop);
                                        break;
                                    }
                                    case 4: {
                                        l = f.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 5: {
                                line();
                                System.out.println("Enter\n\t1.Update Water Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.print("Enter radius:- ");
                                        int r = in.nextInt();
                                        water.setlocation(troop, r);
                                        water.printmap();
                                        break;
                                    }
                                    case 2: {
                                        water.printmap();
                                        break;
                                    }
                                    case 3: {
                                        water.localmap(troop);
                                        break;
                                    }
                                    case 4: {
                                        l = water.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 6: {
                                adp.airdroptt(troop);
                                break;
                            }

                            case 7: {
                                line();
                                System.out.println("Enter\n\t1.Air Strike\n\t2.Get Distance From Home Base\n\t3.Get the shortest distances from Main base and safe locations");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        Bombs B1 = new Bombs();
                                        System.out.println("Enter latitude and longitude of the new / old enemy location:- ");
                                        elati = in.nextInt();
                                        elongi = in.nextInt();
                                        System.out.println("Enter radius:- ");
                                        radius = in.nextInt();
                                        l = new location(elati, elongi);
                                        enemy.removelocation(l, radius);
                                        B1.getBomb(radius);
                                        break;
                                    }
                                    case 2: {
                                        Resque R1 = new Resque();
                                        System.out.println("Enter the Co-Ordinates:-");
                                        System.out.print("Enter the X-Co_ord:- ");
                                        int X = in.nextInt();
                                        System.out.print("Enter the Y-Co_ord:- ");
                                        int Y = in.nextInt();
                                        R1.getDistance(X, Y);
                                        break;
                                    }
                                    case 3: {

                                        System.out.println("The distance's between the BASE and Safe Locations:-");
                                        int V = 8;
                                        ArrayList<ArrayList<FindShortestPath.AdjListNode>> graph
                                                = new ArrayList<>();
                                        for (int i = 0; i < V; i++) {
                                            graph.add(new ArrayList<>());
                                        }
                                        int source = 0;
                                        graph.get(0).add(new FindShortestPath.AdjListNode(1, 40));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(2, 35));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(3, 26));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(4, 15));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(5, 21));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(6, 31));
                                        graph.get(0).add(new FindShortestPath.AdjListNode(7, 19));
                                        graph.get(1).add(new FindShortestPath.AdjListNode(4, 44));
                                        graph.get(1).add(new FindShortestPath.AdjListNode(6, 67));
                                        graph.get(2).add(new FindShortestPath.AdjListNode(6, 58));
                                        graph.get(2).add(new FindShortestPath.AdjListNode(5, 48));
                                        graph.get(3).add(new FindShortestPath.AdjListNode(5, 39));
                                        graph.get(3).add(new FindShortestPath.AdjListNode(7, 37));
                                        graph.get(4).add(new FindShortestPath.AdjListNode(7, 18));

                                        int[] distance = F1.dijkstra(V, graph, source);

                                        System.out.println(" Drop Points"
                                                + " Minimum Distance (km)");
                                        for (int i = 0; i < V; i++) {
                                            System.out.println(i + "			 "
                                                    + distance[i]);
                                        }
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }

                            case 8: {
                                System.out.println("Enter\n\t1.To Enter in the diary\n\t2.To View Diary");
                                System.out.print("Enter the number:- ");
                                int choice = in.nextInt();
                                switch (choice) {
                                    case 1: {
                                        System.out.println("Write the contents in the Diary:");
                                        D1.DiaryNote();
                                        break;
                                    }

                                    case 2: {
                                        D1.getDiary();
                                        break;
                                    }
                                    default:
                                        break;

                                }
                                break;
                            }

                            case 9: {
                                line();
                                System.out.println("Enter\n\t1.Update Enemy Location\n\t2.Print Map\n\t3.Local Map\n\t4.Find Nearest Location");
                                System.out.print("Enter the number:- ");
                                int opt = in.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.println("Enter latitude and longitude of the enemy location:- ");
                                        elati = in.nextInt();
                                        elongi = in.nextInt();
                                        System.out.println("Enter radius:- ");
                                        radius = in.nextInt();
                                        l = new location(elati, elongi);
                                        ebase.setlocation(l, radius);
                                        ebase.printmap();
                                        break;
                                    }
                                    case 2: {
                                        ebase.printmap();
                                        break;
                                    }
                                    case 3: {
                                        ebase.localmap(l);
                                        break;
                                    }
                                    case 4: {
                                        l = ebase.nearestlocation(troop);
                                        l.printlocation();
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case 10: {
                                flag = 1;
                                runAgain = 'N';
                                break;
                            }
                        }
                        if (flag == 0) {
                            System.out.print("Do you want to continue, enter Y/N:- ");
                            runAgain = in.next().charAt(0);
                        }

                    } while (runAgain == 'Y' || runAgain == 'y');
                    break;

                }
                case 3: {
                    x = 1;
                    temp = 'N';
                    break;
                }
                default:
                    break;
            }
            if (x == 0) {
                System.out.print("Do you want to continue, enter Y/N:- ");
                temp = in.next().charAt(0);
            }

        } while (temp == 'Y' || temp == 'y');
    }
}