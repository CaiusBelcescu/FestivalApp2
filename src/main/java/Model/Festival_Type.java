package Model;

public class Festival_Type {
    private String name;
    private String place;
    private String prices;
    private String description;

    public Festival_Type() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Festival_Type festival = (Festival_Type) o;

        if (!name.equals(festival.name)) return false;
        if (!prices.equals(festival.prices)) return false;
        if (!place.equals(festival.place)) return false;
        return description.equals(festival.description);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + place.hashCode();
        result = 31 * result + prices.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", prices='" + prices + '\'' +
                ", prices='" + description + '\'' +
                '}';
    }
}

