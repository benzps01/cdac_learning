// we have separate ".h" file so that can be shared along with ".o" file
// Hence we only declared constructors, methods in .h file
// and coded it in ".cpp" file

#include "series1.h"

namespace Series
{
    // ClassName :: Constructor()
    LinearSequence::LinearSequence(double first, double second)
    {
        current = first;
        step = second - first;
    }

    double LinearSequence::Next()
    {
        double result = current;
        current += step;
        return result;
    }

    PowerSequence::PowerSequence(double second)
    {
        current = 1;
        factor = second;
    }

    double PowerSequence::Next()
    {
        double result = current;
        current *= factor;
        return result;
    }
}