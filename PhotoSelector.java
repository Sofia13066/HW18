import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class PhotoSelector {

    public static String[] selectPictures(String[] pictures, String regex) {
        		int countPics = 0;
        		Pattern pattern = Pattern.compile(regex);
        		for (int i = 0; i < pictures.length; i++) {
        			Matcher matcher = pattern.matcher(pictures[i]);
        			if (matcher.find()) {
        				countPics++;
        			}
        		}
        		String[] arr = new String[countPics];
        		for (int i = 0, j = 0; j < arr.length; i++) {
        			Matcher matcher = pattern.matcher(pictures[i]);
        			if (matcher.find()) {
        				arr[j++] = pictures[i];
        			}
        		}
        		return arr;
        	}

    // static String[] allAutumnPictures(String[] pictures, String regex) {
    //     regex = "[\\]\\d{4}([0][9]|[1][0-1])";
    //     String[]  actual = PhotoSelector.selectPictures(pictures, regex);
    //     return actual;
        
    // }


    
}