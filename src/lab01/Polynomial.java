package lab01;

public class Polynomial
{
    private int size;
    private int degree;
    private int valueOfX;
    private Term[] terms;
    
    public Polynomial()
    {
        
    }
    
    public Polynomial(int size)
    {
        this.size = size;
    }
    
    public Polynomial(int size, int valueOfX)
    {
        this.size = size;
        this.valueOfX = valueOfX;
    }

    public Polynomial(int size, int degree, int valueOfX)
    {
        this.size = size;
        this.degree = degree;
        this.valueOfX = valueOfX;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getDegree()
    {
        degree = terms[0].getExponent();

        for (int i = 1; i < terms.length; i++)
        {
            int nextDegree = terms[i].getExponent();

            if (nextDegree > degree)
            {
                degree = nextDegree;
            }
        }

        return degree;
    }

    public void setDegree(int degree)
    {
        this.degree = degree;
    }
    
    public int getValueOfX()
    {
        return valueOfX;
    }

    public void setValueOfX(int valueOfX)
    {
        this.valueOfX = valueOfX;
    }

    public Term[] getTerms()
    {
        return terms;
    }

    public void setTerms(Term[] terms)
    {
        this.terms = terms;
    }

    public void createPolynomial()
    {
        terms = new Term[size];
        
        for (int i = 0; i < size; i++)
        {
            terms[i] = new Term();
            terms[i].generateTerm();
        }
        
        BubbleSort bs = new BubbleSort();
        bs.sort(terms);
    }
    
    public int calculate()
    {
        int result = 0;
        
        for (int i = 0; i < terms.length; i++)
        {
            result += terms[i].calculateTerm(valueOfX);
        }

        return result;
    }
    
    public void printPolynomial()
    {
        for (int i = 0; i < terms.length; i++)
        {
            System.out.print(terms[i].toString());
        }
    }
}
