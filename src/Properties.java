import java.awt.*;

public class Properties {
    String col;
    boolean owned = false;
    int price,housePrice,baseRent,rentOne,rentTwo,rentThree,rentFour,rentHotel;
    Properties(String hi, int a,int b, int c,int d,int e,int f,int g, int h){
        //https://www.falstad.com/monopoly.html
        col = hi;
        price = a;
        housePrice=b;
        baseRent=c;
        rentOne=d;
        rentTwo=e;
        rentThree=f;
        rentFour = g;
        rentHotel = h;
    }

    //get methods
    public int getBaseRent() {
        return baseRent;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int getPrice() {
        return price;
    }

    public int getRentFour() {
        return rentFour;
    }

    public int getRentHotel() {
        return rentHotel;
    }

    public int getRentOne() {
        return rentOne;
    }

    public int getRentThree() {
        return rentThree;
    }

    public String getCol() {
        return col;
    }

    public int getRentTwo() {
        return rentTwo;
    }

    //set methods
    public void setBaseRent(int baseRent) {
        this.baseRent = baseRent;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRentFour(int rentFour) {
        this.rentFour = rentFour;
    }

    public void setRentHotel(int rentHotel) {
        this.rentHotel = rentHotel;
    }

    public void setRentOne(int rentOne) {
        this.rentOne = rentOne;
    }

    public void setRentThree(int rentThree) {
        this.rentThree = rentThree;
    }

    public void setRentTwo(int rentTwo) {
        this.rentTwo = rentTwo;
    }

    public void isOwned(boolean a) {
        this.owned = a;
    }

    public void initializeCards(){
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
    }
}
