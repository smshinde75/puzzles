// Java version more than 6 and less than 15 is expected to run this program
// Recommended Java Version: 8

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;

public class MakeEquationTrue {
    public static void main(String[] args) {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("JavaScript");
        ArrayList<String> operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        operations.forEach(operation1 -> {
            operations.forEach(operation2 -> {
                operations.forEach(operation3 -> {
                    operations.forEach(operation4 -> {
                        try {
                            Object object = engine.eval("18" + operation1 + "12" + operation2 + "4" + operation3 + "5");
                            Integer evaluatedInteger = Integer.parseInt(object + "");
                            if (evaluatedInteger == 59) {
                                System.out.println("18" + operation1 + "12" + operation2 + "4" + operation3 + "5" + "=59");
                            }
                        } catch (ScriptException e) {
                            throw new RuntimeException(e);
                        } catch (NumberFormatException nfe) {
                            //skipping non integers
                        }
                    });
                });
            });
        });
    }
}
