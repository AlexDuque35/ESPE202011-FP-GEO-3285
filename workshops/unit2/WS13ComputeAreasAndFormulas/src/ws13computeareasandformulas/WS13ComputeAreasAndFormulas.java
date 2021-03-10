package ws13computeareasandformulas;

import java.util.Scanner;

/**
 *
 * @author AlexandrDuquePáramo
 */
public class WS13ComputeAreasAndFormulas {

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("Author: AlexanderDuque");
            System.out.println("==============================");
            System.out.println("   || MEGA PRO V2 CALC ||    ");
            System.out.println(" 1. Geometric Shapes Calc");
            System.out.println(" 2. Physics Equations ");
            System.out.println(" 3. Press 0 to exit");
            System.out.println("==============================");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    do {
                        System.out.println("Choose a geometic shape \n 1. Circle \n 2. Triangle \n 3. Dodecaegon \n 4. Return");
                        option = input.nextInt();
                        switch (option) {
                            case 1:
                                float circleArea = 0.0F;
                                float radius;
                                System.out.println("Enter the radius");
                                radius = input.nextInt();

                                circleArea = computeCircleArea(radius, circleArea);

                                System.out.println("The area of the circle with radius " + radius + " is equal to --> " + circleArea);
                                break;
                            case 2:
                                float triangleArea = 0.0F;
                                float base;
                                float height;

                                System.out.println("Enter the base");
                                base = input.nextInt();
                                System.out.println("Enter the height");
                                height = input.nextInt();

                                triangleArea = computeTriangleArea(base, height, triangleArea);

                                System.out.println("The area of the triangle with base " + base + " and height " + height + " is equal to --> " + triangleArea);
                                break;
                            case 3:
                                float dodecaegonArea = 0.0F;
                                float sideLenght;
                                float aphothem = 0.0F;

                                System.out.println("Enter the side lenght");
                                sideLenght = input.nextInt();

                                dodecaegonArea = (float) computedodecaegonArea(aphothem, sideLenght, dodecaegonArea);
                                System.out.println("The area of the dodecaegon of " + sideLenght + "u side " + " is equal to --> " + dodecaegonArea + " u^2 ");
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (option != 4);
                    break;
                case 2:
                    System.out.println("Choose one physic equation \n 1. Force \n 2. Enery \n 3. Density \n 4. Return home ");
                    option = input.nextInt();
                    do {
                        switch (option) {
                            case 1:
                                float force = 0.0F;
                                float mass;
                                float aceleration;
                                System.out.println("Enter the object mass");
                                mass = input.nextInt();
                                System.out.println("Enter the object accelartion");
                                aceleration = input.nextInt();

                                force = computeForce(mass, aceleration);

                                System.out.println("The force is equal to --> " + force);
                                break;
                            case 2:
                                float massC;
                                float lightSpeed = 299792458F;
                                float energy = 0.0F;

                                System.out.println("Enter the object mass");
                                massC = input.nextInt();

                                energy = computeEnergy(massC, lightSpeed);

                                System.out.println("The energy is equal to --> " + energy);
                                break;
                            case 3:
                                float density = 0.0F;
                                float massD;
                                float volume;
                                System.out.println("Enter the object mass");
                                massD = input.nextInt();
                                System.out.println("Enter the volume");
                                volume = input.nextInt();
                                density = massD / volume;
                                System.out.println("The density is equal to --> " + density);
                                break;
                        }
                    } while (option != 4);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                case 0:
                    System.out.println("Thnks for using my software \n Good Bye");
                    System.exit(0);
                    break;
            }
        } while (option != 0);
    }

    public static float computeEnergy(float massC, float lightSpeed) {
        float energy;
        energy = massC * (lightSpeed * lightSpeed);
        return energy;
    }

    public static float computeForce(float mass, float aceleration) {
        float force;
        force = mass * aceleration;
        return force;
    }

    public static float computeCircleArea(float radius, float circleArea) {

        circleArea = (float) (Math.PI * (radius * radius));
        return circleArea;
    }

    public static float computeTriangleArea(float base, float height, float traingleArea) {

        traingleArea = (float) ((base * height) / 2);
        return traingleArea;
    }

    public static double computedodecaegonArea(float aphothem, float sideLenght, float dodecaegonArea) {

        float angle;
        angle = (float) Math.tan(18);

        aphothem = (float) (sideLenght / (2 * angle));
        dodecaegonArea = (float) (6 * aphothem * sideLenght);
        return dodecaegonArea;
    }
}
