package HomeWorks.Homework12;

public class GiftExchange {
    /*
    1. Create giftExchange method which will accept two ChristMasAttendees objects as parameters and will
    exchange their gifts and will have no return. If one of those people does not have a gift,
    then do not exchange their gifts.

    For Instance:
Object 1:
name -> "John"
giftName -> "Photo Frame"
Object 2:
name -> "Kate"
giftName -> "Computer Keyboard"


2. Create updateGift method which will accept two parameters ChristmasAttendees object and String
newGift and will set newGift value to gift variable of ChristmasAttendees object.
     */


    public void GiftExchange(ChristmasAttendees attendees, ChristmasAttendees attendees1) {
        if (attendees.giftName == null || attendees1.giftName == null) {
        } else {
            String temp = attendees.giftName;
            attendees.giftName = attendees1.giftName;
            attendees1.giftName = temp;
        }
    }

    public static void UpdateGift(String newGift, ChristmasAttendees attendees) {
        attendees.giftName = newGift;
    }
}