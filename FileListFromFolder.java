import java.io.File;
 
public class FileListFromFolder {
     
    public static void main(String a[]){
        File file = new File("/home/srikanth/data");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
