package demo1;

public class Example {
    public static void main(String[] args) {
        Chinese chinaPeople = new Chinese();
        American americanPeople = new American();
        Beijingman beijingPeople = new Beijingman();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averagerWeight();
        americanPeople.averagerWeight();
        beijingPeople.averagerWeight();
        chinaPeople.chinaKongFu();
        americanPeople.americanBoxing();
        beijingPeople.beijignOpera();
        beijingPeople.chinaKongFu();

    }
}
