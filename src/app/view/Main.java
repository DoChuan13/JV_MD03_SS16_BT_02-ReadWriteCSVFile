package app.view;

import app.model.Nation;

import java.util.List;

public class Main {
    private static String CSV_PATH = "./src/database/content.csv";

    public static void main(String[] args) {
        List<Nation> listNation = ReadAndWrite.readFile(CSV_PATH);
        for (Nation nation : listNation) {
            System.out.println(nation);
        }
        ReadAndWrite.writeFile(CSV_PATH);
    }
}
