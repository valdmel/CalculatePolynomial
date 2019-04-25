package lab01;

public class BubbleSort
{
    public void sort(Term t[])
    {
        for (int i = t.length - 1; i >= 0; i--)
        {
            for (int j = t.length - 1; j >= 1; j--)
            {
                if (t[j - 1].getExponent() > t[j].getExponent())
                {
                    swap(t, j - 1, j);
                }
            }
        }
    }

    public void swap(Term t[], int i, int j)
    {
        Term k;
        
        k = t[i];
        t[i] = t[j];
        t[j] = k;
    }
}
