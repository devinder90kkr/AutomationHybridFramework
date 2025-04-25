package commonfunction.functions; 
import java.util.Calendar;

@SuppressWarnings("unused")
public class YearUtil {

    public static String getYearName(int year) {
        String yearName;
        switch (year) {
            case 2023:
                yearName = "2023";
                break;
            case 2024:
                yearName = "2024";
                break;
            case 2025:
                yearName = "2025";
                break;
            case 2026:
                yearName = "2026";
                break;
            case 2027:
                yearName = "2027";
                break;
            case 2028:
                yearName = "2028";
                break;
            case 2029:
                yearName = "2029";
                break;
            case 2030:
                yearName = "2030";
                break;
            case 2031:
                yearName = "2031";
                break;
            case 2032:
                yearName = "2032";
                break;
            case 2033:
                yearName = "2033";
                break;
            default:
                yearName = "Unknown";
                break;
        }
        return yearName;
    }
}
