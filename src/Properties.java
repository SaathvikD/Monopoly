import java.awt.*;

public class Properties {
    String col;
    boolean owned = false;
    int price,housePrice,baseRent,rentOne,rentTwo,rentThree,rentFour,rentHotel;
    Properties(String color, int a,int b, int c,int d,int e,int f,int g, int h){
        //https://www.falstad.com/monopoly.html
        col = color;
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

}
