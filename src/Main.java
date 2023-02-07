import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List listhocvien = new ArrayList<>();
        HocVien hocVien1 = new HocVien("huy", 50);
        HocVien hocVien2 = new HocVien("doan", 28);
        listhocvien.add(hocVien1);
        listhocvien.add(hocVien2);
        writeFile(listhocvien, "lucham.dat");
        List<HocVien> hocViens=new ArrayList<>();
        hocViens=readFile("lucham.dat");
        System.out.println(hocViens);
    }

    public static boolean writeFile(List<HocVien> hocViens, String fileName) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(hocViens);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<HocVien> readFile(String fileName){
       try {
           File file1 = new File(fileName);
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1));
           List<HocVien> hocViens=(List<HocVien>)inputStream.readObject();
           return hocViens;
       }catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }
}