class Author
{
  private String name,email;
  private char gender;
 
  Author(String name,String email,char gender)
  {
	this.name=name;
	this.email=email;
	this.gender=gender;
  }
String getEmail(){return this.email;}
char getGender(){return this.gender;}

}
class Book
{
  private String bname,author;
  double price;
  int qtyInStock;
  Book(String bname,String author,double price,int qtyInStock)
  {
	this.bname=bname;
	this.author=author;
	setPrice(price);
	setQtyInStock(qtyInStock);
  }
  String getName()
	{return this.bname;}
  String getAuthor()
	{return this.author;}
  double getPrice()
	{return this.price;}
  void setPrice(double price)
	{this.price=price;}
  int getQtyInStock()
	{return this.qtyInStock;}
  void setQtyInStock(int qtyInStock)
	{this.qtyInStock=qtyInStock;}
}
class p_5_1
{
	public static void main(String args[])
	{
	Book b=new Book("arihant","agarwal",550,20);
	String s=b.getAuthor();
	Author a=new Author(b.getAuthor(),"agarwal@gmail.com",'M');
	System.out.println("BOOK:\nNAME:"+b.getName()+"\nPRICE: "+b.getPrice()+"\nQTY IN STOCK : "+b.getQtyInStock());
	System.out.println("AUTHOR:\nNAME:"+b.getAuthor()+"\nGMAIL: "+a.getEmail()+"\nGENDER "+a.getGender());
	}



}