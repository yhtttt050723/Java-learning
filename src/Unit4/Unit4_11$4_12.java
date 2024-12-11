package Unit4;
// 类的设计和使用举例.
class Book{
    String bookStore;
    String bookName;
    String bookPress;
    String bookISBN;//书号
    double bookPrice;
    long quantitySold;
    private Book(String bookStore){
        this.bookStore = bookStore;// 通过this关键字使得这个bookstore为private Book外定义的bookstore
        System.out.println("欢迎光临--"+bookStore+"--" );
    }
    Book(String bookStore,long quantitySold){
        this(bookStore);//通过this 访问本类的构造方法;
        this.quantitySold =quantitySold;
    }//构造方法
    double amountSales(){
        return bookPrice*quantitySold;
    }
}
public class Unit4_11$4_12 {
    public static void main(String[] args) {
        Book book1;
        book1 = new Book("百川书屋",111);
        book1.bookPress = "不知名出版社";
        book1.bookISBN = "12138";
        book1.bookName = "JAVA两天速成";
        book1.bookPrice = 68.9;
        double sales = book1.amountSales();
        System.out.println(book1.bookStore);
        System.out.println(book1.bookPress);
        System.out.println(book1.bookName);
        System.out.println("价格为："+book1.bookPrice);
        System.out.println("书号为："+book1.bookISBN);
        System.out.println("销售额为："+book1.quantitySold);
        System.out.println("总营业额："+sales);
    }

}
