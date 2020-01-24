package Forms;

public class ObjectManager {

    private Object obj;

    public ObjectManager(Formulaire form) {
        this.obj = form;
    }

    public String export(ExportFormat export) {
       return export.format(this.obj);
    }
}
