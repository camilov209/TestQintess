package com.example.enviromenttest;

import java.util.*;

public class ArrayPoint {

    private static List<Integer> diagonalDifference(List<List<Integer>> matrix, boolean isDiagonalRight) {
        return isDiagonalRight ? diagonalDifferenceRight(matrix) : diagonalDifferenceLeft(matrix);
    }

    private static List<Integer> diagonalDifferenceRight(List<List<Integer>> matrix) {
        List<Integer> listDiagonalDifferenceRight = new ArrayList();
        for (int x = 0; x < matrix.size(); x++) {
            for (int y = 0; y < matrix.get(x).size(); y++) {
                if(x == y) {
                    listDiagonalDifferenceRight.add(matrix.get(x).get(y));
                }
            }
        }
        return listDiagonalDifferenceRight;
    }

    private static List<Integer> diagonalDifferenceLeft(List<List<Integer>> matrix) {
        List<Integer> listDiagonalDifferenceLeft = new ArrayList();
        for (int x = matrix.size() - 1, w = 0; x >= 0; x--, w++) {
            for (int y = 0; y <= matrix.get(x).size(); y++) {
                if(y == w) {
                    listDiagonalDifferenceLeft.add(matrix.get(x).get(y));
                }
            }
        }
        Collections.reverse(listDiagonalDifferenceLeft);
        return listDiagonalDifferenceLeft;
    }

    public static void main(final String[] args) {

        final List<List<Integer>> matrix1 = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12));

        final List<List<Integer>> matrix2 = Arrays.asList(
                Arrays.asList(-1, 1, -7, -8),
                Arrays.asList(-10, -8, -5, -2),
                Arrays.asList(0, 9, 7, -1),
                Arrays.asList(4, 4, -2, 1));

        final List<List<Integer>> matrix3 = Arrays.asList(
                Arrays.asList(15, 49, -77, 31, 15, -17, -96, 80, 79, -11, -33, -95, -40, 85, 1, -84, -89, -66, 81, 38, 26, -65, -15, -19, -29, -69, 80, 51, 79, -42),
                Arrays.asList(-93, -96, 22, 41, -38, -36, 94, 96, -47, -83, -61, 13, 47, -25, -71, 74, 93, 5, 3, 23, 47, -19, 6, -53, 41, -48, -34, 39, -55, -100),
                Arrays.asList(65, -66, 19, -10, 36, 44, 55, 9, -77, -96, -48, 12, 58, 66, -78, 19, 52, -84, 87, 1, -49, 10, 82, -23, -88, -66, -34, -86, 99, -12),
                Arrays.asList(99, -32, -87, -12, 69, -58, 99, -94, 44, -93, -12, -47, -19, 23, 93, 38, -56, 13, -15, -79, -68, 82, -62, 31, -27, -40, -22, 56, -77, -69),
                Arrays.asList(31, 51, 97, -62, -85, 41, -91, 86, 33, 34, -18, 57, 22, 17, -19, 65, -87, -69, 33, 38, 12, 44, 52, -94, 57, 84, -94, 22, 20, 7),
                Arrays.asList(44, -88, -13, -46, 29, -88, 62, -39, -53, -43, 52, -1, -15, 5, 52, -99, 75, 73, 39, -77, -91, 47, -72, 40, 65, 48, -47, 20, 14, -58),
                Arrays.asList(55, 60, -87, -94, -12, 47, -66, 17, -26, -33, -46, 4, 81, -62, -67, -54, -6, 82, -4, -44, 92, -26, 4, -13, 8, 43, 9, -75, 32, 29),
                Arrays.asList(33, 36, 97, -84, 88, -24, 7, -7, 9, 13, -10, 16, 86, 68, -59, 18, -57, -51, -20, 60, 55, -93, 32, 41, -62, -65, 4, 68, -8, -32),
                Arrays.asList(-4, 85, 12, -22, 4, -84, 81, 33, 37, -10, 45, -33, -34, -99, -69, -21, 87, 83, -35, 25, 36, -79, -46, 7, 8, -22, 22, 67, -29, -84),
                Arrays.asList(-29, 75, -38, -86, 92, -92, -29, 18, -77, -1, -89, 70, 8, 64, 64, -39, 2, 16, 24, -11, 22, 60, 14, -31, -44, -26, 60, -82, -92, 59),
                Arrays.asList(92, -42, -86, 0, -18, 2, 28, -16, 25, -45, -93, -15, -67, 72, -79, -56, -79, -53, -27, 99, 11, -27, -13, -78, 38, -70, -30, 5, -80, 80),
                Arrays.asList(-62, -62, 25, -1, -47, -81, 31, 78, 34, 27, -10, 60, 37, -47, 51, 12, 42, -8, -65, -69, 77, -9, -4, 6, -77, -14, 10, -60, 66, 35),
                Arrays.asList(49, 40, -21, 46, 79, 31, 95, 14, 45, 44, 79, -50, 16, 23, -53, -85, 86, 66, 45, 90, 48, 33, -50, -38, -45, -46, 37, 65, -21, 8),
                Arrays.asList(50, -25, 26, -62, -23, -91, 51, -59, -4, 23, -46, -91, 97, -59, 74, 48, -69, 31, 2, 32, 94, 20, 67, 72, -2, -24, -1, 78, 35, 3),
                Arrays.asList(-83, -27, 30, -52, -11, 36, -3, 36, 30, 14, -33, -13, -86, -61, 22, 80, 99, -52, -76, 44, 7, 61, 25, -86, -8, 45, -70, -36, -47, 20),
                Arrays.asList(94, -46, -10, -89, 74, -48, -69, -14, -24, 34, -31, 47, 57, 34, -32, -100, -17, -53, 33, -100, -24, 35, -72, 41, -21, -58, -83, -8, 69, -61),
                Arrays.asList(-63, -91, 35, -80, 80, -53, -19, 12, 78, 67, 77, 45, -31, -35, 37, 39, 5, -87, -4, -73, -19, 58, -66, -100, -96, -62, -14, -9, -54, -8),
                Arrays.asList(54, -37, -86, -48, 4, 36, -4, -25, 1, 37, 81, 6, 8, -22, 0, -84, -82, 19, -51, 96, 40, 86, -16, -86, 90, 28, -60, -81, 21, -90),
                Arrays.asList(20, -11, 8, -40, 90, 99, -55, -42, -80, 13, 36, -73, 74, 95, -46, -54, 96, 15, -64, -6, -71, -31, 0, -11, 93, 38, -46, 67, 3, 23),
                Arrays.asList(8, -21, 50, 40, -81, 3, -13, 0, -17, 31, 43, -5, -7, 35, 68, -36, 34, -5, 1, -38, 79, 30, 36, 22, 25, -41, -1, 47, 1, 97),
                Arrays.asList(-44, -84, 29, -66, 39, -10, 38, 26, 9, -80, 28, 91, 73, -54, 37, 93, 56, -61, -80, 88, -47, 3, 74, -32, -94, 3, 97, -50, 82, -49),
                Arrays.asList(58, -11, -3, -3, 91, 53, 59, -92, 40, 60, -97, 51, 98, -56, 85, 63, 85, -34, 80, 57, 78, 7, -71, 46, 54, 35, -67, 54, -82, 45),
                Arrays.asList(-37, -18, 71, 58, -21, 33, -64, -86, -67, 82, 85, -32, -29, -12, -89, 20, 29, 92, 14, -52, -60, -32, 42, 88, -74, 72, 55, 18, 85, 79),
                Arrays.asList(92, 57, -2, 81, -87, -29, 77, -26, -93, 90, -95, -44, -24, -27, -52, -48, -45, -39, -65, -48, -86, 21, -99, 86, -68, 95, -71, -36, 75, 71),
                Arrays.asList(60, 4, -3, -8, -18, -68, -40, -71, 34, -39, -10, -93, -43, 99, 11, -84, 44, 33, -44, -75, -78, -41, 39, -50, 6, 11, -63, 36, -8, -24),
                Arrays.asList(97, 13, -4, 64, 71, 8, -4, -86, 80, -86, 62, 69, 62, 66, -59, -53, 58, -77, -93, 96, 95, -73, -70, -75, 88, 39, 12, -28, 13, 84),
                Arrays.asList(-56, 24, 91, 80, -56, -78, 60, 0, -38, -93, -65, -91, -33, -7, 49, 1, 56, 30, -43, 32, -63, -57, 35, 50, 74, -86, -66, -19, 34, 36),
                Arrays.asList(55, -46, -25, -27, 99, 71, 38, -98, 72, -81, 68, 66, 84, -14, 17, -86, 76, -36, 88, -54, 29, 33, -98, -94, -44, 79, 16, -16, 7, 53),
                Arrays.asList(-53, -34, -39, -93, -42, -79, 95, 24, 66, -94, -8, -38, -37, 45, -9, 26, 86, 75, -59, -2, -80, -61, -68, -66, -59, -41, -18, 8, 26, -24),
                Arrays.asList(72, 23, -31, -8, 70, 38, 98, 95, 97, 57, -90, -88, -89, -26, -62, 89, 67, 22, -94, 48, 33, 20, -7, -87, -94, 33, -81, 80, -64, 87));

        //IS DIAGONAL RIGHT
        System.out.println(ArrayPoint.diagonalDifference(matrix1, true));
        System.out.println(ArrayPoint.diagonalDifference(matrix2, true));
        System.out.println(ArrayPoint.diagonalDifference(matrix3, true));

        //IS DIAGONAL LEFT
        System.out.println(ArrayPoint.diagonalDifference(matrix1, false));
        System.out.println(ArrayPoint.diagonalDifference(matrix2, false));
        System.out.println(ArrayPoint.diagonalDifference(matrix3, false));
    }
}
