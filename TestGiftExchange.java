package HomeWorks.Homework12;

public class TestGiftExchange {
    public static void main(String[] args) {
        GiftExchange e = new GiftExchange();
        ChristmasAttendees firstPerson = new ChristmasAttendees();
        ChristmasAttendees secondPerson = new ChristmasAttendees();
        firstPerson.name ="Joseph";
        secondPerson.name="Miranda";
        firstPerson.giftName = "perfume";
        secondPerson.giftName = "purse";
        e.GiftExchange(firstPerson,secondPerson);
        System.out.println(firstPerson.giftName);
        System.out.println(secondPerson.giftName);
        e.GiftExchange(firstPerson,secondPerson);
        ChristmasAttendees thirdAttendee = new ChristmasAttendees();
        thirdAttendee.name ="John";
        thirdAttendee.giftName = "cups";
        e.UpdateGift("shirt", thirdAttendee);
        System.out.println(thirdAttendee.giftName);



        // After using static import I will be able use every static variables in the class that I imported.
// I can call the static variables with just by their name.
// import static packageName.className.variableName; // it is going to import only one variables in that class
// import static packageName.className.*; // you'll be able to call every static variable and method.

    }


}
