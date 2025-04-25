package commonfunction.functions;

public class TemplateNameStorage {
    private static String templateName;

    public static void setTemplateName(String name) {
        templateName = name;
    }

    public static String getTemplateName() {
        return templateName;
    }
}
