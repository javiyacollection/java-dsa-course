package dsa.course.recursion2;

public class GenerateAllSubString {
    public static void main(String[] args) {
        generateAllSubString("abc", 0, "");
    }

    private static void generateAllSubString(String str, int i, String s) {
        if(i == str.length()){
            System.out.println(s);
            return;
        }
        generateAllSubString(str,i+1, s);
        generateAllSubString(str,i+1, s+str.charAt(i));
    }

}
