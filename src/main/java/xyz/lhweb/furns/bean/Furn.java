package xyz.lhweb.furns.bean;import java.math.BigDecimal;/** * 家具 * * @author 罗汉 * @date 2023/04/01 */public class Furn{ 	 private Integer id; 	 private String name; 	 private String maker; 	 private BigDecimal price; 	 private Integer sales; 	 private Integer stock; 	 private String imgPath="assets/images/product-image/default.jpg"; 	 public Furn() { 	 	 super();	}	public Furn(Integer id, String name, String maker, BigDecimal price, Integer sales, Integer stock, String imgPath) {		this.id = id;		this.name = name;		this.maker = maker;		this.price = price;		this.sales = sales;		this.stock = stock;		if (!(null==imgPath|| imgPath.equals(""))){			this.imgPath = imgPath;		}	}	public void setId(Integer id){ 		 this.id=id; 	 } 	 public Integer getId(){ 		 return this.id; 	 } 	 public void setName(String name){ 		 this.name=name; 	 } 	 public String getName(){ 		 return this.name; 	 } 	 public void setMaker(String maker){ 		 this.maker=maker; 	 } 	 public String getMaker(){ 		 return this.maker; 	 }	 public BigDecimal getPrice() {		return price;	}	 public void setPrice(BigDecimal price) {		this.price = price;	}	 public void setSales(Integer sales){ 		 this.sales=sales; 	 } 	 public Integer getSales(){ 		 return this.sales; 	 } 	 public void setStock(Integer stock){ 		 this.stock=stock; 	 } 	 public Integer getStock(){ 		 return this.stock; 	 } 	 public void setImgPath(String imgPath){ 		 this.imgPath=imgPath; 	 } 	 public String getImgPath(){ 		 return this.imgPath; 	 }     @Override     public String toString() {        return "Furn{" +                "id=" + id +                ", name='" + name + '\'' +                ", maker='" + maker + '\'' +                ", price=" + price +                ", sales=" + sales +                ", stock=" + stock +                ", imgPath='" + imgPath + '\'' +                '}';    }}