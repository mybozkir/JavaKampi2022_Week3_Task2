public class ProductValidator {

    //Bir Class'a ait static bir özelliği çağırdığında constructor çalışmaz. Constructor'lar sadece new()
    //diyerek o Class'tan bir nesne oluşturduğu zaman çalışır. İstersen static Constructor oluşturabilirsin.

    static {
        System.out.println("Static constructor çalıştı.");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }

    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void bisey(){

    }

    //Inner Class
    public static class BaskaBirClass{
        public static void sil(){

        }
    }

}
