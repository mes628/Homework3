//Megan Shapiro, mes628@lehigh.edu
//CSE7 Homework03

//Purpose of this program is to play a round of a dice game called Yahtzee

//Main java class
class SimpleYahtzee{

    public static void main(String[] args){

        System.out.println("First Half");      //Print statement that prints, "First Half"


        //assigns each count to zero
        int count_ones = 0;
        int count_two = 0;
        int count_three = 0;
        int count_four = 0;
        int count_five = 0;
        int count_six = 0;

        int numberRolls = 6;        //declares the number of times dice needs to be rolled
        int diceNumber = 0;

        //for loop that will output 6 random numbers
        for (int x = 0; x < numberRolls; x++){                 //
            diceNumber = (int)(Math.random() * 6 + 1);     //generates a random number from 1-6
            System.out.println(diceNumber);
        
        //int diceNumber = count_ones + count_two + count_three + count_four + count_five + count_six;

        //for loop that adds one to the count when a number is rolled
        //for (int x = 0; x < diceNumber; x++){
            //int roll = diceNumber;

            if (diceNumber == 1){
                count_ones += 1;
            } else if (diceNumber == 2){
                count_two += 1;
            } else if (diceNumber == 3){
                count_three += 1;
            } else if (diceNumber == 4){
                count_four += 1;
            } else if (diceNumber == 5){
                count_five += 1;
            } else if (diceNumber == 6){
                count_six += 1;
            }

        } //closes for

    //print out the number of counts for each number
    System.out.println("Counts:");
    System.out.println("Ones:" + count_ones);
    System.out.println("Twos:" + count_two);
    System.out.println("Threes:" + count_three);
    System.out.println("Fours:" + count_four);
    System.out.println("Fives:" + count_five);
    System.out.println("Sixes:" + count_six);

    //sum of counts
    System.out.println("Sum of ones:" + count_ones);
    System.out.println("Sum of twos:" + (count_two * 2));
    System.out.println("Sum of threes:" + (count_three * 3));
    System.out.println("Sum of fours:" + (count_four * 4));
    System.out.println("Sum of fives:" + (count_five * 5));
    System.out.println("Sum of sixes:" + (count_six * 6));

    System.out.println("Second Half");

    count_ones = 3;
    //three of a kind conditions
    if (count_ones == 3) {
        System.out.print("Three of a kind ");
        System.out.println((count_ones) * 10);
    } if(count_two == 3){
        System.out.print("Three of a kind ");
        System.out.println((count_two * 2) * 10);
    } if(count_three == 3){
        System.out.print("Three of a kind ");
        System.out.println((count_three * 3) * 10);
    } if(count_four == 3){
        System.out.print("Three of a kind ");
        System.out.println((count_four * 4) * 10);
    } if(count_five == 3){
        System.out.print("Three of a kind ");
        System.out.println((count_five * 5) * 10);
    } if(count_six == 3){
        System.out.print("Three of a kind ");
        System.out.println((count_six * 6) * 10);
    }

    int three_output = 0;       //declare three_output
    int two_output = 0;         //declare two_output

    //full house conditions
    if(count_ones == 3 || count_two == 3 || count_three == 3 || count_four == 3 || count_five == 3 || count_six == 3){
        System.out.println("Hi");
        if(count_ones == 2 || count_two == 2 || count_three == 2 || count_four == 2 || count_five == 2 || count_six == 2){
            if(count_ones == 3){                        //conditions for when three of a kind is rolled
                three_output = count_ones;
            }
            if(count_two == 3){
                three_output = (count_two * 2);
            }
            if(count_three == 3){
                three_output = (count_three * 3);
            }
            if(count_four == 3){
                three_output = (count_four * 4);
            }
            if(count_five == 3){
                three_output = (count_five * 5);
            }
            if(count_six == 3){
                three_output = (count_six * 6);
            }
            if(count_ones == 2){                            //conditions for when a pair is rolled alongside three of a kind
                two_output = count_ones;
            }
            if(count_two == 2){
                two_output = (count_two * 2);
            }
            if(count_three == 2){
                two_output = (count_three * 3);
            }
            if(count_four == 2){
                two_output = (count_four * 4);
            }
            if(count_five == 2){
                two_output = (count_five * 5);
            }
            if(count_six == 2){
                two_output = (count_six * 6);
            }
            int total = ((three_output + two_output) * 100);
            System.out.println("Full house " + total);
        } //closes if    

    } //closes if

    //full straight conditions
    if(count_ones == 1 && count_two == 1 && count_three == 1 && count_four == 1 && count_five == 1 && count_six == 1){
        System.out.println("Straights " + (count_ones + (count_two * 2) + (count_three * 3) + (count_four * 4) + (count_five * 5) + (count_six * 6)) * 1000);
    }
                
    System.out.println("Done");
        
    } //closes main
}//closes class