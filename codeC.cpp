#include <iostream>
#include <vector>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{   
    std::cout << "Name? ";
    string name;
    cin >> name;
    name += " ";
    cout << name << "weight? ";
    int val;
    cin >> val;
    cout << name << "desired weight? ";
    int dval;
    cin >> dval;
    //cout << "How many times should he say it? ";
    //int count;
    //cin >> count;
    long OK = time(0);
    int y {};
    y = OK % 100;
    int p = 10;
    for (size_t i = val-100; i > dval; i = i - y)
    {
        cout << name << "went on a diet! " << endl << "He lost " << y << " pounds" << endl << "His new weight is " << i << endl;
        p++;
        long OK = time(0);
        y = OK % (p * 10);
        y = y + 2  * p;
        

    }
    cout << name << " Under " << dval << " pounds reached!";
    
    
    return 0;
}
