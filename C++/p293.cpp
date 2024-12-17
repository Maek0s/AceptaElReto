/*
Ejercicio en AceptaElReto - P293 (Artrópodos)
Enlace: https://aceptaelreto.com/problem/statement.php?id=293
*/

#include <iostream>

using namespace std;

int main()
{
    int casos;
    
    int a, b, c, d, e;
    
    cin >> casos;
    
    while (casos-- != 0) {
        int suma = 0;
        
        cin >> a;
        cin >> b;
        cin >> c;
        cin >> d;
        cin >> e;
        
        suma += a * 6;
        suma += b * 8;
        suma += c * 10;
        suma += d * (e * 2);
        
        cout << suma << endl;
    }

    return 0;
}
