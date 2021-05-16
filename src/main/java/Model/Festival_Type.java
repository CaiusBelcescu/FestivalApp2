package Model;

public class Festival_Type {
    private String name;
    private String place;
    private String prices;
    private String description;

    public Festival_Type(String name, String place, String prices, String description) {
        this.name = name;
        this.prices = prices;
        this.place = place;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getFestprice() {
        return prices;
    }

    public void setFestprice(String FestLocation){
        this.prices = FestLocation;
    }


    public String getFestplace() {
        return place;
    }

    public void setFestplace(String FestLocation){
        this.place = FestLocation;
    }


    public String getFestdescription() {
        return description;
    }

    public void setFestdescription(String FestLocation){
        this.description = FestLocation;
    }
}

