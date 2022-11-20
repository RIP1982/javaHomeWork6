import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class FilterLaptops {
    public static void filterLaptops(Integer choise, Map<Integer, String> criterias, Set<Notebook> assortment) {
        Logger logger = Logger.getAnonymousLogger();
        if (criterias.get(choise).equals("name")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getName().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("display")) {
            System.out.printf("Input request: ");
            double filter = (new Scanner(System.in)).nextDouble();
            for (Notebook item: assortment) {
                if (item.getDisplay() <= filter) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("cpu")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getCpu().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("gpu")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getGpu().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("ram")) {
            System.out.printf("Input request: ");
            double filter = (new Scanner(System.in)).nextDouble();
            for (Notebook item: assortment) {
                if (item.getRam() <= filter) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("storageType")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getStorageType().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("storageSize")) {
            System.out.printf("Input request: ");
            double filter = (new Scanner(System.in)).nextDouble();
            for (Notebook item: assortment) {
                if (item.getStorageSize() <= filter) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("material")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getMaterial().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("color")) {
            System.out.printf("Input request: ");
            String filter = (new Scanner(System.in)).nextLine();
            for (Notebook item: assortment) {
                if (item.getColor().equals(filter)) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("price")) {
            System.out.printf("Input request: ");
            double filter = (new Scanner(System.in)).nextDouble();
            for (Notebook item: assortment) {
                if (item.getPrice() <= filter) {
                    logger.info(String.valueOf(item));
                }
            }
        } else {
            logger.info("Wrong request!");
        }
    }

    public static void minValuesLaptops(Integer choise, Map<Integer, String> criterias, Set<Notebook> assortment,
                                        Map<String, String> minValuesLaptop) {
        Logger logger = Logger.getAnonymousLogger();
        if (criterias.get(choise).equals("name")) {
            for (Notebook item : assortment) {
                if (item.getName().equals(minValuesLaptop.get("name"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("display")) {
            for (Notebook item : assortment) {
                if (item.getDisplay() == Double.parseDouble(minValuesLaptop.get("display"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("cpu")) {
            for (Notebook item : assortment) {
                if (item.getCpu().equals(minValuesLaptop.get("cpu"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("gpu")) {
            for (Notebook item : assortment) {
                if (item.getGpu().equals(minValuesLaptop.get("gpu"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("ram")) {
            for (Notebook item : assortment) {
                if (item.getRam() == Double.parseDouble(minValuesLaptop.get("ram"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("storageType")) {
            for (Notebook item : assortment) {
                if (item.getStorageType().equals(minValuesLaptop.get("storageType"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("storageSize")) {
            for (Notebook item : assortment) {
                if (item.getStorageSize() == Double.parseDouble(minValuesLaptop.get("storageSize"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("material")) {
            for (Notebook item : assortment) {
                if (item.getMaterial().equals(minValuesLaptop.get("material"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("color")) {
            for (Notebook item : assortment) {
                if (item.getColor().equals(minValuesLaptop.get("color"))) {
                    logger.info(String.valueOf(item));
                }
            }
        }
        else if (criterias.get(choise).equals("price")) {
            for (Notebook item : assortment) {
                if (item.getPrice() == Double.parseDouble(minValuesLaptop.get("price"))) {
                    logger.info(String.valueOf(item));
                }
            }
        } else {
            logger.info("Wrong request!");
        }
    }
}