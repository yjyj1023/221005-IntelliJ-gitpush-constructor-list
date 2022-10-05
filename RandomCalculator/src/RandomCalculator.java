public class RandomCalculator {

    private int randomNumber = (int)(Math.random()*9);
    private int a;

    public RandomCalculator(int a){
        this.a = a;
    }

    public void plus(){
        System.out.println(a + randomNumber);
    }

    public void minus(){
        System.out.println(a - randomNumber);
    }

    public void multiple(){
        System.out.println(a * randomNumber);
    }

    public void divide(){
        if(randomNumber != 0){
            System.out.println((float) a / randomNumber);
        }else{
            System.out.println("0으로 나누면 Error가 납니다.");
        }
        System.out.printf("랜덤한 숫자는 %d 입니다", randomNumber);
    }


}