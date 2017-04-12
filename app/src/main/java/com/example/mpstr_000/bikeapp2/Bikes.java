package com.example.mpstr_000.bikeapp2;

/**
 * Created by mpstr_000 on 4/3/2017.
 */

public class Bikes {
    private int _id;
    private String _bikeNumber;

    public Bikes(){
    }

    public Bikes(String bikeNumber){
        this._bikeNumber = bikeNumber;
    }
    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_bikeNumber(String _bikeNumber) {
        this._bikeNumber = _bikeNumber;
    }

    public int get_id() {
        return _id;
    }

    public String get_bikeNumber() {
        return _bikeNumber;
    }

}
