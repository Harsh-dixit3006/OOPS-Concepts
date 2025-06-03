package Inheritance;

class LibraryItem {

    private String ItemId;
    private String title;
    private String Author;

    public void checkout(){
        System.out.println("Checked Out");
    }

    public void returnItem(){
        System.out.println("item Returned");
    }


}
