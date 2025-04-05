import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args){
       // LambdaDemo demo =new LambdaDemo();
       // demo.add(10,5);

        //node is reduced just to 2 lines using lambda
//        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
//        biConsumer.accept(10,5);



    //private void add(Integer a,Integer b) {
       // System.out.println(a+b);
    //}

    class Product {
        private int id;
        private String model;
        private float price;

        public int getId() {
            return id;
        }

        public String getModel() {
            return model;
        }

        public float getPrice() {
            return price;
        }

        public Product(int id, String model, float price) {
            this.id = id;
            this.model = model;
            this.price = price;
        }
    }
        List<Product> productsList = new ArrayList< Product >();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
        // This is more compact approach for filtering data
        productsList.stream().filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getPrice()));
    }
}
