package miscellenious.templatemethod;

import java.io.IOException;
import java.io.PrintWriter;

public abstract class OrderPrinter {
    public final void print(Order order, String fileName) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(fileName)) {

        }
    }
}
