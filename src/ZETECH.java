import java.util.Scanner;

class Customer{
    char category_Code;//A,B,C,D,E,
    String category;
    int loan_Amount;
    int loan_Period;
    double simple_Interest;
    //constructor

    Customer(char category_code,int loan_Amount,int loan_Period){
        this.category_Code=category_code;
        this.loan_Amount=loan_Amount;
        this.loan_Period = loan_Period;
    }

//    member function
    void SimpleInterest()
    {
        if(category_Code == 'A' || category_Code == 'a'){
            category= "Youth Account Holder";
            simple_Interest= (double) (loan_Amount * 4 * loan_Period) /100;
        }else if(category_Code=='B' || category_Code == 'b'){
            category="Small Business Owner";
            simple_Interest=(double)(loan_Amount*9*loan_Period)/100;
        } else if(category_Code == 'C' || category_Code == 'c') {
            category = "Farmer";
            simple_Interest = (double) (loan_Amount * 7 * loan_Period) / 100;
        }else if(category_Code == 'D' ||category_Code == 'd') {
            category = "Civil Servant";
            simple_Interest = (double) (loan_Amount * 11 * loan_Period) / 100;
        }else if(category_Code == 'E' || category_Code == 'e') {
            category = "Corporate Owner";
            simple_Interest = (double) (loan_Amount * 14 * loan_Period) / 100;
        }else{
            System.out.println("Invalid Category code");
        }
    }


}
public class ZETECH {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Category code:");
        char code = input.next().charAt(0);
        System.out.println("Enter Loan Amount:");
        int amount = input.nextInt();
        System.out.println("Enter Loan period:");
        int time = input.nextInt();

//        create a member class variable
        Customer c1 = new Customer(code,amount,time);
        c1.SimpleInterest();
        System.out.println("Category code :"+c1.category_Code+"\n"+"Simple interest: "+ c1.simple_Interest);
    }
}
