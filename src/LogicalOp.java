public class LogicalOp {
    //Cerinta 3
    public int checkBiggerNumber(int first, int second){
        if (first < second){
            return second;
        } else {
            return first;
        }
    }
    //Cerinta 4
    public String verifyProvidedText(String text){
        if (text.equals("FastTrackIT")){
            return "Learning text comparison";
        }
        else return "Got to try some more";
    }

    //Cerinta 5
    public String cerinta5(String text, int number){
        if (text.equals("FastTrackIT") && number <= 3)
            return text + number;
        else if(!text.equals("FastTrackIT") && number >= 4)
            return text + number;
        else return "Not Found";
    }

    //Cerinta 6
    public String cerinta6(int b){
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm): " + b;
        }
        else {
            return "The forecast snow is(cm): " + b;
        }
    }

    //Cerinta 7

    public String cerinta7(int number){
        if (number > 4 && number != 4){
            return "The number is greater than 3 and not equal to 4";
        } else if(number == 4) {
            return "The number is equal to 4";
        } else if (number < 3){
            return "The number is lower than 3";
        } return "Not found";
    }

    //Cerinta 8

    public void cerinta8(int number){
        System.out.println(number);
        switch(number){
            case 6: System.out.println("The number is : 6!");break;
            case 12: System.out.println("The number is : 12!");break;
            case 200: System.out.println("The number is : 200!");break;
            default: System.out.println("The number is none of the above");
        }
    }

    //Cerinta 9

    public boolean isNumberEven(int number){
        if ( number %2 == 0){
            return true;
        } else return false;
    }

    //Cerinta 10

    public boolean isEligibleToVote(int number){
        if (number > 18){
            return true;
        } else return false;
    }

    //Cerinta 11


    public int cerinta11(int a , int b , int c ){
        int max = a;
        if (b > max ) {
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    //Cerinta1 tema 4

    public void count(int start){
        for (int i= start ; i<=100 ;i++){
            System.out.println(i);
        }

    }

    //Cerinta 2 tema 4
    public void countReverse(int start){
        for ( int i = start ; i>=-100; i--){
            System.out.println(i);
        }
    }

    //Cerinta 3 tema 4
    public void fromXToY(int x, int y){
        for (int i = x; i<=y; i++){
            System.out.println(i);
        }
    }

    //Cerinta 4 tema 4
    public void xOrY(int x, int y){
        if ( x > y){
            for ( int i = x; i<=y; i++){
                System.out.println(i);
            }
        } else {
            for (int i = y ; i<=x ; i++){
                System.out.println(i);
            }
        }
    }

    //Cerinta 5 tema 4
    public void par() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
     }

     //Cerinta 6 tema 4
    public void impar(){
        for (int i=1; i<=100; i++){
            if ( i%2 !=0){
                System.out.println(i);
            }
        }
    }

    //Cerinta 7 tema 4
    public void sumFromNumber(int x){
        int sum=0;
        for (int i=x; i<=100; i++){
            sum = sum+i;

        }
        System.out.println(sum);
    }
    //Cerinta 8 tema 4
    public float sumFromNumberAndMean(int x){
        float sum=0;

        for (int i=x; i<=100; i++){
            sum = sum+i;

        }
        System.out.println(sum);
        return sum/(100 - x + 1);}

    //Cerinta 9 tema 4
    public void asterisk(){
        for (int i =0; i<7; i++){
            System.out.println();
            for(int j=i; j<7;j++){
                System.out.print(" * ");
            }

        }

    }

    }


