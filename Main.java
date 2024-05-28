package trabalhoAVA2;

public class Main {
    public static void main(String[] args) {
        Logger Console = LoggerFactory.onConsole();
        Logger File = LoggerFactory.onFile();

        // Testando o LoggerConsole
        Console.log(Level.DEBUG, "Mensagem de debug");
        Console.log(Level.WARNING, "Mensagem de aviso");
        Console.log(Level.ERROR, "Mensagem de erro");

        // Testando o LoggerFile
        File.log(Level.DEBUG, "Mensagem de debug");
        File.log(Level.WARNING, "Mensagem de aviso");
        File.log(Level.ERROR, "Mensagem de erro");
    }
}
