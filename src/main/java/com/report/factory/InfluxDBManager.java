package com.report.factory;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;

public class InfluxDBManager {

    private static final InfluxDB INFLXUDB = InfluxDBFactory.connect("http://localhost:8086",
        "root", "root");
    private static final String DATABASE = "ATD";

    static {
        INFLXUDB.setDatabase(DATABASE);
    }

    public static void send(final Point point) {
        INFLXUDB.write(point);
    }

}
