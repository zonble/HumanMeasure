package net.zonble.human.measure;

import tech.units.indriya.ComparableQuantity;
import tech.units.indriya.quantity.Quantities;

import javax.measure.Quantity;
import javax.measure.Unit;

public class Length implements IHumanMeasure<javax.measure.quantity.Length> {
    ComparableQuantity<javax.measure.quantity.Length> quantity;

    public Length(double amount, Unit<javax.measure.quantity.Length> unit) {
        this.quantity = Quantities.getQuantity(amount, unit);
    }

    @Override
    public Quantity<javax.measure.quantity.Length> getQuantity() {
        return quantity;
    }

    public static Length megameters(double amount) {
        return new Length(amount, Units.MEGAMETER);
    }

    public double getMegameter() {
        return this.quantity.to(Units.MEGAMETER).getValue().doubleValue();
    }

    public static Length kilometers(double amount) {
        return new Length(amount, Units.KILOMETER);
    }

    public double getKilometer() {
        return this.quantity.to(Units.KILOMETER).getValue().doubleValue();
    }

    public static Length hectometer(double amount) {
        return new Length(amount, Units.HECTOMETER);
    }

    public double getHectometer() {
        return this.quantity.to(Units.HECTOMETER).getValue().doubleValue();
    }

    public static Length decameter(double amount) {
        return new Length(amount, Units.DECAMETER);
    }

    public double getDecameter() {
        return this.quantity.to(Units.DECAMETER).getValue().doubleValue();
    }

    public static Length meter(double amount) {
        return new Length(amount, Units.METER);
    }

    public double getMeter() {
        return this.quantity.to(Units.METER).getValue().doubleValue();
    }

    public static Length decimeter(double amount) {
        return new Length(amount, Units.DECIMETER);
    }

    public double getDecimeter() {
        return this.quantity.to(Units.DECIMETER).getValue().doubleValue();
    }

    public static Length centimeter(double amount) {
        return new Length(amount, Units.CENTIMETER);
    }

    public double getCentimeter() {
        return this.quantity.to(Units.CENTIMETER).getValue().doubleValue();
    }

    public static Length millimeter(double amount) {
        return new Length(amount, Units.MILLIMETER);
    }

    public double getMillimeter() {
        return this.quantity.to(Units.MILLIMETER).getValue().doubleValue();
    }

    public static Length micrometer(double amount) {
        return new Length(amount, Units.MICROMETER);
    }

    public double getMicrometer() {
        return this.quantity.to(Units.MICROMETER).getValue().doubleValue();
    }

    public static Length nanometer(double amount) {
        return new Length(amount, Units.NANOMETER);
    }

    public double getNanometer() {
        return this.quantity.to(Units.NANOMETER).getValue().doubleValue();
    }

    public static Length picometer(double amount) {
        return new Length(amount, Units.PICOMETER);
    }

    public double getPicometer() {
        return this.quantity.to(Units.PICOMETER).getValue().doubleValue();
    }

    public static Length inch(double amount) {
        return new Length(amount, Units.INCH);
    }

    public double getInch() {
        return this.quantity.to(Units.INCH).getValue().doubleValue();
    }

    public static Length foot(double amount) {
        return new Length(amount, Units.FOOT);
    }

    public double getFoot() {
        return this.quantity.to(Units.FOOT).getValue().doubleValue();
    }

    public static Length yard(double amount) {
        return new Length(amount, Units.YARD);
    }

    public double getYard() {
        return this.quantity.to(Units.YARD).getValue().doubleValue();
    }

    public static Length mile(double amount) {
        return new Length(amount, Units.MILE);
    }

    public double getMile() {
        return this.quantity.to(Units.MILE).getValue().doubleValue();
    }

}
