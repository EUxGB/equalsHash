// com/
public class Auto {
    int year;
    int price;
    String name;
    Color color;

    public Auto(String name, int year, int price, Color color) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Auto auto = (Auto) obj;
        if (color != auto.color) return false;
        if (name != auto.name) return false;
        if (price != auto.price) return false;
        return year == (auto.year);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = name.hashCode() ;
        int hcolor = color.hashCode();
        result = prime * result +year;
        result = prime * result + price;
        result = prime * result + hcolor;
        return result;
    }


    public Color getColor(Auto auto) {
        return color;
    }

    public int getYear(Auto auto) {
        return year;
    }

    public int getPrice(Auto auto) {
        return price;
    }

    public String getName(Auto auto) {
        return name;
    }
}
