package Forms;

import java.lang.reflect.Field;

public class ExportCSV implements ExportFormat {
    @Override
    public String format(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        try {
            for (Field field : obj.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append(field.getName());
                sb.append(",");
                sb.append(field.get(obj));
                sb.append("\n");
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append(field.getName());
                sb.append(",");
                sb.append(field.get(obj));
                sb.append("\n");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sb.toString();
    }
}
