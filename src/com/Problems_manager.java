package com;

public class Problems_manager {
    public double second(double x, int n){
        return second_recursion(0, x, 0, n, 1, 1, x, 1);
    }


    private double second_recursion(double res, double x, int ind, int n, int degree, long fact, double power, long cnt){
        if (ind == n){
            return res;
        }
        return second_recursion(res + degree * power / fact, x, ind + 1, n, degree * -1, fact * (cnt + 1) * (cnt + 2), power * x * x, cnt + 2);
    }
}
