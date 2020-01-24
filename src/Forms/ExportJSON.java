package Forms;

import java.lang.reflect.Field;

public class ExportJSON implements ExportFormat {
    @Override
    public String format(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        try {
            for (Field field : obj.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append("\"");
                sb.append(field.getName());
                sb.append("\"");
                sb.append(":\"");
                sb.append(field.get(obj));
                sb.append("\"");
                sb.append(",");
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append("\"");
                sb.append(field.getName());
                sb.append("\"");
                sb.append(":\"");
                sb.append(field.get(obj));
                sb.append("\"");
                sb.append(",");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }
}
