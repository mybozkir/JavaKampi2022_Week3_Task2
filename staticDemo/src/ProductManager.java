public class ProductManager {
    //Static yaptığında çağırdığın her yerde aynı nesnede çalışırsın. O yüzden böyle manager vb. yerlerde ASLA static kullanma!
    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    };

}
