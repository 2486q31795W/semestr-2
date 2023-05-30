package Semestr2.Pr50_kt5;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class HistoryManager {
    private static final String FILE_NAME = "C:\\Users\\beres\\Documents\\История Калькулятора.csv";

    public void saveExpression(String expression, double result) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.append(expression);
            writer.append("=");
            writer.append(String.valueOf(result));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }

    public List<String> loadHistory() {
        List<String> history = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке истории: " + e.getMessage());
        }

        return history;
    }
}
