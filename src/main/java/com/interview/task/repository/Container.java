package com.interview.task.repository;

import com.interview.task.domain.Bottle;
import com.interview.task.domain.Man;

public interface Container {

    public String pour(Bottle bottle, double quantity);

}
