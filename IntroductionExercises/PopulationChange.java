public class forever {
    public static void main(String[] args){
        double population = 312032486;
        double secondsYear = (86400) * 365;
        double birthChange = secondsYear / 7;
        double deathChange = secondsYear / 13;
        double immigrantChange = secondsYear / 45;
        double populationChange = (birthChange - deathChange) + immigrantChange;
        double year1 = population + populationChange;
        double year2 = population + populationChange * 2;
        double year3 = population + populationChange * 3;
        double year4 = population + populationChange * 4;
        double year5 = population + populationChange * 5;
        System.out.println("Year 1: " + year1);
        System.out.println("Year 2: " + year2);
        System.out.println("Year 3: " + year3);
        System.out.println("Year 4: " + year4);
        System.out.println("Year 5: " + year5);
    }
}
