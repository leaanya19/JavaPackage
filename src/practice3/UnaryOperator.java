package practice3;

public class UnaryOperator {
    //increment operator ++number
    //pre-increment ++number
    //post-increment number++
    //decrement operator --number
    //pre-decrement --number
    //post-decrement number--

    public static void main(String[] args) {
        int number=50;
        //pre-increment= ++number
        ++number; // 1+number 1+20
        System.out.println(number);

        //post-increment= number++
        //number++;
        System.out.println(number++); //number +1 for futur use for next line 51+1=52
        System.out.println(number);//52

        --number; //post increment
        System.out.println(number);//51 cuz the last value was 52,so -1+52=51
        number--;
        System.out.println(number);//50 cuz the last value is -1+number for futur use
        //next line// the sout is the futur line -1+51=50
        number--;//50for post it will hold value for next line, so it still 20
        number--;//49
        number--;//48
        --number;//46
        --number;//45
        System.out.println(number);//the result is 45

    }
}
