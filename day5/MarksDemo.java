class Marks {
    int eng;
    int mth;
    int phy;
}

public class MarksDemo {
    public static void main(String[] args) {
        Marks obj1 = new Marks();
        obj1.eng = 99;
        obj1.mth = 80;
        obj1.phy = 90;

        Marks obj2 = new Marks();
        obj2.eng = 76;
        obj2.mth = 75;
        obj2.phy = 100;

        System.out.println("Marks for the first object: ");
        System.out.println(obj1.eng);
        System.out.println(obj1.mth);
        System.out.println(obj1.phy);

        System.out.println("Marks for the second object: ");
        System.out.println(obj2.eng);
        System.out.println(obj2.mth);
        System.out.println(obj2.phy);
    }
}
