package org.ulpgc.is1.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Repair {

    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private List<Payment> paymentList;

}
