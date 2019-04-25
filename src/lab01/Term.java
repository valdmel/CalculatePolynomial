package lab01;

import java.util.Random;

public class Term
{
    private int coefficient;
    private int exponent;

    public Term()
    {
        
    }
    
    public Term(int coefficient, int exponent)
    {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public int getCoefficient()
    {
        return coefficient;
    }

    public int getExponent()
    {
        return exponent;
    }

    public void setCoefficient(int coefficient)
    {
        this.coefficient= coefficient;
    }

    public void setExponent(int exponent)
    {
        this.exponent = exponent;
    }

    @Override
    public String toString()
    {
        return coefficient < 0 ? " "+ coefficient + "x^" + exponent : " + " + coefficient + "x^" + exponent;
    }

    public int calculateTerm(int x)
    {
        return (int) (coefficient * Math.pow(x, exponent));
    }

    public void generateTerm()
    {
        Random random = new Random();

        this.exponent = (random.nextInt(6));
        this.coefficient = (random.nextInt(10) - 5);
    }
}
