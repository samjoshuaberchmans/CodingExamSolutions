package AEAlgorithm;

public class ValidStartingCity {

    public static int validStartingCity(int[] distances , int[] fuel , int mpg){
        int minimumFuelGallonsLeft=Integer.MAX_VALUE;
        int milesFromFuel = 0;
        int mileLeft = 0;
        int indexAtMinimumGallonsLeft = 0;
        int fuelLeft=0;
        for(int i = 0 ; i < distances.length ; i++){
            fuelLeft=fuel[i];
            mileLeft += (fuelLeft*mpg);
            System.out.println("Fuel - " + fuelLeft + " - Miles To Drive - " + milesFromFuel + " - mileLeft - " + mileLeft + " - Difference - " + (mileLeft-distances[i]));
            mileLeft = mileLeft-distances[i];
            System.out.println("Fuel - " + fuelLeft + " - Miles To Drive - " + milesFromFuel + " - mileLeft - " + mileLeft);
            int temp = minimumFuelGallonsLeft;
            minimumFuelGallonsLeft = Math.min(minimumFuelGallonsLeft,mileLeft);
            System.out.println("Minimum Fuel - " + minimumFuelGallonsLeft);
            if(temp != minimumFuelGallonsLeft) {
                System.out.println("Inside Temp - " + i);
                indexAtMinimumGallonsLeft = i;
            }
        }
        return indexAtMinimumGallonsLeft+1;
    }

    public static void main(String[] args){
//        int[] distances = {5,25,15,10,15};
        int[] distances = {30, 40, 10, 10, 17, 13, 50, 30, 10, 40};
//        int[] fuel = {1,2,1,0,3};
        int[] fuel = {10, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//        int mpg = 10;
        int mpg = 25;
        System.out.println("Valid Starting City - " + validStartingCity(distances,fuel,mpg));
    }
}
