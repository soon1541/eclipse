package javapProject1;

public class ProductTest {

   public static void main(String[] args) {
        ProductVO product1 = new ProductVO("001", "노트북", 1200000, 2021, "삼성");
        ProductVO product2 = new ProductVO("002", "모니터", 300000, 2021, "LG");
        ProductVO product3 = new ProductVO("003", "마우스", 30000, 2020, "로지텍");

        
        System.out.printf("%-10s%-15s%-15s%-10s%-20s%n", "상품번호", "상품명", "가격", "연도", "제조사");
        System.out.println("-----------------------------------------------------------------");

        printProductInfo(product1);
        printProductInfo(product2);
        printProductInfo(product3);
      
    }

    public static void printProductInfo(ProductVO product) {
        System.out.printf("%-10s%-15s%-15d%-10d%-20s%n",
                product.getPrdNo(), product.getPrdName(), product.getPrdPrice(), product.getPrdYear(), product.getPrdMaker());
     }
      
   }
