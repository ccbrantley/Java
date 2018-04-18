public class Conversion {
    public static void main(String [] args){
        System.out.println("Hello World");
        System.out.println(dec2Bin(9));
        System.out.println(bin2Dec("1001"));
        System.out.println(hex2Dec("0x3B9ACA00"));
        System.out.println(dec2Hex(1000000000));
    }
    public static String dec2Bin(int value){
        String binaryOutput = "";
        int powerNeeded = 1;
        int manipValue = value;
        for(int x = 0; Math.pow(2,x) < (value/2); x++){
            powerNeeded += 1;
        }
        for (int y = powerNeeded; y >= 0; y--){
            if (Math.pow(2,y) <= manipValue){
                binaryOutput += "1";
                manipValue -= Math.pow(2,y);
            }
            else{binaryOutput += "0";}
        }
        return binaryOutput;
    }

    public static int bin2Dec(String binaryString){
        int decimalOutput = 0;
        int lengthBinary = binaryString.length();
        int powerCountDown = lengthBinary - 1;
        for(int x = 0; x < lengthBinary; x++){
            if(binaryString.charAt(x) == '1'){
                decimalOutput += Math.pow(2,powerCountDown);
            }
            powerCountDown--;
        }
        return decimalOutput;
    }

    public static int hex2Dec(String hexString){
        int decimalOutput = 0;
        int hexLength = hexString.length() - 2;
        int hexPlaceValue = 0;
        int powerCountDown = hexLength - 1;
        char hexPlace;
        for (int x = 0; x < hexLength; x++){
            hexPlace = hexString.charAt(x+2);
            if(Character.isDigit(hexPlace)){
                decimalOutput += Character.getNumericValue(hexPlace) * Math.pow(16,powerCountDown);
            }
            else{decimalOutput += hexAlpha2Value(hexPlace) * Math.pow(16,powerCountDown);}
            powerCountDown--;
        }

        return decimalOutput;
    }

    public static String dec2Hex(int value){
        String hexOutput = "0x";
        int powerNeeded = 0;
        int manipValue = value;
        int computeValue = 0;
        int leftOverValue = 0;
        for (int x = 0; Math.pow(16,x) < value; x++){
            powerNeeded = x;
        }
        for(int y = powerNeeded; y >= 0; y--){
            computeValue = (int)(manipValue / Math.pow(16, y));
            if(computeValue <= 9){
                hexOutput += String.valueOf(computeValue);
            }
            else{hexOutput += hexValue2Alpha(computeValue);}
            manipValue -= computeValue * Math.pow(16,y);
        }
        return hexOutput;
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
