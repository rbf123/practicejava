public class Magic {
	public static void main(String[] args) {
    int myNumber = 8;
    //myNumber is the original number
    int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}


//setting the original number to anything between -46341 and 46340 will always result in the number 3
