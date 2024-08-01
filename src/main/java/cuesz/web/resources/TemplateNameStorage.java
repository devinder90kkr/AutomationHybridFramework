package cuesz.web.resources;

public class TemplateNameStorage {
    private static String templatename;

    public static void setTemplateName(String name) {
        templatename = name;
    }

    public static String getTemplateName() {
        return templatename;
    }
}
