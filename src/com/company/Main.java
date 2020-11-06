package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        PoliceCar PoliceCar = new PoliceCar();
        FireEngine FireEngine = new FireEngine();
        Taxi Taxi = new Taxi();
        Bus bus = new Bus();
        do {
            System.out.println("Enter what do you want to do:" + "\n1 - Add person" + "\n2 - Remove person from car" +
                    "\n3 - Get capacity" + "\n4 - Get quantity" + "\n0 - Exit");
            int wtd=inInt.nextInt();
            switch (wtd)
            {
                case 0:
                {
                    return;
                }
                case 1:
                {
                    System.out.println("Enter who do you want to add:" + "\n1 - Add policeman" +
                            "\n2 - Add firefighter" + "\n3 - Add person" + "\n0 - Exit");
                    int wtd1=inInt.nextInt();
                    switch (wtd1)
                    {
                        case 0:
                            break;
                        case 1:
                        {
                            System.out.println("Enter policeman name:");
                            Policeman cop = new Policeman(inStr.nextLine());
                            System.out.println("Enter where do you want to add him(PoliceCar/FireEngine/Taxi/Bus):");
                            String car = inStr.nextLine();
                            if (car.equals("PoliceCar")) PoliceCar.AddPass(cop);
                            else if (car.equals("FireEngine")) System.out.println("You have no permission");
                            else if (car.equals("Taxi")) Taxi.AddPass(cop);
                            else if (car.equals("Bus")) bus.AddPass(cop);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter firefighter name:");
                            Firefighter cop = new Firefighter(inStr.nextLine());
                            System.out.println("Enter where do you want to add him(PoliceCar/FireEngine/Taxi/Bus):");
                            String car = inStr.nextLine();
                            if (car.equals("PoliceCar")) System.out.println("You have no permission");
                            else if (car.equals("FireEngine")) FireEngine.AddPass(cop);
                            else if (car.equals("Taxi")) Taxi.AddPass(cop);
                            else if (car.equals("Bus")) bus.AddPass(cop);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter person name:");
                            Person cop = new Person(inStr.nextLine());
                            System.out.println("Enter where do you want to add him(PoliceCar/FireEngine/Taxi/Bus):");
                            String car = inStr.nextLine();
                            if (car.equals("PoliceCar")) System.out.println("You have no permission");
                            else if (car.equals("FireEngine")) System.out.println("You have no permission");
                            else if (car.equals("Taxi")) Taxi.AddPass(cop);
                            else if (car.equals("Bus")) bus.AddPass(cop);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter where from do you want to delete person(PoliceCar/FireEngine/Taxi/Bus):");
                    String car = inStr.nextLine();
                    System.out.println("Enter name:");
                    String name = inStr.nextLine();
                    if (car.equals("PoliceCar")) PoliceCar.RemovePass(name);
                    else if (car.equals("FireEngine")) FireEngine.RemovePass(name);
                    else if (car.equals("Taxi")) Taxi.RemovePass(name);
                    else if (car.equals("Bus")) bus.RemovePass(name);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter where from do you want to get capacity(PoliceCar/FireEngine/Taxi/Bus):");
                    String car = inStr.nextLine();
                    if (car.equals("PoliceCar")) System.out.println(PoliceCar.getCapacity());
                    else if (car.equals("FireEngine")) System.out.println(FireEngine.getCapacity());
                    else if (car.equals("Taxi")) System.out.println(Taxi.getCapacity());
                    else if (car.equals("Bus")) System.out.println(bus.getCapacity());
                    break;
                }
                case 4:
                {
                    System.out.println("Enter where from do you want to get quantity(PoliceCar/FireEngine/Taxi/Bus):");
                    String car = inStr.nextLine();
                    if (car.equals("PoliceCar")) System.out.println(PoliceCar.getQuantity());
                    else if (car.equals("FireEngine")) System.out.println(FireEngine.getQuantity());
                    else if (car.equals("Taxi")) System.out.println(Taxi.getQuantity());
                    else if (car.equals("Bus")) System.out.println(bus.getQuantity());
                    break;
                }
                default:
                    break;
            }
        } while (true);
    }
}
