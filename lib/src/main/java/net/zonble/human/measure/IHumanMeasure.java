package net.zonble.human.measure;

import javax.measure.Quantity;

public interface IHumanMeasure<T extends Quantity<T>> {
    Quantity<T> getQuantity();
}
