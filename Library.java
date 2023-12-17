public class Library{

    public static Book[] books=new Book[5];
    static int index=0;
    public Library()
    {
        Library.books=new Book[5];
    }
    public static void addBook(Book book){
        if(index==5){
            System.out.println("Full");
        }else{
            books[index]=book;
            index++;
            
        }
    }

    public static void removeBook(int bookID){
        int deletedindex=0;
        if(index<=0){
            System.out.println("Empty");
        }
        else{
        for(int i=0;i<books.length;i++){
            if(books[i].bookID==bookID){
                deletedindex=i;
                break;
            }
        }
        for(int i=deletedindex;i<books.length-1;i++){
            books[i]=books[i+1];
        }
    }
        index--;
    }

    public Book search(int bookID){
        Book b=null;
        for(int i=0;i<books.length;i++){
            if(books[i].getBookID()==bookID){
                    
               b=books[i];    
            }
        }
        if(b!=null){
            return b;
        }
        else
            return null;
    }

    public static void displaybook(){
        int inn=index;
        for(int i=0;i<=inn-1;i++){
            System.out.println("BookId:"+books[i].bookID+"\nBookTitle:"+books[i].title+"\nBookAuthor"+books[i].author);
        }
    }
    public static void main(String arg[]){
        
        Book b=new Book(11,"java", "oracle");
        addBook(b);
        Book b1=new Book(12, "The magical CHAIR", "GRIDBLYTON");
        addBook(b1);
        removeBook(12);
        removeBook(11);
         //removeBook(13);
        displaybook();
        Book b2=new Book(13, "Candy World", "GRIDBLYTON");
        addBook(b2);
        displaybook();
        System.out.println(index);

    }
    

}
    

