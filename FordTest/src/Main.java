public class Main {


    public static void covert(int a){
        if(a>=1 && a <=3000) {
            String result = "";
            while (a >= 1000) {
                result += "M";
                a -= 1000;
            }
            while (a >= 900) {
                result += "CM";
                a -= 900;
            }
            while (a >= 500) {
                result += "D";
                a -= 500;
            }
            while (a >= 400) {
                result += "CD";
                a -= 400;
            }
            while (a >= 100) {
                result += "C";
                a -= 100;
            }
            while (a >= 90) {
                result += "XC";
                a -= 90;
            }
            while (a >= 50) {
                result += "L";
                a -= 50;
            }
            while (a >= 40) {
                result += "XL";
                a -= 40;
            }
            while (a >= 10) {
                result += "X";
                a -= 10;
            }
            while (a >= 9) {
                result += "IX";
                a -= 9;
            }
            while (a >= 5) {
                result += "V";
                a -= 5;
            }
            while (a >= 4) {
                result += "IV";
                a -= 4;
            }
            while (a >= 1) {
                result += "I";
                a -= 1;
            }
            System.out.println(result);
        }else{
            System.out.println("Number out of length");
        }
    }

    public static void main(String[] args) {
        covert(852);
    }

}
