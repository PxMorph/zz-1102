public class SupermarketItem {
  String noId, itemName;
  double noPrice;
  int noQty;

  /*
  public SupermarketItem(){
    noId = "null";
    itemName = "null";
    noPrice = 0.0;
    noQty = 0;
  }
  */

  public SupermarketItem(String noId, String itemName, double noPrice, int noQty){
    this.noId = noId;
    this.itemName = itemName;
    this.noPrice = noPrice;
    this.noQty = noQty;
  }
}
