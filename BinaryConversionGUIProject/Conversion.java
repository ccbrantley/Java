package sample;

public class Conversion {
    public static String dec2Bin(int value){
        if (value == 1){
            return "1";
        }
        else if (value > 0){
            return Integer.toString(value%2) + dec2Bin(value/2);
        }
        else return "";
    }
    public static double bin2Dec(String binaryString){
        if (Double.parseDouble(binaryString) == 1){
            return 1;
        }
        else if (Double.parseDouble(binaryString) > 0){
            return (int)(Double.parseDouble(String.valueOf((binaryString.charAt(0)))) * Math.pow(2,binaryString.length() - 1)) + bin2Dec(binaryString.substring(1));
        }
        else return 0;
    }
    public static int hex2Dec(String hexString) {
        if (hexString.length() > 1) {
            if (Character.isAlphabetic(hexString.charAt(1))) {
                return (int)(hexAlpha2Value(hexString.charAt(1)) * Math.pow(16, hexString.length()-2)) + hex2Dec(hexString.substring(1));
            } else if (Character.isDigit(hexString.charAt(1))) {
                return (int)(Integer.parseInt(String.valueOf(hexString.charAt(1))) * Math.pow(16, hexString.length()-2)) + hex2Dec(hexString.substring(1));
            } else return 0;
        } else return 0;
    }
    public static String dec2Hex(int value){
        int currentValue;
        if (value == 1){
            return "1";
        }
        else if (value > 0){
            currentValue = value % 16;
            if (currentValue <= 9){
                return String.valueOf(currentValue) + dec2Hex(value/16);
            }
            else return hexValue2Alpha(currentValue) + dec2Hex(value/16);
        }
        else return "0";
    }
    public static int hexAlpha2Value(char alpha){
        int valueOutput = 0;
        if(Character.toUpperCase(alpha) == 'A'){ valueOutput = 10;}
        if(Character.toUpperCase(alpha) == 'B'){valueOutput = 11;}
        if(Character.toUpperCase(alpha) == 'C'){valueOutput = 12;}
        if(Character.toUpperCase(alpha) == 'D'){valueOutput = 13;}
        if(Character.toUpperCase(alpha) == 'E'){valueOutput = 14;}
        if(Character.toUpperCase(alpha) == 'F'){valueOutput = 15;}
        return valueOutput;
    }
    public static String hexValue2Alpha(int value){
        String alphaOutput = "";
        if(value == 10){alphaOutput = "A";}
        if(value == 11){alphaOutput = "B";}
        if(value == 12){alphaOutput = "C";}
        if(value == 13){alphaOutput = "D";}
        if(value == 14){alphaOutput = "E";}
        if(value == 15){alphaOutput = "F";}
        return alphaOutput;
    }
}
