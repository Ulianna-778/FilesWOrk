import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainTwo {
    public static void main(String[] args)  throws IIOException {
//        try {
//        List<String> listString = Files.readAllLines(Paths.get(
//                "C:\\Files\\data\\info.txt"));
//
//        Files.write(Paths.get("C:\\Files\\data\\"));
//
//         } catch (IIOException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException e) {
//        }
        //записать фаил
//        try {
//            List<String> listString = Files.readAllLines(Paths.get(
//                    "C:\\Files\\data\\info.txt"));
//
//            PrintWriter printWriter = new PrintWriter(
//                    //PrintWriter помогает делать фаил
//                    "C:\\Files\\data\\book.txt");
//            for (String line : listString) {
//                printWriter.write(line + "\n");
//                //писать
//                //берем каждую строку из списка
//            }
//            File file = new File("C:\\Files\\data\\info.txt");
//            file.delete();
//
//            printWriter.flush();
//            //чтоб записи были видны доступны чтоб бфло переданно в фаил
//            //буфер память временая память // из буфура флаш сохр. на буфер
//            //компилторр из выс - низ /// интопритатор - по строчно
//            printWriter.close();
//            //закрывает поток ... чтоб мб прочитать изсменитть надо закрыть
//            //место где работает файлами
//        } catch (Exception ex) {
//            ex.getMessage();
//        }
        //2 СПОСОБ

        try {
            ArrayList<String> arrayList = new ArrayList<>();
            List<String> listString = Files.readAllLines(Paths.get(
                    "C:\\Files\\data\\info.txt"));
            for (String line : listString)  {
                arrayList.add(line);
            }
            //список = от массива
            //массив то что ограничено. не меняются [] по кол-ву размер массива нельзя изменить
            //списов оценки меняется то работает с список
            //arrayList =  есть масив, есть индекс || LinkedList = NOOOOOO
            //оценка финальный неизменяется add(3) создание нового обьекта в ячейку \\ КАК СТРИНД И СТРИНГБИЛДЕР
            // он расскалывается крайние уходят... связанны концы
            Files.write(Paths.get(
                    "C:\\Files\\data\\book.txt"),
                   arrayList);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
