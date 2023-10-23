package dev.jerry.testing.Business;

import dev.jerry.testing.data.SomeDataService;

public class SomeBusinessImpl {

    public SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSumUsingDataService(){
        int sum =0;
        int[] data = someDataService.retrieveAllData();
        for(int value: data){
            sum+=value;
        }

        return sum;
    }

    public int calculateSum(int[] data){
        int sum =0;
        for(int value: data){
            sum+=value;
        }

        return sum;
    }
}
