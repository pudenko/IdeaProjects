package com.lessons.igor.ex006_obj;

public class Car {
    private boolean bvalue = true;
    private char cvalue = 'd';
    private String svalue = "Srting";
    private long lvalue = 1231234422L;
    private float fvalue = 1244124.21F;
    private double dvalue = 9873234.123;
    private byte[] bbvalue = {1, 2, 3, 4};

    public Car(String svalue, long lvalue, float fvalue) {
        this.svalue = svalue;
        this.lvalue = lvalue;
        this.fvalue = fvalue;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (bvalue ? 1 : 0);
        result = 37 * result + (int) cvalue;
        result = 37 * result + (svalue == null ? 0 : svalue.hashCode());
        result = 37 * result + (int) (lvalue ^ (lvalue >>> 32));
        result = 37 * result + Float.floatToIntBits(fvalue);
        long longBits = Double.doubleToLongBits(dvalue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : bbvalue) {
        result = result*37+(int)b;
        }

        return result;
    }
}
