
public class Epifanio_MethodActivity {

    static int calculate (int num1 , int num2){
        return num1 + num2 ;
    }
    static double calculate (double num1 , double num2, char operator){
        switch (operator ){
        case '+':
            return num1 + num2;
        
        case '-':
            return num1 - num2 ;
        
        case '*' :
            return num1 * num2 ; 
        
        case '/':
            return num1 / num2 ; 
        
        default:
        return  0.0 ; 
     
        }
       
    }
  
    public static void main(String[] args) {
        System.out.println("Addition (int): "+calculate(10,5));
        System.out.println("Subtraction : "+calculate (10 , 5, '-'));
        System.out.println("Multiplication : "+calculate (20 , 2, '*'));
        System.out.println("Divition : "+calculate (20 , 3, '/'));
    }
    
}
