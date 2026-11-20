public class NameFormatter {

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {

        if(prefix==null){
           prefix="";
        }
        if (firstName == null) {
            firstName = "";
        }
        if(middleName==null){
            middleName="";
        }
        if (lastName == null) {
            lastName = "";
        }
        if(suffix==null){
            suffix="";
        }


        // Check required parameters
        if ( firstName.isEmpty()){
            throw new IllegalArgumentException("You must provide a last name");
        }
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("you must provide a last name");
        }


        // Build up results
        String result="";
        result+= lastName +", ";

        if(!prefix.isEmpty()){
            result+=prefix.trim()+". ";
        }

        result += firstName + " ";

        if (!middleName.isEmpty()) {
            result += middleName;
        }

        if (!suffix.isEmpty()) {
            result += ", " + suffix;
        }

        return result;


    }
}
