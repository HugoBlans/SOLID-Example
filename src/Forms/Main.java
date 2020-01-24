package Forms;



public class Main {
    public static void main(String[] args) {
        // Formulaire de contact
        FormulaireContact fc = new FormulaireContact();
        fc.setEmail("hugo.blans@viacesi.com");
        fc.setMessage("Salut le monde");
        fc.setObject("Coucou");

        // Manager lié au formulaire de contact
        ObjectManager omfc = new ObjectManager(fc);

        // Les différents exports
        ExportHTML eHTML = new ExportHTML();
        ExportJSON eJSON = new ExportJSON();
        ExportCSV eCSV = new ExportCSV();

        // Affichage des exports du formulaire de contact
        System.out.println(omfc.export(eHTML));
        System.out.println(omfc.export(eJSON));
        System.out.println(omfc.export(eCSV));


        // Formulaire d'inscription
        FormulaireInscription fi = new FormulaireInscription();
        fi.setNickname("ThetaSigma");
        fi.setPassword("Gallifrey");
        fi.setEmail("hugo.blans@gmail.com");

        // Manager lié au formulaire d'inscription
        ObjectManager omfi = new ObjectManager(fi);

        // Affichage des exports du formulaire d'inscription
        System.out.println(omfi.export(eHTML));
        System.out.println(omfi.export(eJSON));
        System.out.println(omfi.export(eCSV));
    }
}
