/*
Ejercicio en AceptaElReto - P340 (Cuadrados con cerillas)
Enlace: https://aceptaelreto.com/problem/statement.php?id=340
*/

#include <iostream>

using namespace std;

int main()
{
    int casos;
    
    cin >> casos;
    
    while (casos-- != 0) {
        int result = 0;
        int n = 0;
        int m = 0;
        
        cin >> n;
        cin >> m;
        
        if (n == 1 && m == 1) {
            result = 4;
        } else {
            result = (n * (m + 1)) + (m * (n + 1));
        }
        
        cout << result << endl;
    }

    return 0;
}
