package class24;

public abstract class File {
   /* Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/
    public abstract void open();
    public void edit(){
        System.out.println("Edit file");
    }
    public void close(){
        System.out.println("Close file");
    }
}
class JavaFile extends File{
   public void open(){
        System.out.println("To open Java file we need notepad");
    }
}
class WordFile extends File{
    public void open(){
        System.out.println("To open doc we need microsoft word");
    }
}
class PdfFile extends File {
    public void open() {
        System.out.println("To open PDF we need word ");
    }


    public static void main(String[] args) {
        File[] doc={new JavaFile(),new WordFile(),new PdfFile()};
        for(File f:doc){
            f.open();
        }

    }
}