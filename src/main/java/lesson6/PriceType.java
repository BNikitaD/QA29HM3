package lesson6;

public class PriceType {

    public int printCountandTypeofproducts(Product[] list, Type device){
        int count = 0;
        for(Product product : list){

            if(product.getDevice()==device && product.inStock()){
                count++;
            }
        }
        return count;
    }

    public int allPriceProductsofType(Product[] list, Type device){
        int allprice = 0;
        for (Product product : list){
            if(product.getDevice() == device){
                allprice = allprice + product.getPrice();

            }
        }
        return  allprice;

    }
}

