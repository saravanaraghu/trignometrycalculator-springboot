package com.trignometric.rules.Ruler;

public class TrignometricRuler {


    private String trignometry;
    private double angle;

    public TrignometricRuler(String trignometry, double angle) {
        this.trignometry = trignometry;
        this.angle = angle;
    }

    public double valueAngle(){
        switch (trignometry){
            case "Sine":
                return Math.sin(Math.toRadians(angle));
            case "Cosine":
                return Math.cos(Math.toRadians(angle));
            case "Tangent":
                return Math.tan(Math.toRadians(angle));
            case "Cosecant":
                return 1/Math.sin(Math.toRadians(angle));
            case "Secant":
                return 1/Math.cos(Math.toRadians(angle));
            case "Cotangent":
                return Math.cos(Math.toRadians(angle))/Math.sin(Math.toRadians(angle));
            default:
                return 0;
        }
    }
}
