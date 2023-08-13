package javapProject1;

public class ProductVO {
   private String prdNo;
    private String prdName;
    private int prdPrice;
    private int prdYear;
    private String prdMaker;

   public ProductVO() {

   }
   public ProductVO(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
   }
    public String getPrdNo() {
           return prdNo;
       }

       public String getPrdName() {
           return prdName;
       }

       public int getPrdPrice() {
           return prdPrice;
       }

       public int getPrdYear() {
           return prdYear;
       }

       public String getPrdMaker() {
           return prdMaker;
       }

    @Override
       public String toString() {
           return prdNo + prdName +prdPrice + prdYear + prdMaker;
       }
}