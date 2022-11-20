import java.util.*;
import java.util.logging.Logger;


public class Store extends FilterLaptops {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        Notebook note1 = new Notebook("IRBIS", 13.3, "Intel Celeron J3455",
                "Intel HD Graphics 500", 4, "SSD", 64, "plastic",
                "white", 12890);

        Notebook note2 = new Notebook("Acer", 15.6, "Intel Core i3 1115G4",
                "Intel UHD Graphics", 8, "SSD", 128, "plastic",
                "silver", 28890);

        Notebook note3 = new Notebook("Lenovo", 15.6, "Intel Celeron J3455",
                "Intel UHD Graphics", 4, "SSD", 256, "plastic",
                "grey", 37890);

        Notebook note4 = new Notebook("MSI", 14, "Intel Core i5 1235U",
                "Intel Iris Xe graphics", 8, "SSD", 512, "plastic",
                "silver", 52890);

        Notebook note5 = new Notebook("MSI", 15.6, "AMD Ryzen 5 Pro 5650U",
                "AMD Radeon", 16, "SSD", 512, "aluminium",
                "silver", 105890);

        Set<Notebook> assortment = new HashSet<>();
        assortment.add(note1);
        assortment.add(note2);
        assortment.add(note3);
        assortment.add(note4);
        assortment.add(note5);

        Map<Integer, String> criterias = new HashMap<>();
        criterias.put(0, "name");
        criterias.put(1, "display");
        criterias.put(2, "cpu");
        criterias.put(3, "gpu");
        criterias.put(4, "ram");
        criterias.put(5, "storageType");
        criterias.put(6, "storageSize");
        criterias.put(7, "material");
        criterias.put(8, "color");
        criterias.put(9, "price");

        Map<String, String> minValuesLaptops = new HashMap<>();
        minValuesLaptops.put("name", "IRBIS");
        minValuesLaptops.put("display", "13.3");
        minValuesLaptops.put("cpu", "Intel Celeron J3455");
        minValuesLaptops.put("gpu", "Intel HD Graphics 500");
        minValuesLaptops.put("ram", "4");
        minValuesLaptops.put("storageType", "HDD");
        minValuesLaptops.put("storageSize", "64");
        minValuesLaptops.put("material", "plastic");
        minValuesLaptops.put("color", "white");
        minValuesLaptops.put("price", "12890");

        System.out.printf(criterias + ": ");
        Integer choise = (new Scanner(System.in)).nextInt();
        try {
            filterLaptops(choise, criterias, assortment);
            minValuesLaptops(choise, criterias, assortment, minValuesLaptops);
        } catch (NullPointerException e) {
            logger.info("Wrong request!");
        }
    }
}
