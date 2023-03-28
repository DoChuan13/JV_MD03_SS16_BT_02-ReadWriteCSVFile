package app.view;

import app.config.InputConfig;
import app.model.Nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Nation> readFile(String filePath) {
        List<Nation> listCSV = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                listCSV.add(new Nation(Integer.parseInt(arr[0]), arr[1], arr[2]));
            }
        } catch (Exception errException) {
            System.out.println("File không tồn tại, hoặc bị lỗi");
        }
        return listCSV;
    }

    public static void writeFile(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            System.out.print("Input Id: ");
            String id = InputConfig.getString();
            System.out.print("Nation code: ");
            String code = InputConfig.getString();
            System.out.print("Input Nation name: ");
            String nation = InputConfig.getString();
            bufferedWriter.newLine();
            bufferedWriter.write(id);
            bufferedWriter.write(",\"" + code + "\"");
            bufferedWriter.write(",\"" + nation + "\"");
            bufferedWriter.close();
        } catch (Exception errException) {
            System.out.println("File không tồn tại, hoặc bị lỗi");
        }
    }
}
