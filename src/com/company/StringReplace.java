package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Travis on 3/18/2017.
 */
public class StringReplace {
    public StringReplace() {
        System.out.println(stringReplace("the original, the best, the worst, the honest, the dishonest, the blue, the red, the", "the", "THE"));
        System.out.println(stringReplaceNoSplit("the original, the best, the worst, the honest, the dishonest, the blue, the red, the", "the", "THE"));
        System.out.println(stringAppendReplacement("the original, the best, the worst, the honest, the dishonest, the blue, the red, the", "the", "THE"));
    }

    public static String stringReplace(String str, String original, String newString) {
        StringBuilder sb = new StringBuilder();
        String[] strList = str.split(original);

        for (String strEle : strList) {
            sb.append(strEle);
            sb.append(newString);
        }
        if (!str.endsWith(original)) {
            return sb.substring(0, sb.length() - newString.length());
        }

        return sb.toString();
    }

    public static String stringReplaceNoSplit(String str, String original, String newString) {
        Matcher match = Pattern.compile(original, Pattern.LITERAL).matcher(str);
        StringBuilder sb = new StringBuilder(str);
        while (match.find()) {
            sb.replace(match.start(), match.end(), newString);
        }
        return sb.toString();
    }

    public static String stringAppendReplacement(String str, String original, String replacement) {
        Matcher m = Pattern.compile(original).matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, replacement);
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
