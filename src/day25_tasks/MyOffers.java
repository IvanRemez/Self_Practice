package day25_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer("Miami, FL","Sony","Java SDET",90000,true,
                true,true,true);
        Offer offer2 = new Offer("Chicago, IL","Duolingo","Java Developer",130000,
                false,true,true,false);
        Offer offer3 = new Offer("Austin, TX","Nvidia","SDET",120000,true,
                true,true,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println("---------------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        System.out.println(fullTimeOffers);

        fullTimeOffers.removeIf(p -> !p.isFullTime);

        System.out.println(fullTimeOffers);
        System.out.println("---------------------------------------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> p.location.equalsIgnoreCase("miami, fl"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> !p.hasBenefit || !p.hasPTO);
        System.out.println(offersWithBenefits);


        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p -> !p.jobTitle.contains("Developer"));
        System.out.println(devOffers);

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p -> p.salary < 100000);
        System.out.println(offersWith100K);




    }
}
/*
Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */