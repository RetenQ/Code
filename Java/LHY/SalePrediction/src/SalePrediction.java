
public class SalePrediction {

	public static void main(String[] args) {
     double x_= (230.1+44.5+17.2+151.5+180.8+8.7+57.5+120.2+8.6+199.8)/10.0;
     System.out.println("x_ ="+x_);
     
     double y_=(22.1+10.4+9.3+18.5+12.9+7.2+11.8+13.2+4.8+10.6)/10.0;
     System.out.println("y_ ="+y_);
     
     double beta1_up = (230.1-x_)*(22.1-y_)+(44.5-x_)*(10.4-y_)+(17.2-x_)*(9.3-y_)+(151.5-x_)*(18.5-y_)+(180.8-x_)*(12.9-y_)+(8.7-x_)*(7.2-y_)+(57.5-x_)*(11.8-y_)+(120.2-x_)*(13.2-y_)+(8.6-x_)*(4.8-y_)+(199.8-x_)*(10.6-y_) ;
     System.out.println("beta1_up ="+beta1_up);

     double beta1_down = (230.1-x_)*(230.1-x_)+(44.5-x_)*(44.5-x_)+(17.2-x_)*(17.2-x_)+(151.5-x_)*(151.5-x_)+(180.8-x_)*(180.8-x_)+(8.7-x_)*(8.7-x_)+(57.5-x_)*(57.5-x_)+(120.2-x_)*(120.2-x_)+(8.6-x_)*(8.6-x_)+(199.8-x_)*(199.8-x_);
     System.out.println("beta1_down ="+beta1_down);
     
     double beta1 = beta1_up/beta1_down;
     System.out.println("beta1 ="+beta1);
 
     double beta0 =y_-beta1*x_;
     System.out.println("beta0 ="+beta0);

     
     // Basic Over
     
   double sale = beta0+beta1*350;
   System.out.println("sale ="+sale  );

     
	}

}
