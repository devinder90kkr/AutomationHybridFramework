package cuesz.web.resources;

import com.github.javafaker.Faker;

import cuesz.date.functions.DateGenerator;

public class webTestdata {
	
//	private static Faker faker = new Faker();
//	 // Method to get a dynamic description
//    public static String getDescription() {
//        return faker.lorem().sentence(); // Generates a random sentence
//    }
	 // Define a Faker instance
    private static final Faker faker = new Faker();

    // Define your fitness-related messages
    public static String[] getFitnessMessages() {
        String[] messages = new String[4];
        for (int i = 0; i < messages.length; i++) {
            // Generate a fitness-related paragraph using Faker's sentence and custom text
            messages[i] = generateFitnessParagraph();
        }
        return messages;
    }

    // Method to generate a fitness-related paragraph
    private static String generateFitnessParagraph() {
        // Create a base paragraph with a few fitness-related terms
//        String baseParagraph = faker.lorem().paragraph(2); // Generates a paragraph with 2 sentences
 
        String baseParagraph = faker.shakespeare().hamletQuote();
        
        // Add fitness-related content to the base paragraph
        String fitnessContent = " Remember to stay hydrated and take breaks. Incorporate a variety of exercises including cardio and strength training for balanced fitness. Track your progress regularly to achieve your goals.";
        
        return baseParagraph + fitnessContent;
    }

    // Method to get a random fitness description from the generated messages
    public static String getRandomFitnessMessage() {
        String[] messages = getFitnessMessages();
        return messages[faker.number().numberBetween(0, messages.length)];
    }

	
	//testdata for filter
	
	public static final String dateoption1 = "past 30 days";
	public static final String dateoption2 = "past 90 days";
	
	//Case106_Workout_Templates_multipleexercise
	public static final String templatname = "Heavytraining";
	public static final String[] exercisenamesmultiple = {
	        "45 Degree Bycicle Twisting Crunch, Bodyweight, Bil.",
	        "All Fours Squad Stretch, Bodyweight",
	        "Arm Curl, Suspension, Bil.",
	        "Finger Extension Stretch, Bodyweight"
	    };

	    public static final String[] descriptionsmultiple = {
	        "hello this is just for testing",
	        "hello this",
	        "is just for testing purpose", 
	        "To handle scrolling in Selenium, especially if the element you want to interact with is not in the current view, you can use JavaScript to scroll the page. This approach is often useful when the element is located in a part of the page that's not immediately visible"	        
	    };

	    public static final String[] repsdata = {
	        "3", "2", "8", "12"
	    };

	    public static final String[] recoverydata = {
	        "42", "18", "5", "10"
	    };
	    
	    public static final String[] optional1 = {
		        "40", "50", "60", "70"
		    };
		public static final String[] optional2 = {
	         "1234", "252" , "2-3-3-6", "4158"
	    };
	
//	//testdata for Case107_Workout_Templates_multipleexercise edit process
//		public static final String[] exercisenameeditsmultiple = {
//		        "Bench Press With 1 Board, Barbell, 1 Board, Pronated, Bil.",
//		        "Finger Extension Stretch, Bodyweight",
//		        "Quickly Trot In Place, Bodyweight",
//		        "Back Extension (Female), Leverage Machine, Bil."
//		    };
//
//		    public static final String[] descriptioneditsmultiple = {
//		        "hello this is just for testing",
//		        "hello this",
//		        "is just for testing purpose", 
//		        "To handle scrolling in Selenium, especially if the element you want to interact with is not in the current view, you can use JavaScript to scroll the page. This approach is often useful when the element is located in a part of the page that's not immediately visible"	        
//		    };
//
//		    public static final String[] repseditdata = {
//		        "3", "2", "8", "12"
//		    };
//
//		    public static final String[] recoveryeditdata = {
//		        "42", "18", "5", "10"
//		    };
//		    
//		    public static final String[] optional1edit = {
//			        "40", "50", "60", "70"
//			    };
//			public static final String[] optional2edit = {
//		         "1234", "252" , "2-3-3-6", "4158"
//		    };
		
//		// Define a Faker instance
//	    private static final Faker faker = new Faker();

	    // Test data for Case107_Workout_Templates_multipleexercise edit process
	    public static final String[] exercisenameeditsmultiple = {
	        "Bench Press With 1 Board, Barbell, 1 Board, Pronated, Bil.",
	        "Finger Extension Stretch, Bodyweight",
	        "Quickly Trot In Place, Bodyweight",
	        "Back Extension (Female), Leverage Machine, Bil."
	    };

	    // Reusing the same fitness-related messages for description
	    public static final String[] descriptioneditsmultiple = getFitnessMessages();

	    // Generating numerical data
	    public static final String[] repseditdata = generateNumericData(4, 0, 10, 2);
	    public static final String[] recoveryeditdata = generateNumericData(4, 0, 60, 2);
	    public static final String[] optional1edit = generateNumericData(4, 0, 100, 2);

	    // Generating data for optional2edit in specific format
	    public static final String[] optional2edit = generateFormattedData(4);

	    // Define your fitness-related messages
	    public static String[] getFitnessMessages1() {
	        String[] messages = new String[4];
	        for (int i = 0; i < messages.length; i++) {
	            // Generate a fitness-related paragraph using Faker's sentence and custom text
	            messages[i] = generateFitnessParagraph();
	        }
	        return messages;
	    }

	    // Method to generate a fitness-related paragraph
	    private static String generateFitnessParagraph1() {
	        // Create a base paragraph with a few fitness-related terms
	        String baseParagraph = faker.shakespeare().hamletQuote();
	        
	        // Add fitness-related content to the base paragraph
	        String fitnessContent = " Remember to stay hydrated and take breaks. Incorporate a variety of exercises including cardio and strength training for balanced fitness. Track your progress regularly to achieve your goals.";
	        
	        return baseParagraph + fitnessContent;
	    }

	    // Method to generate numeric data
	    private static String[] generateNumericData(int size, int min, int max, int decimalPlaces) {
	        String[] data = new String[size];
	        for (int i = 0; i < size; i++) {
	            data[i] = String.format("%." + decimalPlaces + "f", faker.number().randomDouble(decimalPlaces, min, max));
	        }
	        return data;
	    }

	    // Method to generate formatted data for optional2edit
	    private static String[] generateFormattedData(int size) {
	        String[] data = new String[size];
	        for (int i = 0; i < size; i++) {
	            if (faker.bool().bool()) {
	                // Generate a four-digit number
	                data[i] = String.valueOf(faker.number().numberBetween(1000, 9999));
	            } else {
	                // Generate a combination like x-2-x-0
	                data[i] = faker.number().digit() + "-2-" + faker.number().digit() + "-0";
	            }
	        }
	        return data;
	    }

	    public static void main(String[] args) {
	        // Test the description generation
	        for (String message : descriptioneditsmultiple) {
	            System.out.println("Description: " + message);
	        }
	        for (String rep : repseditdata) {
	            System.out.println("Reps: " + rep);
	        }
	        for (String recovery : recoveryeditdata) {
	            System.out.println("Recovery: " + recovery);
	        }
	        for (String optional1 : optional1edit) {
	            System.out.println("Optional1: " + optional1);
	        }
	        for (String optional2 : optional2edit) {
	            System.out.println("Optional2: " + optional2);
	        }
	    }
		
	//	Case102_Workout_Templates_create
	public static final String templatename = "MassProduction";
	public static final String exercisename1 = "Above Head Chest Stretch, Bodyweight";
	public static final String description1 = "hello this is just for testing purpose";
	public static final String repsdata1	=	"5";
	public static final String recoverydata1	=	"22";
	public static final String optional1value	=	"weight (KG)";	
	public static final String optionalvalue2	=	"Tempo";
	//Case01_createvent
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	public static final String startime =	"06:30 Pm";
	public static String starTime = "06:30";
	public static final String endtime	=	"07:30 PM";
	public static final String topic 	=	"Live perform session";
	public static final String topic2 	=	"Staff Meeting";
	public static final String membername = "Kumar Devinder";
	public static final String staff1	= "Coach Seakfreight";
	public static final String staff2	=	"Devinder - Wellness Advocate";
	public static final String notes	= "We are excited to announce that there will be a live performance event. So please availble ";
	public static final String notes1	= "Verify Basic Functionality of the Text Editor";
	public static final String notes2	= "Verify Scrolling Functionality in the action notes created";
	public static final String notes3	= "The note marked as completed by the lead advocate, lead coach, or lead doctor should be visible as completed to both the assigned staff member and the member who created the action step.";
	public static final String notes4	= "Clicking the Delete button should initiates the delete action.";
	public static final String notes5	= "Verify that the created action note for a member is visible only on the member summary page of that particular member and not in the action notes of staff members (Lead Advocate, Coach, Doctor, or Non-Lead Advocate).";
	public static final String notes6	= "Sample notes 01 for sharing";
	public static final String notes7	= "Sample notes 02 for sharing";
	public static final String notes8	= "Sample notes 03 for sharing";
	public static final String notes9	= "Sample notes 04 for sharing";
	public static final String notes10	= "Sample notes 05 for sharing";
	
	public static final String editstartTimeInput	=	"10:00 AM";
	public static String editstartInput = "10:00";
	public static final String editendTimeInput	=	"11:00 AM";
	public static final String edittopicvalues = "this text is update during edit field values.";
	

	//Case43_02_MSL_fuel_currentday
	public static final String fuel1	="Mushrooms Cooked";
	public static final String fuel2 	="Blueberries";
	public static final String fuel3 	="Pizza";
	public static final String fuel4 	= "Kiwi";
	public static final String fuel5 	= "walnuts";
	public static final String fuel6 	= "Gluten Free bread";
	public static final String fuel7 	= "Almond milk";
	public static final String fuel8 	= "boiled egg";
	public static final String fuel9 	= "Dark Chocolate";
	public static final String fuel10 	= "Cauliflower";
	public static final String fuel11 	= "Meat";
	public static final String fuel12 	= "avocado";
	public static final String fuel13 	= "rice";
	public static final String fuel14 	= "fish";
	public static final String fuel15 	= "Goetta";
	public static final String fuel16 	= "Swordfish";
	public static final String fuel17 	= "peanuts";
	public static final String fuel18 	= "garden of Life";
	public static final String fuel19 	= "Meat";
	public static final String fuel20 	= "";
	public static final String fuel21 	= "";
	public static final String hydration	=	"8 Glasses";
	public static final String electrolyte	=	"2";
	
	
	public static final String notefield1= "Hello A modern day gymnasium (as gym used to be called way back in Ancient Greece) is a place for indoor physical workout where various equipment and machines are typically used. For some people, a typical gym is a place where you focus on weight lifting and similar activities.";
	public static final String notefield2 = 	"New test this A modern day gymnasium (as gym used to be called way back in Ancient Greece) is a place for indoor physical workout where various equipment and machines are typically used. For some people, a typical gym is a place where you focus on weight lifting and similar activities.";
	public static final String notefield3 ="Lorem Are you test with automation tool";
	
	//Testdata for Case91_MS_Reminderfeature 
	public static final String Dailyfield ="Daily";
	
	//Case42_01_MSL_Perform_currentday
	public static final String activityname = "Walking";
	public static final String activitymin	=	"05";
	public static final String activityintensity	=	"Low";
	public static final String activityHrvalue	=	"60-80";
	public static final String activitydec	=	"Please Sync Scosche";
	
	public static final String activityname2 = "Judo";
	public static final String activitymin2	=	"15";
	public static final String activityintensity2	=	"High";
	public static final String activityHrvalue2	=	"100-120";
	public static final String activitydec2	=	"Please Sync Scosche";
	
	public static final String selectLp	=	"LP1R1";


}
