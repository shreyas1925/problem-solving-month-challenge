#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string timeConversion(string s)
{

    int size = s.length();

    if (s[size - 2] == 'A')
    {
        string hh = s.substr(0, 2);
        int h = stoi(hh);

        if (h == 12)
        {
            string new_hour = "00";
            string new_time = new_hour.append(s.substr(2, 6));
            return new_time;
        }
        else
        {
            return s.substr(0, size - 2);
        }
    }
    else
    {
        string hh = s.substr(0, 2);
        int h = stoi(hh);

        if (h == 12)
        {
            return s.substr(0, size - 2);
        }
        else
        {

            int new_h = h + 12;
            string new__time = to_string(new_h);
            new__time = new__time.append(s.substr(2, 6));

            return new__time;
        }
    }

    return s;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
