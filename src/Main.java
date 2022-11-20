import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

    //General initializations

    //Player initializations (figure out how to only set up 2 players for example, as opposed to all 4 every time)
    //Make player class to keep track of properties, railroads, money, utilities, etc.


    //Property Initializations in order of the board
    Properties MediterraneanAvenue = new Properties("Purple", 60, 50, 2, 10, 30, 90, 160, 250);
    Properties BalticAvenue = new Properties("Purple", 60, 50, 4, 20, 60, 180, 320, 450);
    Properties OrientalAvenue = new Properties("LightBlue", 100, 50, 6, 30, 90, 270, 400, 550);
    Properties VermontAvenue = new Properties("LightBlue", 100, 50, 6, 30, 90, 270, 400, 550);
    Properties ConnecticutAvenue = new Properties("LightBlue", 120, 50, 8, 40, 100, 300, 450, 600);
    Properties StCharlesPlace = new Properties("Pink", 140, 100, 10, 50, 150, 450, 625, 750);
    Properties StatesAvenue = new Properties("Pink", 140, 100, 10, 50, 150, 450, 625, 750);
    Properties VirginiaAvenue = new Properties("Pink", 160, 100, 12, 60, 180, 500, 700, 900);
    Properties StJamesPlace = new Properties("Orange", 180, 100, 14, 70, 200, 550, 750, 950);
    Properties TennesseeAvenue = new Properties("Orange", 180, 100, 14, 70, 200, 550, 750, 950);
    Properties NewYorkAvenue = new Properties("Orange", 200, 100, 16, 80, 220, 600, 800, 1000);
    Properties KentuckyAvenue = new Properties("Red", 220, 150, 18, 90, 250, 700, 875, 1050);
    Properties IndianaAvenue = new Properties("Red", 220, 150, 18, 90, 250, 700, 875, 1050);
    Properties IllinoisAvenue = new Properties("Red", 240, 150, 20, 100, 300, 750, 925, 1100);
    Properties AtlanticAvenue = new Properties("Yellow", 260, 150, 22, 110, 330, 800, 975, 1150);
    Properties VentnorAvenue = new Properties("Yellow", 260, 150, 22, 110, 330, 800, 975, 1150);
    Properties MarvinGardens = new Properties("Yellow", 280, 150, 24, 120, 360, 850, 1025, 1200);
    Properties PacificAvenue = new Properties("Green", 300, 200, 26, 130, 390, 900, 1100, 1275);
    Properties NorthCarolinaAvenue = new Properties("Green", 300, 200, 26, 130, 390, 900, 1100, 1275);
    Properties PennsylvaniaAvenue = new Properties("Green", 320, 200, 28, 150, 450, 1000, 1200, 1400);
    Properties ParkPlace = new Properties("Blue", 350, 200, 35, 175, 500, 100, 1300, 1500);
    Properties Boardwalk = new Properties("Blue", 400, 200, 50, 200, 600, 1400, 1700, 2000);

    //Card Initializations
    String[] CommunityChest = {"XMAS FUND MATURES. COLLECT $100","RECIEVE FOR SERVICES $25","PAY HOSPITAL $100","YOU HAVE WON 2ND IN A BEAUTY CONTEST. COLLECT $10","DOCTOR'S FEE. PAY $50","GO TO JAIL","INCOME TAX REFUND. COLLECT $20","GRAND OPERA OPENING. COLLECT 50$ FROM EVERY PLAYER FOR OPENING NIGHT SEATS","YOU ARE ASSESSED FOR STREET REPAIRS. $40 PER HOUSE, $115 PER HOTEL","GET OUT OF JAIL FREE CARD","YOU INHERIT $100","LIFE INSURANCE MATURES. COLLECT $100","PAY SCHOOL TAX OF $150","YOU GET $45 FROM SALE OF STOCK","ADVANCE TO 'GO' COLLECT $200","BANK ERROR. COLLECT $200",};
    String[] Chance = {"GO BACK 3 SPACES", "GO TO JAIL", "ADVANCE TO GO. COLLECT $200", "BANK PAYS YOU DIVIDEND OF $50", "PAY POOR TAX OF $15", "YOUR BUILDING AND LAND MATURES. COLLECT $150", "GET OUT OF JAIL FREE", "ADVANCE TO READING RAILROAD. IF 'GO' IS PASSED, COLLECT $200", "YOU HAVE BEEN ELECTED CHAIRMAN OF THE BOARD. PAY EACH PLAYER $50", "ADVANCE TO THE NEAREST UTILITY. IF UNOWNED: YOU MAY BUY IT FROM THE BANK. IF OWNED, THROW DICE AND PAY OWNER 10X THE THROWN AMOUNT", "ADVANCE TO THE NEAREST RAILROAD. PAY OWNER TWICE THE RENT, OR BUY FROM THE BANK IF UNOWNED", "GENERAL REPAIRS. PAY $25 FOR EACH HOUSE, $100 FOR EACH HOTEL", "ADVANCE TO ILLINOIS AVE.", "ADVANCE TO ST. CHARLES PLACE. COLLECT $200 IF 'GO' IS PASSED", "ADVANCE TO BOARDWALK"};


    //---------- end of initializations, Game and run methods start here


    //Only 1 dice to facilitate graphics later on
    public int rollDice(){
        return (1 + (int)(Math.random()*6));
    }

    public void boardLocation(int location){
        //40 spots on the board. "GO" is spot 40
        //Method will have 40 "if" statements and call the necessary methods for each spot on the board to do the right thing
        //This is the "God Method"
    }

    //All railroads have the same rent. Will use player class to keep track of how many railroads are owned
    public int RRRentCalc (){
        return 0;
    }

    //Access to properties along with how many buildings a player has put on a property to determine rent due
    public int PRentCalc (){
        return 0;
    }


    //----------game methods end here, run methods below


    //game runner (print tester for now)
    public void game() {

        //Testing classes
        System.out.println(NewYorkAvenue.getPrice());

        //Testing cards
        System.out.println(CommunityChest[(int)(Math.random()*16)]);
        System.out.println(Chance[(int)(Math.random()*16)]);

        //Testing Dice
        for (int a = 0; a < 100; a++){
            System.out.print(rollDice() + " ");
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.game();
    }

}
