package com.epam.intro.subtask7;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double angleA;
    private double angleB;
    private double angleC;
    private TriangleCreationType creationType;

    private Triangle() {
    }

    private enum TriangleCreationType {
        BY_SIDES, BY_SIDES_AND_ANGLE, BY_ANGLES_AND_SIDE;
    }

    public static Triangle getTriangleBySides(double sideA, double sideB, double sideC) {
        Triangle triangle = new Triangle();
        triangle.sideA = sideA;
        triangle.sideB = sideB;
        triangle.sideC = sideC;
        triangle.creationType = TriangleCreationType.BY_SIDES;
        return triangle;
    }

    public static Triangle getTriangleBySidesAndAngle(double sideA, double sideB, double angleC) {
        Triangle triangle = new Triangle();
        triangle.sideA = sideA;
        triangle.sideB = sideB;
        triangle.angleC = angleC;
        triangle.creationType = TriangleCreationType.BY_SIDES_AND_ANGLE;
        return triangle;
    }

    public static Triangle getTriangleByAnglesAndSide(double angleA, double angleB, double sideC) {
        Triangle triangle = new Triangle();
        triangle.angleA = angleA;
        triangle.angleB = angleB;
        triangle.sideC = sideC;
        triangle.creationType = TriangleCreationType.BY_ANGLES_AND_SIDE;
        return triangle;
    }

    public double getPerimeter() {
        return switch (creationType) {
            case BY_SIDES -> sideA + sideB + sideC;
            case BY_SIDES_AND_ANGLE -> sideA
                    + sideB
                    + Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angleC));
            default -> sideC
                    + (sideC * Math.sin(angleA) / Math.sin(angleA + angleB))
                    + (sideC * Math.sin(angleB) / Math.sin(angleA + angleB));
        };
    }

    public double getSquare() {
        return switch (creationType) {
            case BY_SIDES -> Math.sqrt(getPerimeter() / 2
                    * (getPerimeter() / 2 - sideA)
                    * (getPerimeter() / 2 - sideB)
                    * (getPerimeter() / 2 - sideC));
            case BY_SIDES_AND_ANGLE -> sideA * sideB * Math.sin(angleC) / 2;
            default -> sideC * sideC * Math.sin(angleA) * Math.sin(angleB) / (Math.sin(angleA + angleB) * 2);
        };
    }

    public double getCenterOfMedians() {
        if (creationType.equals(TriangleCreationType.BY_SIDES)) {
            this.angleA = getAngleA();
        }else if (creationType.equals(TriangleCreationType.BY_SIDES_AND_ANGLE)) {
            this.sideC = Math.sqrt((sideA*sideA + sideB*sideB - (2*sideA*sideB*Math.cos(angleC))));
            this.angleA = getAngleA();
        }else {
            this.sideB = sideC*Math.sin(angleB)/Math.sin(angleA+angleB);
        }
        double median = Math.sqrt(sideC*sideC/4 + sideB*sideB - sideC*sideB*Math.cos(angleA));
        return median*2/3;
    }

    private double getAngleA() {
        return Math.acos((sideC * sideC + sideB * sideB - sideA * sideA) / (2 * sideB * sideC));
    }


}
