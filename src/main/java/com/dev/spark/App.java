package com.dev.spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SparkSession spark  = SparkSession.builder().appName("csvReader").master("local[2]").getOrCreate();
        
        Dataset<Row> ds = spark.read().option("delimiter", ";").option("header", true).csv("/Users/devx/Desktop/text_csv.csv"); 
        
    }
}
