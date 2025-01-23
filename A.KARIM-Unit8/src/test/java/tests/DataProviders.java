package tests;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public Object[][] dpMethod() {
        Object[][] data = new Object[2][4];

        data[0][0] = "Md Abrar Karim";
        data[0][1] = "abrar@gmail.com";
        data[0][2] = "North-Pirerbagh, Mirpur, Dhaka";
        data[0][3] = "Mirpur, Dhaka";

        data[1][0] = "Md Abrar Karim";
        data[1][1] = "abrar@gmail.com";
        data[1][2] = "North-Pirerbagh, Mirpur, Dhaka";
        data[1][3] = "Mirpur, Dhaka";

        return data;
    }
}
