package fundamentos;
import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A hora do sistema é " + data.toString());
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
}
