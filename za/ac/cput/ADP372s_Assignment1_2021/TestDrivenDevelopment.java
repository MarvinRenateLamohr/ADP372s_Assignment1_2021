package za.ac.cput.ADP372s_Assignment1_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

public class TestDrivenDevelopment {
    private String carBrand;
    private String carType;
    private String carColour;
    private int carYearModel;


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public int getCarYearModel() {
        return carYearModel;
    }

    public void setCarYearModel(int carYearModel) {
        this.carYearModel = carYearModel;
    }


    @Override
    public String toString() {
        return "TestDrivenDevelopment{" +
                "carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                ", carColour='" + carColour + '\'' +
                ", carYearModel=" + carYearModel +
                '}';
    }
}
