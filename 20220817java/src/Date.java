public class Date {
    static class Calendar{
        public int year;
        public int month;
        public int day;
        public void SetDate(int y, int m, int d){
            year = y;
            month = m;
            day = d;
        }
        public void PrintDate(){
            System.out.println(year + "/" + month +"/" + day);
        }
    }

    public static void main(String[] args) {
        Calendar d1 = new Calendar();
        Calendar d2 = new Calendar();
        Calendar d3 = new Calendar();
        d1.SetDate(2020,07,24);
        d2.SetDate(2020,11,03);
        d3.SetDate(2021,06,06);
        d1.PrintDate();
        d2.PrintDate();
        d3.PrintDate();
    }
}
