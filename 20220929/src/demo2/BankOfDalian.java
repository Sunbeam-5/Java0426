package demo2;

public class BankOfDalian extends Bank{
    double year;
    @Override
    public double computerInterest(){
        super.year = (int)year;
        double r = year - (int)year;
        int day = (int)(r * 100);
        double yearInterest = super.computerInterest();
        double dayInteresr = day * 0.00012 * savedMoney;
        interest = yearInterest+dayInteresr;
        System.out.printf("%d元存在大连银行%d年%d天的利息：%f元\n",savedMoney, super.year, day, interest);
        return interest;
    }
}
