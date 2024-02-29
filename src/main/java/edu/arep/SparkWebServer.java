package edu.arep;

import edu.arep.funciones.Calculator;
import edu.arep.funciones.Cos;
import edu.arep.funciones.Magnitude;
import edu.arep.funciones.Sin;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        staticFiles.location("/public");

        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });

        get("hello", (req,res) ->
                "Hello Docker!"
        );


        // Ruta para calcular el seno
        get("/sin/:angle", (req, res) -> {
            double angle = Double.parseDouble(req.params(":angle"));
            Calculator sinCalc = new Sin();
            return "Sin: " + sinCalc.calculate(new double[]{angle});
        });

        // Ruta para calcular el coseno
        get("/cos/:angle", (req, res) -> {
            double angle = Double.parseDouble(req.params(":angle"));
            Calculator cosCalc = new Cos();
            return "Cos: " + cosCalc.calculate(new double[]{angle});
        });

        // Ruta para calcular la magnitud de un vector
        get("/magnitude/:x/:y", (req, res) -> {
            double x = Double.parseDouble(req.params(":x"));
            double y = Double.parseDouble(req.params(":y"));
            Calculator magnitudCalc = new Magnitude();
            return "Magnitude: " + magnitudCalc.calculate(new double[]{x, y});
        });

        // Ruta para verificar si una cadena es un palíndromo (sin espacios)
        get("/palindrome/:str", (req, res) -> {
            String str = req.params(":str");
            StringBuilder sb = new StringBuilder(str);
            return "Palindrome: " + (str.contentEquals(sb.reverse()) ? "Sí" : "No :(");
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
