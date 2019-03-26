package com.example.tylerprince.austinbardeals;

public class Deal {

    private String BarName;
    private int DealID;
    private int DealDay;
    private String DealPrice;
    private int DealType;
    private String DealDetail;
    private String DealDrink;
    private String FoodDeal;
    private int BarID;
    private int AreaID;
    private String Atmosphere;
    private int Experience;

    public Deal(String barName, int dealID, int dealDay, String dealPrice, int dealType, String dealDetail, String dealDrink, String foodDeal, int barID, int areaID, String atmosphere, int experience) {
        BarName = barName;
        DealID = dealID;
        DealDay = dealDay;
        DealPrice = dealPrice;
        DealType = dealType;
        DealDetail = dealDetail;
        DealDrink = dealDrink;
        FoodDeal = foodDeal;
        BarID = barID;
        AreaID = areaID;
        Atmosphere = atmosphere;
        Experience = experience;
    }

}
