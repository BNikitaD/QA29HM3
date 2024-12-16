package lesson6;

public class MainApp {

    public static void main(String[] args) {

        Product [] list = {
                new Product(Type.MOBILE, true, 1500, "samsung"),
                new Product(Type.TV, false, 750, "LG"),
                new Product(Type.AUDIO, true, 2250, "apple"),
                new Product(Type.TV, false, 3000, "horizont"),
                new Product(Type. MOBILE, true, 1250, "sony"),

        };

        PriceType productService = new PriceType();

        int allprice = productService.allPriceProductsofType(list, Type.MOBILE);
        System.out.println("Total price of mobile products: " + allprice);

        int countoftype = productService.printCountandTypeofproducts(list, Type.AUDIO);
        System.out.println("Available audio products count: " + countoftype);
    }


}
