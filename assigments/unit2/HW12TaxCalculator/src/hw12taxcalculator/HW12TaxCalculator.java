package hw12taxcalculator;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuquePáramo
 */
public class HW12TaxCalculator {

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("===============================");
            System.out.println(" ***  IRS Tax Calculator  *** ");
            System.out.println("* 1. -> Value-Added Tax (VAT) *");
            System.out.println("* 2. -> Income Tax            *");
            System.out.println("* 3. -> Currency Outflow Tax  *");
            System.out.println("* 0. -> Exit                  *");
            System.out.println("===============================");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    float subtotalBasicProducts;
                    float subtotalVATProducts;
                    float VATvalue = 0.12F;
                    float finalVAT;

                    System.out.println(" Enter the sum of the first necesity products that you buy ");
                    subtotalBasicProducts = input.nextFloat();

                    System.out.println("You are tax free");

                    System.out.println(" Enter the sum of the non - first necesity products that you buy ");
                    subtotalVATProducts = input.nextFloat();
                    finalVAT = subtotalVATProducts * VATvalue;
                    System.out.println("You must pay $" + finalVAT);

                    break;

                case 2:
                    float salaryMonthly;
                    float salaryYearly;
                    float socialInsureValue;
                    float socialInsurePercent = 0.0945F;
                    float homeDeducible;
                    float dressDeducible;
                    float foodDeducible;
                    float educationDeducible;
                    float healthDeducible;
                    float sumDeducible = 0.0F;
                    float taxBaseImp = 0.0F;
                    float basicFraction = 0.0F;
                    float overBaseTax = 0.0F;
                    float disableDiscount = 0.0F;
                    int disablePercent;
                    float incomeTax = 0.0F;
                    float incomeTaxSubTotal = 0.0F;

                    System.out.println("Are you senior? \n 1. Yes \n 2. No");
                    option = input.nextInt();

                    if (option == 1) {
                        System.out.println("You are tax free");
                        System.exit(0);
                    } else {

                        System.out.println("Enter you handicap grade");
                        disablePercent = input.nextInt();
                        disableDiscount = (float) calculateDisableDiscount(disablePercent, disableDiscount, incomeTaxSubTotal);

                        System.out.println("Enter your Monthly Salary");
                        salaryMonthly = input.nextFloat();

                        socialInsureValue = salaryMonthly * socialInsurePercent;
                        salaryYearly = (salaryMonthly - socialInsureValue) * 12;

                        System.out.println("Your yearly salary is " + salaryYearly);

                        System.out.println("Enter your Home Deucible Total");
                        homeDeducible = input.nextFloat();
                        System.out.println("Enter your Dress Deucible Total");
                        dressDeducible = input.nextFloat();
                        System.out.println("Enter your Food deducible Total");
                        foodDeducible = input.nextFloat();
                        System.out.println("Enter your Education and Culture Deucible Total");
                        educationDeducible = input.nextFloat();
                        System.out.println("Enter your Healt Deucible Total");
                        healthDeducible = input.nextFloat();

                        sumDeducible = (float) (computeHome(homeDeducible) + computeDress(dressDeducible)
                                + computeFood(foodDeducible) + computeEducation(educationDeducible) + computeHealth(healthDeducible));

                        System.out.println("Your deducible total sum is " + computeSumDeducible(sumDeducible));

                        taxBaseImp = (float) (salaryYearly - computeSumDeducible(sumDeducible));

                        System.out.println("Your Tax Base is --> " + taxBaseImp);
                        basicFraction = calculateIncomeTaxBasicFraction(taxBaseImp, (int) basicFraction);
                        System.out.println("Your basic fraction is " + basicFraction);
                        overBaseTax = calculateIncomeTaxOverBase(taxBaseImp, overBaseTax);
                        System.out.println("The value of the Income Tax over base is --> " + overBaseTax);

                        incomeTaxSubTotal = basicFraction + overBaseTax;
                        incomeTax = incomeTaxSubTotal - calculateDisableDiscount(disablePercent, disableDiscount, incomeTaxSubTotal);
                        System.out.println("Your discount value is $" + calculateDisableDiscount(disablePercent, disableDiscount, incomeTaxSubTotal));
                        System.out.println("You final value to pay  is $" + incomeTax);
                    }
                    break;

                case 3:
                    do {
                        System.out.println("You chose option: 3 --> Currency Outflow Tax \n Please choose a case");
                        System.out.println("1. Travel Abroad \n 2.Shopping in the exterior \n 3. Exit");
                        option = input.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("You chose option: 3 --> Currency Outflow Tax \n Case 1: Travel Abroad");
                                int taxBase = 1200;
                                float taxValue = 0.05F;
                                float moneyTaxApplied;
                                float totalMoney;
                                float finalTaxValue;

                                System.out.println("Please, enter the amount of money which you travel abroad");
                                totalMoney = input.nextFloat();

                                finalTaxValue = calculateCurrencyOutflowTax(totalMoney, taxBase, taxValue);
                                System.out.println("You must pay --> " + " $"
                                        + finalTaxValue);
                                break;
                            case 2:
                                System.out.println("You chose option: 3 --> Capital Exit Tax \n Case 2: Shopping in the exterior");
                                float taxBase2 = 5017.32F;
                                float taxValue2 = 0.05F;
                                float moneyTaxApplied2;
                                float totalMoney2;
                                float finalTaxValue2 = 0.0F;

                                System.out.println("Please, enter the amount of money which you spend in the exterior for a whole year");
                                totalMoney2 = input.nextFloat();

                                finalTaxValue2 = calculateCurrencyOutflowTax2(totalMoney2, taxBase2, finalTaxValue2);
                                System.out.println("You must pay --> " + " $"
                                        + finalTaxValue2);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (option != 3);
                    break;

                case 0:
                    System.out.println("Thnks for using my software \n Good Bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 0);
    }

    public static float calculateDisableDiscount(int disablePercent, float disableDiscuount, float incomeTaxSubTotal) {

        if (disablePercent <= 30) {
            disableDiscuount = (float) (0 * incomeTaxSubTotal);
            return disableDiscuount;
        } else {
            if (disablePercent <= 50) {
                disableDiscuount = (float) (0.60 * incomeTaxSubTotal);
                return disableDiscuount;
            } else {
                if (disablePercent <= 75) {
                    disableDiscuount = (float) (0.70 * incomeTaxSubTotal);
                    return disableDiscuount;
                } else {
                    if (disablePercent <= 85) {
                        disableDiscuount = (float) (0.80 * incomeTaxSubTotal);
                    } else {
                        if (disablePercent <= 100) {
                            disableDiscuount = (float) (1 * incomeTaxSubTotal);
                            return incomeTaxSubTotal;
                        }

                    }
                }
            }
            return disableDiscuount;
        }
    }

    public static double computeHome(float homeDeducible) {
        if (homeDeducible > 3643.90) {
            return 3643.9;
        } else {
            return homeDeducible;
        }
    }

    public static double computeDress(float dressDeducible) {
        if (dressDeducible > 3643.90) {
            return 3643.9;
        } else {
            return dressDeducible;
        }
    }

    public static double computeFood(float foodDeducible) {
        if (foodDeducible > 3643.90) {
            return 3643.9;
        } else {
            return foodDeducible;
        }
    }

    public static double computeEducation(float educationDeducible) {
        if (educationDeducible > 3643.90) {
            return 3643.9;
        } else {
            return educationDeducible;
        }
    }

    public static double computeHealth(float healthDeducible) {
        if (healthDeducible > 14575.60) {
            return 14575.60;
        } else {
            return healthDeducible;
        }
    }

    public static double computeSumDeducible(float sumDeducible) {
        if (sumDeducible > 14575.60) {
            return 14575.60;
        } else {
            return sumDeducible;
        }
    }

    public static float calculateCurrencyOutflowTax2(float totalMoney2, float taxBase2, float exitTax2) {
        float moneyTaxApplied;
        float exitTax;
        float taxValue2 = 0.05F;

        if (totalMoney2 > taxBase2) {
            moneyTaxApplied = (float) (totalMoney2 - taxBase2);
            exitTax = (float) (moneyTaxApplied * taxValue2);
            return exitTax;
        } else {
            return 0;
        }
    }

    public static float calculateCurrencyOutflowTax(float totalMoney, int taxBase, float taxValue) {

        float moneyTaxApplied;
        float finalTaxValue;

        if (totalMoney > taxBase) {
            moneyTaxApplied = (float) (totalMoney - taxBase);
            finalTaxValue = (float) (moneyTaxApplied * taxValue);
            return finalTaxValue;
        } else {
            return 0;
        }
    }

    public static int calculateIncomeTaxBasicFraction(float taxBaseImp, int basicFraction) {
        if (taxBaseImp < 11212) {
            return 0;
        } else {
            if (taxBaseImp < 14285) {
                return 0;
            } else {
                if (taxBaseImp < 17854) {
                    return 154;
                } else {
                    if (taxBaseImp < 21442) {
                        return 511;
                    } else {
                        if (taxBaseImp < 42874) {
                            return 64297;
                        } else {
                            if (taxBaseImp < 64297) {
                                return 4156;
                            } else {
                                if (taxBaseImp < 85729) {
                                    return 8440;
                                } else {
                                    if (taxBaseImp < 144288) {
                                        return 13798;
                                    } else {
                                        if (taxBaseImp > 144288) {
                                            return 22366;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return basicFraction;
    }

    public static float calculateIncomeTaxOverBase(float taxBaseImp, float overBaseTax) {
        if (taxBaseImp < 11212) {
            return 0;
        } else {
            if (taxBaseImp < 14285) {
                return (float) ((taxBaseImp - 11212) * 0.05);
            } else {
                if (taxBaseImp < 17854) {
                    return (float) ((taxBaseImp - 14285) * 0.10);
                } else {
                    if (taxBaseImp < 21442) {
                        return (float) ((taxBaseImp - 17854) * 0.12);
                    } else {
                        if (taxBaseImp < 42874) {
                            return (float) ((taxBaseImp - 21442) * 0.15);
                        } else {
                            if (taxBaseImp < 64297) {
                                return (float) ((taxBaseImp - 42874) * 0.20);
                            } else {
                                if (taxBaseImp < 85729) {
                                    return (float) ((taxBaseImp - 64297) * 0.25);
                                } else {
                                    if (taxBaseImp < 144288) {
                                        return (float) ((taxBaseImp - 85729) * 0.30);
                                    } else {
                                        if (taxBaseImp > 144288) {
                                            return (float) ((taxBaseImp - 144288) * 0.35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return overBaseTax;
    }
}
