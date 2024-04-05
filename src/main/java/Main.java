import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        File file = new File("data\\info.txt");
//        System.out.println(file.getAbsolutePath());
        //колво символов \\ фбсолютный путь \\ имя  \\ родителя
        //////////////////////////////////////////////////////////////
//        File folder = new File("C:\\Files");
//        File[] listFiles = folder.listFiles();
//        for (File currentFile : listFiles) {
//            System.out.println(currentFile.getAbsolutePath());
//        }
        //////////////////////////
        //СОЗДАТЬ ПАПКУ
//        File fileNumders = new File("C:\\Files\\data\\Ulianna");
//        fileNumders.mkdir();
//        fileNumders.delete();
        ///////////////////////////////
        //прочитать фаил info.txt
//        StringBuilder builder = new StringBuilder();
//        try {
//            FileInputStream is = new FileInputStream("C:\\Files\\data\\info.txt"
//            );
//            for (; ; ) {
//                int code = is.read();
//                //переенная нашего файла  файла нет
//                if (code == -1) {
//                    break;
//                }
//                char ch = (char) code;
//                // переименовать в букву поэтому нада привести в чар (char)
//                builder.append(ch);
//                //добавим кажыдые буквы
//            }
//        } catch (IOException ex) {
//            ex.getMessage();
//        }
//        System.out.println(builder.toString());
        ///////////////////////////////////////////// НЕ ПО СИМВОЛЬНО А ПО СТРОЧНО
//
//        StringBuilder builder = new StringBuilder();
//        try {
//        BufferedReader br = new BufferedReader();
//        new FileReader("C:\\Files\\data\\info.txt");
//        for (; ; ) {
//            String str = br.readLine();
//            if ((str == null)) {
//                break;
//            }
//            builder.append(str + "\n");
//        }
//    } catch (Exception ex) {
//        ex.getMessage();
//    }
        //чтение файлов с помощью классов
//        StringBuilder builder1 = new StringBuilder();
//            List<String> listString = Files.readAllLines(
//                    Paths.get("C:\\Files\\data\\info.txt"));
//
//            System.out.println("Title: " + listString.getFirst());
//            listString.forEach(line -> builder1.append(line + "\n"));
//            System.out.println(builder1.toString());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        try {
            byte[] arrayBytes = Files.readAllBytes(Paths.get(
                    "C:\\Files\\data\\info.txt"));
            for (byte b : arrayBytes) {
                char ch = (char) b;
                System.out.println("Current symbol" + ch);
            }
            System.out.println("Array bytes: " + arrayBytes);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
