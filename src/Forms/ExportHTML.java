package Forms;


import java.lang.reflect.Field;

public class ExportHTML implements ExportFormat {
    @Override
    public String format(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        try {
            for (Field field : obj.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append("\t<tr>\n");
                sb.append("\t\t<td>");
                sb.append(field.getName());
                sb.append("</td>\n");
                sb.append("\t\t<td>");
                sb.append(field.get(obj));
                sb.append("</td>\n");
                sb.append("\t<tr>\n");
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);//Obligatoire si le field est private
                sb.append("\t<tr>\n");
                sb.append("\t\t<td>");
                sb.append(field.getName());
                sb.append("</td>\n");
                sb.append("\t\t<td>");
                sb.append(field.get(obj));
                sb.append("</td>\n");
                sb.append("\t<tr>\n");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        sb.append("</table>");
        return sb.toString();
    }
}
