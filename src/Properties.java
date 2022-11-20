import java.awt.*;

public class Properties {
    String col;
    boolean owned = false;
    private int price,housePrice,baseRent,rentOne,rentTwo,rentThree,rentFour,rentHotel;

    Properties(String color, int pric,int ppHouse, int RentB,int Rent1,int Rent2,int Rent3,int Rent4, int RentH){
        //https://www.falstad.com/monopoly.html
        col = color;
        price = pric;
        housePrice=ppHouse;
        baseRent=RentB;
        rentOne=Rent1;
        rentTwo=Rent2;
        rentThree=Rent3;
        rentFour = Rent4;
        rentHotel = RentH;
    }

    //get methods
    public int getBaseRent() {
        return baseRent;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int getPrice() {
        System.out.println("chicken");
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

//----------

    //set methods
    public void isOwned(boolean a) {
        this.owned = a;
    }

}
