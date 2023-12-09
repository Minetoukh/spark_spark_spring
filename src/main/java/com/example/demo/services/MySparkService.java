package com.example.demo.services;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySparkService {

    private final SparkSession sparkSession;

    @Autowired
    public MySparkService(SparkSession sparkSession) {
        this.sparkSession = sparkSession;
    }

    public void processData() {
        // Utilisation de Spark pour traiter les données
        Dataset<Row> data = sparkSession.read().csv("C:\\\\Users\\\\HP\\\\Desktop\\\\S5\\\\Architecture_SOA\\\\cv.csv");
        // ... faire des opérations Spark sur les données
        data.show();
        sparkSession.stop();
    }
}
