public class BMI {


    public double calculateBMI(double weight,double height){
        System.out.println(weight);
        System.out.println(height);
     //   double bmi=weight/(height*height);


        double heightInMeter=height/100;
        double bmi=weight/(heightInMeter*heightInMeter);

        return bmi;




    }

    public void checkStatus(double bmi){

        String status="";
if(bmi>25){
    status="You are ovrweight";
}
else if (bmi> 18.5){
    status="You have a normal weight";



}
else {


    status="You are under weight";

}

        System.out.println("Your BMI is "+bmi +" and "+status);



    }

}
