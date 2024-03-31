#include "series1.h"
#include <cstdio>
#include <cmath>

// Here we use Series, since we are outside series namespace.
// since sequence is ADT, we can only use pointer or reference(&) in the
// below function and not (Sequence seq) bcoz it will create object of Sequence
// and compiler will throw error.
double Compute(Series::Sequence *seq, int count)
{
    double sum = 0;

    for (int i = 0; i < count; ++i)
    {
        double term = seq->Next();
        sum += term * term;
    }

    return sqrt(sum / count);
}

int main(void)
{
    int n;
    printf("Number of terms: ");
    scanf("%d", &n);

    Series::LinearSequence a(2, 5);
    Series::PowerSequence b(2);

    printf("First Computation Result for Linear-sequence: %.3lf\n", Compute(&a, n));
    printf("First Computation Result for power-sequence: %.3lf\n", Compute(&b, n));
    printf("Second Computation Result for Linear-sequence: %.3lf\n", Compute(&a, n));
    printf("Second Computation Result for power-sequence: %.3lf\n", Compute(&b, n));
}