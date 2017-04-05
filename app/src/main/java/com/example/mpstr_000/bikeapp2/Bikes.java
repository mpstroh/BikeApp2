package com.example.mpstr_000.bikeapp2;

/**
 * Created by mpstr_000 on 4/3/2017.
 */

public class Bikes {

    private String _bikeNumber;

    public Bikes(){
    }

    public Bikes(String bikeNumber){
        this._bikeNumber = bikeNumber;
    }

    public void set_bikeNumber(String _bikeNumber) {
        this._bikeNumber = _bikeNumber;
    }

    public String get_bikeNumber() {
        return _bikeNumber;
    }

}
